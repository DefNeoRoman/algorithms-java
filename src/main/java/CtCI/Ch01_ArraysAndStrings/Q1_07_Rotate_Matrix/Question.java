package CtCI.Ch01_ArraysAndStrings.Q1_07_Rotate_Matrix;

import CtCI.CtCILibrary.AssortedMethods;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_07_Rotate_Matrix/Question.java
 */
public class Question {

	public static void rotate(int[][] matrix) {
		int size = matrix.length;
		for (int layer = 0; layer < size / 2; layer++) {
			int length = size - 1 - layer * 2;
			for (int i = 0; i < length; i++) {
				int first = layer;
				int last = size - 1 - layer;

				int temp = matrix[first][first + i]; // temp <- top
				matrix[first][first + i] = matrix[last - i][first]; // top <- left
				matrix[last - i][first] = matrix[last][last - i]; // left <- bottom
				matrix[last][last - i] = matrix[i + first][last]; // bottom <- right
				matrix[i + first][last] = temp; // right <- temp
			}
		}
	}

	@Test
	public void test1() {
		int[][] matrix = {
				{0, 1, 2},
				{3, 4, 5},
				{6, 7, 8}
		};
		rotate(matrix);
		AssortedMethods.printMatrix(matrix);
		int[][] expected = {
				{6, 3, 0},
				{7, 4, 1},
				{8, 5, 2}
		};
		assertTrue(Arrays.deepEquals(expected, matrix));
	}

	@Test
	public void test3() {
		int[][] matrix = {
				{0, 1, 2, 3},
				{4, 5, 6, 7},
				{8, 9, 10, 11},
				{12, 13, 14, 15},
		};
		rotate(matrix);
		AssortedMethods.printMatrix(matrix);
		int[][] expected = {
				{12, 8, 4, 0},
				{13, 9, 5, 1},
				{14, 10, 6, 2},
				{15, 11, 7, 3}
		};
		assertTrue(Arrays.deepEquals(expected, matrix));
	}

	@Test
	public void test() {
		int[][] matrix = AssortedMethods.randomMatrix(3, 3, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
		System.out.println();
	}

}
