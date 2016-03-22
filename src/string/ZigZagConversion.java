package string;

public class ZigZagConversion {
	
//	public String convert(String s, int numRows){
//		if(numRows == 1) return s;   //corner cases
//		if(s.length() == 0) return s;
//		String[] result = new String[numRows];
//		for(int i=0;i<numRows; i++){
//			result[i] = "";
//		}
//		
//		int rnd = numRows+numRows-2;
//		for(int i =0; i<s.length();i++){
//			int pos = i%rnd;
//			if(pos<numRows){
//				result[pos] += s.charAt(i);
//			}else{
//				result[2*numRows-pos-2] += s.charAt(i);
//			}
//		}
//		
//		String res = "";
//		for(int i=0;i<numRows;i++){
//			res += result[i];
//		}
//		
//		return res;
//	}
	
	public String convert(String s, int nRows) {
	    char[] c = s.toCharArray();
	    int len = c.length;
	    StringBuffer[] sb = new StringBuffer[nRows];
	    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

	    int i = 0;
	    while (i < len) {
	        for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
	            sb[idx].append(c[i++]);
	        for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
	            sb[idx].append(c[i++]);
	    }
	    for (int idx = 1; idx < sb.length; idx++)
	        sb[0].append(sb[idx]);
	    return sb[0].toString();
	}
}
