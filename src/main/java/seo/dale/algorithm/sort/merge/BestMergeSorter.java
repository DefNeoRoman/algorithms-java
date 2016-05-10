package seo.dale.algorithm.sort.merge;

import org.junit.Test;

import java.util.Arrays;

public class BestMergeSorter {

	public static void mergeSort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private static void sort(int[] arr, int low, int high) {
		System.out.printf("sort from %s to %s%n", low, high);
		if (low >= high) {
			return;
		}

		int mid = (low + high) / 2;
		// 선 정렬
		sort(arr, 0, mid);
		sort(arr, mid + 1, high);
		// 후 머지
		merge(arr, low, mid, high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		System.out.printf("- merge between [%s, %s] and [%s, %s]%n", low, mid, mid, high);
		int[] temp = new int[arr.length];

		int currTemp = low, currLow = low, currHigh = mid + 1;

		while (currLow <= mid && currHigh <= high) {
			if (arr[currLow] < arr[currHigh]) {
				temp[currTemp++] = arr[currLow++];
			} else if (arr[currLow] > arr[currHigh]) {
				temp[currTemp++] = arr[currHigh++];
			} else {
				temp[currTemp++] = arr[currLow++];
				temp[currTemp++] = arr[currHigh++];
			}
		}

		while (currLow <= mid) {
			temp[currTemp++] = arr[currLow++];
		}

		while (currHigh <= high) {
			temp[currTemp++] = arr[currHigh++];
		}

		for (int i = low; i <= high; i++) {
			arr[i] = temp[i];
		}
	}


	@Test
	public void test() {
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = (int) (Math.random() * 9);
		}
		System.out.println(Arrays.toString(arr));
		// Arrays.sort(arr);
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
