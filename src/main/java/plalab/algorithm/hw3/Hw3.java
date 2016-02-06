package plalab.algorithm.hw3;

public class Hw3 {

	public static int maxSubMatrixDaleSeo(int[][] matrix) {
		preDaleSeo(matrix);
		int length = matrix.length;
		int max = Integer.MIN_VALUE;
		for (int rowStart = 0; rowStart < length; rowStart++) {
			for (int colStart = rowStart; colStart < length; colStart++) {
				for (int rowEnd = rowStart; rowEnd < length; rowEnd++) {
					for (int colEnd = colStart; colEnd < length; colEnd++) {
						int sum = sumDaleSeo(matrix, rowStart, colStart, rowEnd, colEnd);
						if (max < sum) {
							max = sum;
						}
					}
				}
			}
		}
		return max;
	}
	
	public static void preDaleSeo(int[][] matrix) {
		int length = matrix.length;
		
		for (int row = 0; row < length; row++) {
			for (int col = 1; col < length; col++) {
				matrix[row][col] += matrix[row][col - 1];
			}
		}
		
		for (int col = 0; col < length; col++) {
			for (int row = 1; row < length; row++) {
				matrix[row][col] += matrix[row - 1][col];
			}
		}
	}
	
	public static int sumDaleSeo(int[][] matrix, int rowStart, int colStart, int rowEnd, int colEnd) {
		int sum = matrix[rowEnd][colEnd];
		
		if (rowStart > 0) {
			sum -= matrix[rowStart - 1][colEnd];
		}
		
		if (colStart > 0) {
			sum -= matrix[rowEnd][colStart - 1];
		}
		
		if (rowStart > 0 && colStart > 0) {
			sum += matrix[rowStart - 1][colStart - 1];	
		}
		
		return sum;
	}

}
