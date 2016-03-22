package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a digit string, return all possible letter combinations 
 * that the number could represent. A mapping of digit to letters 
 * (just like on the telephone buttons) is given below.
 * @author ziyihan
 *
 */
public class LetterCombinations {
	public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        Map<Character,Character[]> map = new HashMap<Character,Character[]>();
        map.put('0', null);
        map.put('1', null);
        map.put('2', new Character[]{'a','b','c'});
        map.put('3', new Character[]{'d','e','f'});
        map.put('4', new Character[]{'g','h','i'});
        map.put('5', new Character[]{'j','k','l'});
        map.put('6', new Character[]{'m','n','o'});
        map.put('7', new Character[]{'p','q','r','s'});
        map.put('8', new Character[]{'t','u','v'});
        map.put('9', new Character[]{'w','x','y','z'});
        backtrack(digits, 0, map, new StringBuilder(), result);
        return result;
    }
	
	private void backtrack(String digits, int pos, Map<Character,Character[]> map,
			StringBuilder sb, List<String> result){
		if(pos == digits.length()){
			if(sb.length() != 0) result.add(sb.toString());
		}else if(digits.charAt(pos)-'0' <= 1){
			backtrack(digits, pos+1, map, sb, result);
		}else{
			for(char c : map.get(digits.charAt(pos))){
				sb.append(c);
				backtrack(digits, pos+1, map, sb, result);
				sb.deleteCharAt(sb.length()-1);
			}
		}
	}
	
//  public List<String> letterCombinations(String digits) {
//    LinkedList<String> ans = new LinkedList<String>();
//    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//    ans.add("");
//    for(int i =0; i<digits.length();i++){
//        int x = Character.getNumericValue(digits.charAt(i));
//        while(ans.peek().length()==i){
//            String t = ans.remove();
//            for(char s : mapping[x].toCharArray())
//                ans.add(t+s);
//        }
//    }
//    return ans;
//  }
}
