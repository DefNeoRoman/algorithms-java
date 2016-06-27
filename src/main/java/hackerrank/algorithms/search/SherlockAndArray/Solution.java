/**
 * https://www.hackerrank.com/challenges/sherlock-and-array
 */
package hackerrank.algorithms.search.SherlockAndArray;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		while (cnt-- > 0) {
			int length = scanner.nextInt();
			int[] array = new int[length];
			for (int i = 0; i < length; i++) {
				array[i] = scanner.nextInt();
			}
			System.out.println(solve(array) ? "YES" : "NO");
		}
		scanner.close();
	}

	public static boolean solve(int[] array) {
		int leftSum = 0;
		int rightSum = 0;
		for (int n : array) {
			rightSum += n;
		}
		int previous = 0;

		for (int n : array) {
			leftSum += previous;
			rightSum -= n;
			if (leftSum == rightSum) {
				return true;
			}
			previous = n;
		}
		return false;
	}

}
