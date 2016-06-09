package algospot.NQUEEN;

import java.util.Arrays;

/**
 * https://www.algospot.com/judge/problem/read/NQUEEN
 * https://en.wikibooks.org/wiki/Algorithm_Implementation/Miscellaneous/N-Queens
 */
public class Main {

	private static int size;

	public static void main(String[] args) {

	}

	public static int nqueen(int size) {
		Main.size = size;
		int count = 0;
		
		int[] colPoses = new int[size];
		Arrays.fill(colPoses, -1);
		
		count += check(0, colPoses);

		return count;
	}

	private static int check(int rowIdx, int[] colPoses) {
		System.out.println("Call : rowIdx = [" + rowIdx + "], colPoses = [" + colPoses + "]");

		if (rowIdx == size) {
			return 1;
		}

		for (int colPos = 0; colPos < size; colPos++) {
			if (canPutQueenIn(rowIdx, colPos, colPoses)) {
				colPoses[rowIdx] = colPos; // mark
				return check(rowIdx + 1, colPoses); // and find on the next row
			}
		}

		return 0; // fail to find any colPos
	}

	public static boolean canPutQueenIn(int row, int col, int[] colPoses) {
		for (int i = 1; i <= row; i++) {
			int upperCol = colPoses[row - i];
			// check if it conflicts upward
			if (upperCol == col) {
				return false;
			}

			// check if it conflicts left-upward
			if (upperCol == col - i) {
				return false;
			}

			// check if it conflicts right-upward
			if (upperCol == col + i) {
				return false;
			}
		}
		return true;
	}

}
