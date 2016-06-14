/**
 * Retry to solve it iteratively
 */
package algospot.TILING2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTests = scanner.nextInt();
		while (numOfTests-- > 0) {
			System.out.println(tiling(scanner.nextInt()));
		}
		scanner.close();
	}

	public static int tiling(int width) {
		if (width == 0 || width == 1) {
			return 1;
		}

		int prev2 = 1;
		int prev1 = 1;
		int result = 0;

		for (int i = 2; i <= width; i++) {
			result = prev2 + prev1;
			prev2 = prev1;
			prev1 = result % 1000000007;
		}
		return result % 1000000007;
	}

}
