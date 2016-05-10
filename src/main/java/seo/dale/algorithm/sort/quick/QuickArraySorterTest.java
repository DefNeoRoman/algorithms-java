package seo.dale.algorithm.sort.quick;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class QuickArraySorterTest {

	@Test
	public void test() {
		int[] arr = {20, 88, 0, 44, 99, 11, 33, 55, 22, 77, 66};
		QuickArraySorter.sort(arr);
		int[] sortedArr = {0, 11, 20, 22, 33, 44, 55, 66, 77, 88, 99};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortedArr));
		assertTrue(Arrays.equals(arr, sortedArr));
	}
	
	@Test
	public void test0() {
		int[] arr = {9, 5, 7, 3, 8};
		QuickArraySorter.sort(arr);
		int[] sortedArr = {3, 5, 7, 8, 9};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortedArr));
		assertTrue(Arrays.equals(arr, sortedArr));
	}
	
	@Test
	public void test1() {
		int[] arr = {2, 1};
		QuickArraySorter.sort(arr);
		
		int[] sortedArr = {1, 2};
		assertTrue(Arrays.equals(arr, sortedArr));
	}
	
	@Test
	public void test2() {
		int[] arr = {1, 2, 1};
		QuickArraySorter.sort(arr);
		
		int[] sortedArr = {1, 1, 2};
		assertTrue(Arrays.equals(arr, sortedArr));
	}

	@Test
	public void test3() {
		int[] arr = {1, 3, 2, 5, 6, 8, 7, 4};
		QuickArraySorter.sort(arr);
		
		int[] sortedArr = {1, 2, 3, 4, 5, 6, 7, 8};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortedArr));
		
		assertTrue(Arrays.equals(arr, sortedArr));
	}

}
