/**
 * https://www.algospot.com/judge/problem/read/MAXSUM
 * https://en.wikipedia.org/wiki/Maximum_subarray_problem#Kadane.27s_algorithm
 */
package algospot.greedy.MAXSUM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int count = scanner.nextInt();
			for (int i = 0; i < count; i++) {
				int length = scanner.nextInt();
				int[] array = new int[length];
				for (int j = 0; j < length; j++) {
					array[j] = scanner.nextInt();
				}
				System.out.println(maxsum(array));
			}
		}
	}

	public static int maxsum(int[] array) {
		int maxEndingHere = 0, maxSoFar = 0;
		for (int n : array) {
			maxEndingHere = Math.max(0, maxEndingHere + n);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
			// System.out.printf("%d => maxEndingHere : %d, maxSoFar : %d%n", n, maxEndingHere, maxSoFar);
		}
		return maxSoFar;
	}

}
