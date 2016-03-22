package array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeSumClosestTest {

	@Test
	public void testThreeSumClosest() {
		ThreeSumClosest sol = new ThreeSumClosest();
		int[] nums = {-1,2,1,-4};
		assertEquals(2,sol.threeSumClosest(nums, 1));
	}

}
