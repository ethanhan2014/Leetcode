package string;

public class Regex {
	
	
	public boolean isMatch(String s, String p) {
	    int sL=s.length(), pL=p.length();

	    boolean[][] dp = new boolean[sL+1][pL+1];
	    dp[0][0] = true; // If s and p are "", isMathch() returns true;

	    for(int i=0; i<=sL; i++) {

	        // j starts from 1, since dp[i][0] is false when i!=0;
	        for(int j=1; j<=pL; j++) {
	            char c = p.charAt(j-1);

	            if(c != '*') {
	                // The last character of s and p should match;
	                // And, dp[i-1][j-1] is true;
	                dp[i][j] = i>0 && dp[i-1][j-1] && (c=='.' || c==s.charAt(i-1));
	            }
	            else {
	                // Two situations:
	                // (1) dp[i][j-2] is true, and there is 0 preceding element of '*';
	                // (2) The last character of s should 
	            	//  match the preceding element of '*';
	                //     And, dp[i-1][j] should be true;
	                dp[i][j] = (j>1 && dp[i][j-2]) ||
	                           (i>0 && dp[i-1][j] && (p.charAt(j-2)=='.' 
	                           || p.charAt(j-2)==s.charAt(i-1)));
	            }
	        }
	    }

	    return dp[sL][pL];
	}
	
	
	
	
//    public boolean isMatch(String s, String p) {
//        if (p.contains(".") || p.contains("*")) {
//            if (p.length() == 1 || p.charAt(1) != '*')
//                return comp(s, p, s.length(), 0) && isMatch(s.substring(1), p.substring(1));
//            for (int i = 0; i == 0 || comp(s, p, s.length(), i - 1); i++) {
//                if (isMatch(s.substring(i), p.substring(2)))
//                    return true;
//            }
//        }
//        return s.equals(p);
//    }
//
//    private boolean comp(String s, String p, int sLen, int i) {
//        return sLen > i && (p.charAt(0) == s.charAt(i) || p.charAt(0) == '.');
//    }
    
    
    
/**
 *  '.' Matches any single character.
 *	'*' Matches zero or more of the preceding element.
 * @param s
 * @param p
 * @return
 * 401 / 445 test cases passed.
 */
//	public boolean isMatch(String s, String p){
//		 int lens = s.length();
//		 int lenp = p.length();
//		 
//		 return isMatch(s, p, lens-1, lenp-1);
//		 
//	}
//	
//	private boolean isMatch(String s, String p, int end, int pend){
//		if(end < 0 && pend < 0) return true;
//		
//		if(end >= 0 && pend < 0 ) return false;
//		
//		if(end >-1 && s.charAt(end) == p.charAt(pend)){
//			return isMatch(s,p,end-1,pend-1);
//		}else if(p.charAt(pend)=='.'){
//			return isMatch(s,p,end-1,pend-1);
//		}else if(p.charAt(pend) == '*'){
//			while(end>=0 
//					&& (s.charAt(end)==p.charAt(pend-1) || p.charAt(pend-1)=='.')){
//				end--;
//			}
//			return isMatch(s,p,end,pend-2);
//		}
//		
//		return false;
//	}
}
