package array;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
	//two-pass
//	public static int[] solve(int[] input, int target){
//		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		int[] result= new int[2];
//		for(int i=0; i<input.length; i++){
//			map.put(input[i], target - input[i]);
//			arr.add(input[i]);
//		}
//		for(int i=0; i<input.length; i++){
//			int counter = map.get(input[i]);
//			if(map.containsKey(counter) && arr.lastIndexOf(counter)!=i){
//				result[0] = i;
//				result[1] = arr.lastIndexOf(counter);
//				break;
//			}
//		}
//		return result;
//	}
	//one-pass
	public static int[] solve(int[] input, int target){
		int[] result = new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i=0;i<input.length; i++){
			if(map.containsKey(target-input[i])){
				result[1] = i;
				result[0] = map.get(target-input[i]);
				return result;
			}
			map.put(input[i], i);
		}
		return result;
	}

}

