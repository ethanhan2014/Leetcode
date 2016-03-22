package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c in S 
 * such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.
 * @author ziyihan
 *
 */
public class ThreeSum {
	
	public List<List<Integer>> threeSum(int[] num) {
	    Arrays.sort(num);
	    List<List<Integer>> res = new LinkedList<>(); 
	    for (int i = 0; i < num.length-2; i++) {
	        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
	            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
	            while (lo < hi) {
	                if (num[lo] + num[hi] == sum) {
	                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
	                    while (lo < hi && num[lo] == num[lo+1]) lo++;
	                    while (lo < hi && num[hi] == num[hi-1]) hi--;
	                    lo++; hi--;
	                } else if (num[lo] + num[hi] < sum) lo++;
	                else hi--;
	           }
	        }
	    }
	    return res;
	}
	
	//backtract way ... Time limit Exceeded
//	public List<List<Integer>> threeSum(int[] nums) {
//		Arrays.sort(nums);
//        Set<List<Integer>> reset = new HashSet<List<Integer>>();
//        traverse(nums,0,0,new ArrayList<Integer>(), reset);
//        List<List<Integer>> result = new ArrayList<List<Integer>>(reset);
//        return result;
//    }
//	
//	private void traverse(int[] nums, int start, int sum,
//			List<Integer> arr, Set<List<Integer>> result){
//		if(arr.size()==3 && sum == 0){
//			result.add(new ArrayList<Integer>(arr));
//		}else{
//			for(int i = start; i<nums.length;i++){
//				arr.add(nums[i]);
//				traverse(nums,i+1,sum+nums[i],arr,result);
//				arr.remove(arr.size()-1);
//			}
//		}
//	}
}
