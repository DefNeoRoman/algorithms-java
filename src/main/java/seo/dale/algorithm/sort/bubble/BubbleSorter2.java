package seo.dale.algorithm.sort.bubble;

/**
 * BubleSorter1 보다 비효율적...
 */
public class BubbleSorter2 {

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 -i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
	
}
