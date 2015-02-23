package seo.dale.algorithm.sort;

import java.util.Arrays;

/**
 * O(n*log_n)
 * 퀵 정렬은퀵이란 단어에서 알 수 있듯이 매우 빠르고 효율적인 정렬이다.
 * 최고의 경우 O(n*log_n), 최악의 경우에는 O(n^2)의 시간을 필요로 하며, 평균복잡도는 O(n*log_n)이 된다는 것을 알 수 있다.
 */
public class QuickSorter {

	public static void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}
	
	public static void sort(int[] arr, int start, int end) {
		System.out.printf("-call sort(%s, %d, %d);\n", Arrays.toString(arr), start, end);
		if (start >= end) {
			return;
		}
		
		int pivot = start;
		for (int i = start + 1; i <= end; i++) {
			if (arr[start] > arr[i]) {
				swap(arr, ++pivot, i);
			}
		}
		swap(arr, start, pivot);
		sort(arr, start, pivot - 1);
		sort(arr, pivot + 1, end);
	}
	
	public static void swap(int[] arr, int i, int j) {
		SortUtils.swap(arr, i, j);
	}
	
}
