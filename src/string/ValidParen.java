package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValidParen {
    public boolean isValid(String s) {
        Map<Character,Character>map = new HashMap<Character,Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        if(s.length() == 0) return true;
        ArrayList<Character> stack = new ArrayList<Character>();
        for(int i=0; i<s.length(); i++){
        	char cur = s.charAt(i);
        	if(stack.isEmpty() && map.containsKey(cur)){
        		return false;
        	}else if(map.containsValue(cur)){
        		stack.add(cur);
        	}else{
        		char comp = stack.get(stack.size()-1);
        		if(map.get(cur) != comp){
        			return false;
        		}
        		stack.remove(stack.size()-1);
        	}
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
