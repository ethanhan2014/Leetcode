package string;

import java.util.HashMap;

public class lengthOfLongestSubstring {
//	public static int longestLength(String s){
//		int maxLen = 0;
//		int start = 0;
//		while(start<s.length()){
//			ArrayList<Character> arr = new ArrayList<Character>();
//			int end = start;
//			while(end<s.length()){
//				char cur = s.charAt(end);
//				if(arr.contains(cur)){
//					break;
//				}else{
//					arr.add(cur);
//					if(maxLen < arr.size()){
//						maxLen = arr.size();
//					}
//				}
//				end++;
//			}
//			if(end == s.length()) break;
//			start += arr.indexOf(s.charAt(end))+1;
//		}
//		return maxLen;
//	}
	
	public static int longestLength(String s){
		if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
	}
	
}
