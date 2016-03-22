package math;

public class ReverseInteger {
	//slower
//	public int reverse(int x){
//		if(x == 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) return 0;
//		int ab = Math.abs(x);
//	    StringBuilder sb = new StringBuilder();
//	    sb.append(ab);
//	    System.out.println(ab);
//	    long res = Long.parseLong(sb.reverse().toString());
//	    
//	    if(res>Integer.MAX_VALUE) return 0;
//	    
//	    if(res*x/ab < Integer.MIN_VALUE) return 0;
//	    
//		return x/ab*(int)res;
//	}
	public int reverse(int x)
	{
	    int result = 0;

	    while (x != 0)
	    {
	        int tail = x % 10;
	        int newResult = result * 10 + tail;
	        if ((newResult - tail) / 10 != result)
	        { return 0; }
	        result = newResult;
	        x = x / 10;
	    }

	    return result;
	}
}
