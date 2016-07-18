package leetcode.maximalSquare;

public class Solution {

	private Integer[][] memo;

	public int maximalSquare(char[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return 0;

		int height = matrix.length;
		int width = matrix[0].length;

		memo = new Integer[height][width];

		int maxSoFar = 0;

		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				int maxNow = maximalSquareAt(row, col, matrix);
				// System.out.printf("%d, %d => %d%n", row, col, maxNow);
				maxSoFar = Math.max(maxSoFar, maxNow);
			}
		}

		return maxSoFar * maxSoFar;
	}

	private int maximalSquareAt(int row, int col, char[][] matrix) {
		if (row < 0 || col < 0)
			return 0;

		if (memo[row][col] != null)
			return memo[row][col];

		if (matrix[row][col] == '0')
			return memo[row][col] = 0;

		// matrix[row][col] == '1'
		int left = maximalSquareAt(row, col - 1, matrix);
		int up = maximalSquareAt(row - 1, col, matrix);
		int leftUp = maximalSquareAt(row - 1, col - 1, matrix);

		int min = Math.min(left, up);
		min = Math.min(min, leftUp);

		return memo[row][col] = min + 1;
	}

}
