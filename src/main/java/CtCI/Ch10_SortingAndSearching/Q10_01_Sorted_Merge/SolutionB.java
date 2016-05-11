package CtCI.Ch10_SortingAndSearching.Q10_01_Sorted_Merge;

import org.junit.Test;

import java.util.Arrays;

/**
 * 두개의 정렬된 배열을 내림차순으로 비교해서 새로운 정렬된 배열을 만든다.
 * 임시 배열을 사용할 필요가 없어서 더욱 효율적이다.
 */
public class SolutionB {

	private static void merge(int[] arrA, int[] arrB, int offset, int size) {
		int[] arrTmp = Arrays.copyOf(arrA, offset);
		System.out.println("arrTmp : " + Arrays.toString(arrTmp));
		System.out.println("arrB : " + Arrays.toString(arrB));

		int t = 0, b = 0, a = 0;
		while (t < arrTmp.length && b < arrB.length) {
			if (arrTmp[t] < arrB[b]) {
				arrA[a++] = arrTmp[t++];
			} else {
				arrA[a++] = arrB[b++];
			}
		}

		while (t < arrTmp.length) {
			arrA[a++] = arrTmp[t++];
		}

		while (b < arrB.length) {
			arrA[a++] = arrB[b++];
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
