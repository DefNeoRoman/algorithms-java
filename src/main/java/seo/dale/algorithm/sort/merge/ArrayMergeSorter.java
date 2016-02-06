package seo.dale.algorithm.sort.merge;

import java.util.Arrays;

/**
 * O(n*log_n)
 * 합병 정렬의 시간복잡도는 O(n*log_n)이 되며, 이 것은 최악, 평균, 최고의 경우에 모두 같은 성능을 보여준다.
 * 최악의 경우의 시간복잡도가 퀵 정렬보다 우수하여 합병 정렬의 성능이 더 좋아보이지만, 실제로는 퀵 정렬의 성능이 일반적으로 우수하다.
 * 게다가 합병 정렬의 경우에는 합병하는 데 퀵 정렬보다 더 많은 공간을 필요로 하므로 메모리를 더 많이 사용하는 단점이 있다. 
 */
public class ArrayMergeSorter {
	
	public static void mergeSort(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		mergeSort(arr, left, right);
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
	
	public static void merge(int[] arr, int left, int mid, int right) {
		int[] tmp = new int[arr.length];
		
		// t : temp index, l : left index, r : right index
		int t = left, l = left, r = mid + 1;
		
		while (l <= mid && r <= right) {
			if (arr[l] == arr[r]) {
				tmp[t++] = arr[l++];
				tmp[t++] = arr[r++];
			} else if (arr[l] < arr[r]) {
				tmp[t++] = arr[l++];
			} else if (arr[l] > arr[r]) {
				tmp[t++] = arr[r++];
			}
		}
		
		while (l <= mid) {
			tmp[t++] = arr[l++];
		}
		
		while (r <= right) {
			tmp[t++] = arr[r++];
		}
		
		/*
		while (t <= right) {
			if (l > mid) {
				tmp[t++] = arr[r++];
			} else if (r > right) {
				tmp[t++] = arr[l++];
			} else if (arr[l] == arr[r]) {
				tmp[t++] = arr[l++];
				tmp[t++] = arr[r++];
			} else if (arr[l] < arr[r]) {
				tmp[t++] = arr[l++];
			} else if (arr[l] > arr[r]) {
				tmp[t++] = arr[r++];
			}
		}
		*/
		
		for (int i = left; i <= right; i++) {
			arr[i] = tmp[i];
		}
		
		System.out.printf("%d~%d %s\n", left, right, Arrays.toString(arr));
	}
}
