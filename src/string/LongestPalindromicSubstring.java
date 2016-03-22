package string;

//Dynamic Programming
public class LongestPalindromicSubstring {
	public String longestPalindrome(String s){
		
		int maxLen = 0, lo = 0;
		
		int len = s.length();
		
		if(len<2) return s;
		
		boolean [][] map = new boolean[len][len];
		
		for(int i=0; i<len; i++){
			for(int j =0; j<i; j++){
				if(s.charAt(i) == s.charAt(j) 
						&& (i-j<2 || map[j+1][i-1])){
					map[j][i] = true;
				}
				
				if(map[j][i] && maxLen < (i-j+1)){
					maxLen = i-j+1;
					lo = j;
				}
			}
			map[i][i] = true;
		}
		
		return s.substring(lo, lo+maxLen);
	}
	
	//faster solution
//	public String longestPalindrome(String s) {
//	    char[] ca = s.toCharArray();
//	    int rs = 0, re = 0;
//	    int max = 0;
//	    for(int i = 0; i < ca.length; i++) {
//	        if(isPalindrome(ca, i - max - 1, i)) {
//	            rs = i - max - 1; re = i;
//	            max += 2;
//	        } else if(isPalindrome(ca, i - max, i)) {
//	            rs = i - max; re = i;
//	            max += 1;
//	        }
//	    }
//	    return s.substring(rs, re + 1);
//	}
//
//	private boolean isPalindrome(char[] ca, int s, int e) {
//	    if(s < 0) return false;
//
//	    while(s < e) {
//	        if(ca[s++] != ca[e--]) return false;
//	    }
//	    return true;
//	}
}
