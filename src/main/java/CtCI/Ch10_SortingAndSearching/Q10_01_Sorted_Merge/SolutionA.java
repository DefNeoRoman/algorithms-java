package CtCI.Ch10_SortingAndSearching.Q10_01_Sorted_Merge;

import org.junit.Test;

import java.util.Arrays;

/**
 * 두개의 정렬된 배열을 오름차순으로 비교해서 새로운 정렬된 배열을 만든다.
 * 임시 배열을 만들기 때문에 아쉽다.
 */
public class SolutionA {

	private static void merge(int[] arrA, int[] arrB, int lastA, int lastB) {
		int idxA = lastA - 1;
		int idxB = lastB - 1;
		int idxMerged = lastA + lastB - 1;

		while (idxA >= 0 && idxB >= 0) {
			if (arrA[idxA] > arrB[idxB]) {
				arrA[idxMerged--] = arrA[idxA--];
			} else {
				arrA[idxMerged--] = arrB[idxB--];
			}
		}

		while (idxA >= 0) {
			arrA[idxMerged--] = arrA[idxA--];
		}

		while (idxB >= 0) {
			arrA[idxMerged--] = arrB[idxB--];
		}
	}

	@Test
	public void test() {
		int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
		int[] b = {1, 4, 7, 16, 17, 17};
		merge(a, b, 8, 6);
		System.out.println(Arrays.toString(a));
	}


}
