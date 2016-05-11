package seo.dale.algorithm.search.binary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author 서대영/Store기술개발팀/SKP
 */
public class BestArrayBinarySearcher {

	public static int searchIteratively(int[] arr, int toFind) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			System.out.printf("Search for %d from %d to %d%n", toFind, low, high);

			int mid = (low + high) / 2;
			if (arr[mid] == toFind) {
				return mid;
			}

			if (toFind < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	@Test
	public void testSearchIteratively() {
		int a[] = {1, 3, 4, 5, 10, 13, 14, 15, 22};
		assertEquals(1, searchIteratively(a, 3));
		assertEquals(3, searchIteratively(a, 5));
		assertEquals(6, searchIteratively(a, 14));
		assertEquals(-1, searchIteratively(a, 2));
		assertEquals(-1, searchIteratively(a, -1));
		assertEquals(-1, searchIteratively(a, 100));
	}

	public static int searchRecursively(int[] arr, int toFind) {
		return searchRecursively(arr, toFind, 0, arr.length - 1);
	}

	public static int searchRecursively(int[] arr, int toFind, int low, int high) {
		if (low > high) {
			return -1;
		}

		System.out.printf("Search for %d low %d high %d%n", toFind, low, high);

		int mid = (low + high) / 2;
		if (arr[mid] == toFind) {
			return mid;
		}

		if (toFind < arr[mid]) {
			return searchRecursively(arr, toFind, low, mid - 1);
		} else {
			return searchRecursively(arr, toFind, mid + 1, high);
		}
	}
	
	@Test
	public void testSearchRecursively() {
		int a[] = {1, 3, 4, 5, 10, 13, 14, 15, 22};
		assertEquals(1, searchRecursively(a, 3));
		assertEquals(3, searchRecursively(a, 5));
		assertEquals(6, searchRecursively(a, 14));
		assertEquals(-1, searchRecursively(a, 2));
		assertEquals(-1, searchRecursively(a, -1));
		assertEquals(-1, searchRecursively(a, 100));
	}

}
