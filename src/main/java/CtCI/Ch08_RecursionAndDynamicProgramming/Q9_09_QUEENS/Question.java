package CtCI.Ch08_RecursionAndDynamicProgramming.Q9_09_QUEENS;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%209/Question9_9/Question.java
 */
public class Question {

	public static int GRID_SIZE = 5;

	public static void main(String[] args) {
		ArrayList<Integer[]> results = new ArrayList<>();
		Integer[] columns = new Integer[GRID_SIZE];
		Arrays.fill(columns, -1);
		placeQueens(0, columns, results);
		printBoards(results);
		System.out.println(results.size());
	}

	private static void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> results) {
		if (row == GRID_SIZE) {
			results.add(columns.clone());
		}
		for (int col = 0; col < GRID_SIZE; col++) {
			if (canPlace(columns, row, col)) {
				columns[row] = col;
				placeQueens(row + 1, columns, results);
			}
		}
	}

	private static boolean canPlace(Integer[] columns, int row, int col) {
		for (int r = 0; r < row; r++) {
			int c = columns[r];
			if (col == c) {
				return false;
			}
			if (row - r == Math.abs(col - c)) {
				return false;
			}
		}
		return true;
	}

	private static void printBoards(ArrayList<Integer[]> results) {
		for (Integer[] result : results) {
			System.out.println(Arrays.toString(result));
		}
	}

}