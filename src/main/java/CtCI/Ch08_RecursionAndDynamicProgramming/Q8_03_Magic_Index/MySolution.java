package CtCI.Ch08_RecursionAndDynamicProgramming.Q8_03_Magic_Index;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MySolution {

	@Test
	public void test() {
		int[] array = {-1, 0, 1, 2, 3, 5, 7, 8, 9, 10};
		assertEquals(5, findMagicIndex(array));
		assertEquals(5, findMagicIndex2(array));
	}

	@Test
	public void test2() {
		int[] array = {-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13};
		assertEquals(7, findMagicIndex(array));
		assertEquals(7, findMagicIndex2(array));
	}

	/**
	 * binary search : O(logN)
	 */
	public static int findMagicIndex2(int[] array) {
		return findMagicIndexRecursively(array, 0, array.length - 1);
	}

	public static int findMagicIndexRecursively(int[] array, int low, int high) {
		if (low < 0 || high >= array.length || low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		System.out.println("low = [" + low + "], mid = [" + mid + "], high = [" + high + "]");
		if (mid == array[mid]) {
			return mid;
		} else if (mid < array[mid]) {
			return findMagicIndexRecursively(array, low, mid - 1);
		} else {
			return findMagicIndexRecursively(array, mid + 1, high);
		}
	}

	/**
	 * brute force : O(N)
	 */
	public static int findMagicIndex(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " ?= " + array[i]);
			if (i == array[i]) {
				return i;
			}
		}
		return -1;
	}

}
