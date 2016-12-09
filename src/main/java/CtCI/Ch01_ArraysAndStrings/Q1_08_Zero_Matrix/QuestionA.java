package CtCI.Ch01_ArraysAndStrings.Q1_08_Zero_Matrix;

import CtCI.CtCILibrary.AssortedMethods;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_08_Zero_Matrix/QuestionA.java
 * O(m*n) time, O(m+n) space
 */
public class QuestionA {

	public static void setZeros(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return;
		}

		// check whether each row and column contains 0 => O(m*n)
		int height = matrix.length, width = matrix[0].length;
		boolean[] rowsHasZero = new boolean[height];
		boolean[] colsHasZero = new boolean[width];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (matrix[i][j] == 0) {
					rowsHasZero[i] = true;
					colsHasZero[j] = true;
				}
			}
		}

		// update matrix accordingly => O(m*n)
		for (int i = 0; i < height; i++) {
			if (rowsHasZero[i]) {
				for (int j = 0; j < width; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < width; i++) {
			if (colsHasZero[i]) {
				for (int j = 0; j < height; j++) {
					matrix[j][i] = 0;
				}
			}
		}
	}

	@Test
	public void test() {
		int nrows = 10;
		int ncols = 15;
		int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -10, 10);

		AssortedMethods.printMatrix(matrix);

		setZeros(matrix);

		System.out.println();

		AssortedMethods.printMatrix(matrix);
	}

	@Test
	public void test1() {
		int[][] matrix = {
				{1, 1, 1, 1},
				{0, 1, 0, 0},
				{1, 1, 1, 1}
		};

		AssortedMethods.printMatrix(matrix);

		setZeros(matrix);

		System.out.println();

		AssortedMethods.printMatrix(matrix);

		int[][] expected = {
				{0, 1, 0, 0},
				{0, 0, 0, 0},
				{0, 1, 0, 0}
		};
		assertTrue(Arrays.deepEquals(expected, matrix));
	}

}
