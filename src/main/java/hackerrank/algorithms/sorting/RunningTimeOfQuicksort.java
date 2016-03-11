package hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/quicksort4
 */
public class RunningTimeOfQuicksort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		int[] copied1 = Arrays.copyOf(array, array.length);
		InsertionSorter insertionSorter = new InsertionSorter();
		insertionSorter.sort(copied1);
		int insertionSortCount = insertionSorter.getCount();

		int[] copied2 = Arrays.copyOf(array, array.length);
		QuickSorter quickSorter = new QuickSorter();
		quickSorter.sort(copied2, 0, copied2.length - 1);
		int quickSorterSortCount = quickSorter.getCount();

		System.out.println(insertionSortCount - quickSorterSortCount);
	}


	@Test
	public void testCountInsertionSort() {
		int[] arr = {1, 3, 9, 8, 2, 7, 5};
		InsertionSorter insertionSorter = new InsertionSorter();
		insertionSorter.sort(arr);
		System.out.println("# arr : " + Arrays.toString(arr));
		System.out.println("# cnt : " + insertionSorter.getCount());
	}

	@Test
	public void testCountQuickSort() {
		int[] arr = {1, 3, 9, 8, 2, 7, 5};
		QuickSorter quickSorter = new QuickSorter();
		quickSorter.sort(arr, 0, arr.length - 1);
		System.out.println("# arr : " + Arrays.toString(arr));
		System.out.println("# cnt : " + quickSorter.getCount());
	}

	public static class InsertionSorter {

		private int count = 0;

		public void sort(int[] ar) {
			for (int i = 1; i < ar.length; i++) {
				int j = i;
				while (j > 0 && ar[j - 1] > ar[j]) {
					swap(ar, j, j - 1);
					j--;
				}
			}
		}

		private void swap(int[] arr, int i, int j) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			count++;
		}

		public int getCount() {
			return count;
		}

	}

	public static class QuickSorter {

		private int count = 0;

		public void sort(int[] arr, int lo, int hi) {
			if (lo >= hi) {
				return;
			}
			int pivotIdx = partition(arr, lo, hi);
			sort(arr, lo, pivotIdx - 1);
			sort(arr, pivotIdx + 1, hi);
		}

		private int partition(int[] arr, int lo, int hi) {
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

		private void swap(int[] arr, int i, int j) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			count++;
		}

		public int getCount() {
			return count;
		}

	}

}
