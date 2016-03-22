package array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainerWithMostWaterTest {

	@Test
	public void testMaxArea() {
		ContainerWithMostWater sol = new ContainerWithMostWater();
		int[] arr1 = {0};
		assertEquals(0,sol.maxArea(arr1));
		int[] arr2 = {5,5,5};
		assertEquals(10,sol.maxArea(arr2));
		int[] arr3 = {6,4,6};
		assertEquals(12,sol.maxArea(arr3));
		int[] arr4 = {5,20,5};
		assertEquals(10,sol.maxArea(arr4));
		int[] arr5 = {9,4,1,5,11};
		assertEquals(36,sol.maxArea(arr5));
		int[] arr6 = {5,4,3,2,1,0,1,2,3,4,5};
		assertEquals(50,sol.maxArea(arr6));
		int[] arr7 = {1,2,3,4,5,4,3,2,1};
		assertEquals(12,sol.maxArea(arr7));
	}

}
