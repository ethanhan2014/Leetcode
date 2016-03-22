package string;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
	    if(strs == null || strs.length == 0)    return "";
	    String pre = strs[0];
	    int i = 1;
	    while(i < strs.length){
	        while(strs[i].indexOf(pre) != 0){
	            pre = pre.substring(0,pre.length()-1);
	        }
	        i++;
	    }
	    return pre;
	}
	
//	public String longestCommonPrefix(String[] strs) {
//		if(strs.length < 1) return "";
//		String result = strs[0];
//		int end = result.length();
//		if(end < 0) return result;
//		for(int i=1; i<strs.length; i++){
//			String word = strs[i];
//			for(int j=0; j<Math.min(word.length(), end);j++){
//				if(result.charAt(j)!=word.charAt(j)){
//					end = j;
//					break;
//				}
//			}
//			if(end==0){
//				return "";
//			}
//		}
//		return result.substring(0,end);
//    }
}
