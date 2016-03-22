package string;

import java.util.HashMap;

public class RomantoInteger {
	public int romanToInt(String s) {
		int res = 0;
		int prev = 4000;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);
		
		for(int i = 0; i<s.length(); i++){
			int val = map.get(s.charAt(i));
			if(prev >= val){
				res += val;
				prev = val;
			}else{
				res = res + val - 2*prev;
				prev = val;
			}
		}
        return res;
    }
}
