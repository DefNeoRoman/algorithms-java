/**
 * https://www.hackerrank.com/challenges/sherlock-and-squares
 */
package hackerrank.algorithms.SherlockAndSquares;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		while (cnt-- > 0) {
			int from = scanner.nextInt();
			int to = scanner.nextInt();

			System.out.println(solve(from, to));
		}
		scanner.close();
	}

	public static int solve(int from, int to) {
		int fromSqrt = (int) Math.ceil(Math.sqrt(from));
		int toSqrt = (int) Math.floor(Math.sqrt(to));

		return toSqrt - fromSqrt + 1;
	}

}