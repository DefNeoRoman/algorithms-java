package seo.dale.algorithm.comparison;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinMaxTest {

	@Test
	public void testMinMax() {
		assertEquals(1, MinMax.min(1, 2));
		assertEquals(2, MinMax.max(1, 2));
	}
	
	@Test
	public void testMinArr() {
		int[] arr = {-1, 3, -2, 2, 0, -3, 1};
		assertEquals(3, MinMax.maxArr(arr));
		
		int[] arr2 = new int[0];
		assertEquals(Integer.MIN_VALUE, MinMax.maxArr(arr2));
	}
	
	@Test
	public void testMinArrRecursion() {
		int[] arr = {-1, 3, -2, 2, 0, -3, 1};
		assertEquals(3, MinMax.maxArrRecursion(arr, 7));
	}

}
