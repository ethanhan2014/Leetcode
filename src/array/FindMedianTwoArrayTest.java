package array;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMedianTwoArrayTest {

	@Test
	public void testFindMedian() {
		FindMedianTwoArray sol = new FindMedianTwoArray();
		int[] nums1 = new int[]{1,2,3,4,5};
		int[] nums2 = new int[]{6,7,8,9,10,11};
		assertEquals(6,sol.findMedian(nums1, nums2), 0);
		int[] nums3 = new int[]{1,3,5,7,9};
		int[] nums4 = new int[]{2,4,6,8,10};
		assertEquals(5.5,sol.findMedian(nums3, nums4), 0);
	}

}
