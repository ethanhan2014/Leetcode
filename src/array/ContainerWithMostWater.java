package array;

/**
 * Given n non-negative integers a1, a2, ..., an, 
 * where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at
 *  (i, ai) and (i, 0). Find two lines, which together with x-axis forms 
 *  a container, 
 * such that the container contains the most water.
 * @author ziyihan
 *
 */
public class ContainerWithMostWater {
//	public int maxArea(int[] height) {
//		int maxArea = 0;
//		for(int i = 0; i<height.length-1; i++){
//			for(int j = i+1; j<height.length;j++){
//				int area = Math.min(height[i], height[j])*(j-i);
//				if(area > maxArea){
//					maxArea = area;
//				}
//			}
//		}
//		return maxArea;
//    }
	public int maxArea(int[] height) {
	    int left = 0, right = height.length - 1;
	    int maxArea = 0;

	    while (left < right) {
	        maxArea = Math.max(maxArea, Math.min(height[left], height[right])
	                * (right - left));
	        if (height[left] < height[right])
	            left++;
	        else
	            right--;
	    }

	    return maxArea;
	}
}

