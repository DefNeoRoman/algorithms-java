package seo.dale.algorithm.dynamic.largestSquare;

/**
 * 2D Array 대신에 1D Array 사용
 * Time complexity : O(mn)O(mn). Single pass.
 * Space complexity : O(n)O(n). Another array which stores elements in a row is used for dp.
 */
public class Solution3 {

	public int findLargestSquare(char[][] matrix) {
		int height = matrix.length;
		int width = height > 0 ? matrix[0].length : 0;
		int[] dp = new int[width + 1];

		int maxSize = 0, prev = 0;
		for (int row = 1; row <= height; row++) {
			for (int col = 1; col <= width; col++) {
				int temp = dp[col];
				if (matrix[row - 1][col - 1] == 'X') {
					dp[col] = 0;
				} else {
					int a = prev, b = dp[col - 1], c = dp[col];
					dp[col] = Math.min(Math.min(a, b), c) + 1;
					maxSize = Math.max(maxSize, dp[col]);
				}
				prev = temp;
			}
		}
		return maxSize * maxSize;
	}

}
