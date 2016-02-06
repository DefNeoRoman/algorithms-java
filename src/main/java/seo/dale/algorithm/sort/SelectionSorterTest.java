package seo.dale.algorithm.sort;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSorterTest {

	@Test
	public void test() {
		int[] arr = {9, 5, 7, 3, 8};
		SelectionSorter.sort(arr);
		int[] sortedArr = {3, 5, 7, 8, 9};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortedArr));
		assertTrue(Arrays.equals(arr, sortedArr));
	}

}
