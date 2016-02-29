package hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/quicksort3
 */
public class QuickSort3InPlace {

	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int pivotIdx = partition(arr, lo, hi);
		printSubArray(arr);
		quickSort(arr, lo, pivotIdx - 1);
		quickSort(arr, pivotIdx + 1, hi);
	}

	private static int partition(int[] arr, int lo, int hi) {
		int pivot = arr[hi];
		int pivotIdx = lo;
		for (int i = lo; i < hi; i++) {
			if (arr[i] < pivot) {
				swap(arr, pivotIdx++, i);
			}
		}
		swap(arr, pivotIdx, hi);
		return pivotIdx;
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	private static void printSubArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		quickSort(array, 0, n - 1);
	}

	@Test
	public void testQuickSort() {
		int[] array = new int[]{1, 3, 9, 8, 2, 7, 5};
		quickSort(array, 0, array.length - 1);
		int[] expected = new int[]{1, 2, 3, 5, 7, 8, 9};
		assertArrayEquals(expected, array);
	}

	@Test
	public void testPartiton() {
		int[] array = new int[]{1, 3, 9, 8, 2, 7, 5};
		int pivotIdx = partition(array, 0, array.length - 1);
		assertEquals(3, pivotIdx);
	}

}
