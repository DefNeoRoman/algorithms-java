package seo.dale.algorithm.sort.bubble.ctci;

import seo.dale.algorithm.sort.SortUtils;

import java.util.Arrays;

public class BubbleSort2 {

	public static void sort(int[] array) {
		int end = array.length - 1;
		while (end > 0) {
			System.out.println("array: " + Arrays.toString(array));
			System.out.println("end: " + end);
			int last = 0;
			for (int i = 0; i < end; i++) {
				if (array[i] > array[i + 1]) {
					SortUtils.swap(array, i, i + 1);
					last = i;
				}
			}
			end = last;
		}
	}

}
