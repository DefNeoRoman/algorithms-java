package hackerrank.algorithms.sorting;

import org.junit.Test;

/**
 * https://www.hackerrank.com/challenges/insertionsort1
 */
public class InsertionSortPart1 {

	public static void insertIntoSorted(int[] ar) {
		int last = ar.length - 1;
		int toInsert = ar[last];
		for (int i = ar.length - 2; i >= 0; i--) {
			if (toInsert < ar[i]) {
				ar[i + 1] = ar[i];
				printArray(ar);
				if (i == 0) {
					ar[i] = toInsert;
					printArray(ar);
				}
			} else {
				ar[i + 1] = toInsert;
				printArray(ar);
				break;
			}
		}
	}

	private static void printArray(int[] ar) {
		for (int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	@Test
	public void test() {
		// insertIntoSorted(new int[]{2, 4, 6, 8, 3});
		insertIntoSorted(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 1});
	}

}
