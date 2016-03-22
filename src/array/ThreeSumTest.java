package array;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ThreeSumTest {

	@Test
	public void testThreeSum() {
		ThreeSum sol = new ThreeSum();
		int[] num1 = {-1,0,1,2,-1,-4};
		List<List<Integer>> res1 = new ArrayList<List<Integer>>();
		List<Integer> arr11 = Arrays.asList(-1,0,1);
		List<Integer> arr12 = Arrays.asList(-1,-1,2);
		res1.add(arr12);
		res1.add(arr11);
		assertEquals(res1,sol.threeSum(num1));
	}

}
