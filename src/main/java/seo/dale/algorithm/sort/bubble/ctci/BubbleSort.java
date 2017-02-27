package seo.dale.algorithm.sort.bubble.ctci;

import seo.dale.algorithm.sort.SortUtils;

public class BubbleSort {

	public static void sort(int[] array) {
		boolean isSorted = false;
		int lastUnsortedAt = array.length - 1;
		while (!isSorted) {
//			System.out.println("array: " + Arrays.toString(array));
//			System.out.println("lastUnsortedAt: " + lastUnsortedAt);
			isSorted = true;
			for (int i = 0; i < lastUnsortedAt; i++) {
				if (array[i] > array[i + 1]) {
					SortUtils.swap(array, i, i + 1);
					isSorted = false;
				}
			}
			lastUnsortedAt--;
		}
	}

}
