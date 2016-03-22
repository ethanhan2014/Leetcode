package array;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void testSolve() {
		int[] input1 = {2,7,11,15};
		int target1 = 9;
		int[] res1 = {0,1};
		System.out.println(Arrays.toString(TwoSum.solve(input1, target1)));
		assertTrue(Arrays.equals(res1, TwoSum.solve(input1, target1)));
		int[] input2 = {3,2,4};
		int target2 = 6;
		int[] res2 = {1,2};
		assertTrue(Arrays.equals(res2, TwoSum.solve(input2, target2)));
		int[] input3 = {8,4,4,4,4};
		int target3 = 8;
		int[] res3 = {1,2};
		assertTrue(Arrays.equals(res3, TwoSum.solve(input3, target3)));
	}

}
