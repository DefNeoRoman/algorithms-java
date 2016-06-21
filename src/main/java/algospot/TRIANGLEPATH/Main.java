/**
 * https://www.algospot.com/judge/problem/read/TRIANGLEPATH
 * Recursion과 Memoization 활용 (수행 시간 : 765ms)
 */
package algospot.TRIANGLEPATH;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static int[][] triangle;
	private static int[][] memo;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		while (count-- > 0) {
			int height = scanner.nextInt();
			scanner.nextLine();
			String[] lines = new String[height];
			for (int level = 0; level < height; level++) {
				lines[level] = scanner.nextLine();
			}

			init(lines);

			System.out.println(trianglepath(0, 0));
		}
		scanner.close();
	}

	public static void init(String[] lines) {
		triangle = new int[lines.length][];
		for (int row = 0 ; row < lines.length; row++) {
			String[] tokens = lines[row].split("[\\s]+");
			int[] nums = new int[tokens.length];
			for (int col = 0; col < tokens.length; col++) {
				nums[col] = Integer.parseInt(tokens[col]);
			}
			triangle[row] = nums;
		}

		memo = new int[lines.length - 1][];
		for (int row = 0; row < memo.length; row++) {
			memo[row] = new int[row + 1];
			Arrays.fill(memo[row], -1);
		}
	}

	public static int trianglepath(int row, int col) {
		// bottom line (base case)
		if (row == triangle.length - 1) {
			return triangle[row][col];
		}

		if (memo[row][col] == -1) {
			int greaterLowerSum = Math.max(trianglepath(row + 1, col), trianglepath(row + 1, col + 1));
			int maxSum = triangle[row][col] + greaterLowerSum;
			memo[row][col] = maxSum;
		}

		return memo[row][col];
	}

}
