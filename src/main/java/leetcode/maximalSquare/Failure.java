package leetcode.maximalSquare;

import java.util.Arrays;

public class Failure {

	public int maximalSquare(char[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return 0;

		int height = matrix.length;
		int width = matrix[0].length;

		for (int i = 0; i < height; i++) {
			char[] row = matrix[i];
			char size = '0';
			for (int j = width - 1; j > -1; j--) {
				if (row[j] == '1') {
					row[j] = ++size;
				} else {
					size = '0';
				}
			}
		}

		for (char[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}

		int max = 0;
		for (int i = 0; i < height; i++) {
			char[] row = matrix[i];
			for (int j = 0; j < width; j++) {
				int size = row[j];
				int colSize = 1;
				while (colSize < size) {

				}
			}
		}

		return max;
	}

	public void doSthAt(int row, int col, char[][] matrix) {

	}

}
