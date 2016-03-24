package array;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FourSumTest {

	@Test
	public void testFourSum() {
		FourSum sol = new FourSum();
		int[] nums = {1,0,-1,0,-2,2};
		List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
		ans1.add(Arrays.asList(-2,-1,1,2));
		ans1.add(Arrays.asList(-2,0,0,2));
		ans1.add(Arrays.asList(-1,0,0,1));
		assertEquals(ans1,sol.fourSum(nums, 0));
	}

}
