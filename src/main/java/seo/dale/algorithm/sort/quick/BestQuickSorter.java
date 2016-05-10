package seo.dale.algorithm.sort.quick;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 1) 피벗보다 우선순위가 낮은 값이 나올 때까지 low를 오른쪽으로 이동한다.
 2) 피벗보다 우선순위가 높은 값이 나올 때까지 high를 왼쪽으로 이동한다.
 3-1) 만약, low와 high가 교차되었다면, 피벗의 값과 high가 가리키는 값을 교환한다.
 3-2) 그렇지 않다면, low와 high가 가리키는 값을 서로 바꾼다.
 */
public class BestQuickSorter {

	public static void quickSort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private static void sort(int[] arr, int left, int right) {
		System.out.printf("sort form %s to %s with %s%n", left, right, Arrays.toString(arr));
		if (left >= right) {
			return;
		}

		// 선 분리
		int mid = partition(arr, left, right);
		System.out.printf("mid : %s, arr : %s%n", mid, Arrays.toString(arr));
		// 후 정렬
		sort(arr, left, mid - 1);
		sort(arr, mid + 1, right);

	}

	private static int partition(int[] arr, int left, int right) {
		System.out.printf("partition form %s to %s%n", left, right);

		// 피벗을 가장 왼쪽에 있는 값으로 선택함 (피벗 선택 전략은 바뀔 수 있음)
		int pivot = left;
		// low 위치는 left 보다 한 칸 오른쪽
		int low = left + 1;
		// high 위치는 right 위치와 동일
		int high = right;

		// low 인덱스와 high 인덱스가 교차되기 전까지,
		while (low <= high) {
			// low 인덱스는 피벗보다 큰 값이 나올 때까지 오른쪽으로 이동한다.
			while (arr[low] <= arr[pivot]) {
				low++;
			}

			// high 인덱스는 피벗보다 작은 값을 나올 때까지 왼쪽으로 이동한다.
			while (arr[high] > arr[pivot]) {
				high--;
			}

			// low 인덱스와 high 인덱스가 가리키는 값을 서로 바꾼다.
			if (low < high) {
				swap(arr, low, high);
			}
		}
		// high 인덱스와 pivot 인덱스가 가리키는 값을 서로 바꾼다.
		swap(arr, high, pivot);

		return high;
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		// System.out.printf("- swap %s and %s => %s%n", i, j, Arrays.toString(arr));
	}

	@Test
	public void test() {
		int[] arr = {4, 2, 1, 3, 5, 6, 7, 9, 8, 5};
		BestQuickSorter.quickSort(arr);
		int[] sortedArr = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortedArr));
		assertTrue(Arrays.equals(arr, sortedArr));
	}

}
