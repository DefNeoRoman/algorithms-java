/**
 * https://www.algospot.com/judge/problem/read/STRJOIN
 */
package algospot.STRJOIN;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		while (cnt-- > 0) {
			int length = scanner.nextInt();
			int[] array = new int[length];
			for (int i = 0; i < length; i++) {
				array[i] = scanner.nextInt();
			}
			System.out.println(strjoin(array));
		}
	}

	public static int strjoin(int[] array) {
		// Nothing to join
		if (array.length <= 0) {
			return 0;
		}

		Arrays.sort(array);

		int finalSum = 0;
		int previousSum = array[0];
		for (int i = 1; i < array.length; i++) {
			finalSum = previousSum + array[i];
			previousSum += array[i];
		}

		return finalSum;
	}

}
