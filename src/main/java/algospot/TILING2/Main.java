/**
 * https://www.algospot.com/judge/problem/read/TILING2
 * 왜 2 x 5 일 때, 8가지 방법인지 먼저 파악하고 구현하기
 */
package algospot.TILING2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTests = scanner.nextInt();
		while (numOfTests-- > 0) {
			int input = scanner.nextInt();
			int output = tiling(input);
			System.out.println(output);
		}
		scanner.close();
	}

	private static int tiling(int width) {
		boolean[][] matrix = new boolean[2][width];
		Tiling tiling = new Tiling(matrix);


		return 0;
	}

}

class Tiling {

	private boolean[][] matrix;

	public Tiling(boolean[][] matrix) {
		this.matrix = matrix;
	}

	public void printMatrix() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j]) {
					builder.append('#');
				} else {
					builder.append('.');
				}
			}
			builder.append('\n');
		}
		System.out.println(builder.toString());
	}

	public int count() {
		if (isFull()) {
			printMatrix();
			System.out.printf("Return 1 because the matrix is full");
			return 1;
		}

		if (!canAccept()) {

		}

		int cnt = 0;

		if (canPutHorizental()) {
			Tiling nextTiling = afterPutHorizental();
			cnt += nextTiling.count();
		}

		if (canPutVertical()) {
			Tiling nextTiling = afterPutVertical();
			cnt += nextTiling.count();
		}

		return cnt;
	}

	private boolean isFull() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (!matrix[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean canAccept() {
		return false;
	}

	private boolean canPutHorizental() {
		return false;
	}


	private boolean canPutVertical() {
		return false;
	}

	private Tiling afterPutHorizental() {
		return null;
	}

	private Tiling afterPutVertical() {
		return null;
	}

}
