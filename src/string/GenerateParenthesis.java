package string;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	public List<String> generateParenthesis(int n) {
		List<String> result= new ArrayList<String>();
        backtrack(n,n,new StringBuilder(), result);
        return result;
    }
	
	private void backtrack(int left, int right, StringBuilder sb, List<String> ls){
		if(left==0 && right == 0){
			ls.add(sb.toString());
		}else{
			if(left!=0){
				sb.append('(');
				backtrack(left-1, right, sb, ls);
				sb.deleteCharAt(sb.length()-1);
			}
			if(left<right){
				sb.append(')');
				backtrack(left, right-1, sb, ls);
				sb.deleteCharAt(sb.length()-1);
			}
		}
	}
}
