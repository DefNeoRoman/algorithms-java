package hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/countingsort2
 */
public class CountingSort2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();

		String[] ar = new String[s];
		for(int i=0;i<s;i++){
			ar[i] = in.next();
		}

		int[] counts = countAppearance(ar);

		for (int i = 0; i < counts.length; i++) {
			if (counts[i] == 0) {
				continue;
			}

			for (int j = 0; j < counts[i]; j++) {
				System.out.print(i + " ");
			}
		}
	}

	public static int[] countAppearance(String[] array) {
		int[] counts = new int[100];
		for (int i = 0; i < array.length; i++) {
			int num = Integer.parseInt(array[i]);
			counts[num] = counts[num] + 1;
		}
		return counts;
	}

	@Test
	public void test() {
		String input = "63 25 73 1 98 73 56 84 86 57 16 83 8 25 81 56 9 53 98 67 99 12 83 89 80 91 39 86 76 85 74 39 25 90 59 10 94 32 44 3 89 30 27 79 46 96 27 32 18 21 92 69 81 40 40 34 68 78 24 87 42 69 23 41 78 22 6 90 99 89 50 30 20 1 43 3 70 95 33 46 44 9 69 48 33 60 65 16 82 67 61 32 21 79 75 75 13 87 70 33";
		String[] array = input.split(" ");
		int[] counts = countAppearance(array);

		for (int i = 0; i < counts.length; i++) {
			if (counts[i] == 0) {
				continue;
			}

			for (int j = 0; j < counts[i]; j++) {
				System.out.print(i + " ");
			}
		}
	}

}
