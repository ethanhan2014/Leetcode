package math;

public class StringtoInteger {
//	public int myAtoi(String str){
//		long res = 0;
//		String s = str.trim();
//		char[] arr = s.toCharArray();
//		boolean flag = false;
//		int count = 0;
//		for(int i=0; i<arr.length; i++){
//			if(Character.isDigit(arr[i])){
//				res  = res *10 + (arr[i]-'0');
//			}else{
//				if(arr[i]=='+' && count==0){
//					count++;
//				}else if(arr[i]=='-' && count ==0){
//					flag =true;
//					count++;
//				}else{
//					return 0;
//				}
//			}
//			
//		}
//		if(flag) res*= -1;
//		if(res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
//		if(res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
//		return (int)res;
//	}
	
	public int myAtoi(String str) {
	    if (str.isEmpty()) return 0;
	    int sign = 1, base = 0, i = 0;
	    while (str.charAt(i) == ' ')
	        i++;
	    if (str.charAt(i) == '-' || str.charAt(i) == '+')
	        sign = str.charAt(i++) == '-' ? -1 : 1;
	    while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
	        if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
	            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	        }
	        base = 10 * base + (str.charAt(i++) - '0');
	    }
	    return base * sign;
	}
}
