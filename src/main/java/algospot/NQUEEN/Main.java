/**
 * https://www.algospot.com/judge/problem/read/NQUEEN
 * https://en.wikibooks.org/wiki/Algorithm_Implementation/Miscellaneous/N-Queens
 */
package algospot.NQUEEN;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static int size;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		while (count-- > 0) {
			int size = scanner.nextInt();
			System.out.println(nqueen(size));
		}
		scanner.close();
	}

	public static int nqueen(int size) {
		Main.size = size;
		
		int[] colPoses = new int[size];
		Arrays.fill(colPoses, -1);

		return count(0, colPoses);
	}

	private static int count(int row, int[] rows) {
		// System.out.println("Call : row = [" + row + "], rows = " + Arrays.toString(rows));

		if (row == size) {
			// System.out.println("- Succeeded in placing a queen on every row.");
			return 1;
		}

		int count = 0;

		for (int col = 0; col < size; col++) {
			if (canPlaceQueenIn(row, col, rows)) {
				int[] newRows = Arrays.copyOf(rows, size);
				newRows[row] = col;
				// System.out.println("- Placed a queen on the row #" + row + " at col #" + col);
				count += count(row + 1, newRows);
			}
		}

		// System.out.println("- Can't place a queen on the row #" + row);
		return count;
	}

	public static boolean canPlaceQueenIn(int row, int col, int[] colPoses) {
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
