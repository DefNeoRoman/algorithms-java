package algospot.NQUEEN;

/**
 * https://www.algospot.com/judge/problem/read/NQUEEN
 * https://en.wikibooks.org/wiki/Algorithm_Implementation/Miscellaneous/N-Queens
 */
public class Main {

	public static void main(String[] args) {

	}

	public static int nqueen(int size) {
		int count = 0;

		int[] rows = new int[size];

		for (int r = 0; r < size; r++) {
			count += check(r, rows);
		}

		return count;
	}

	private static int check(int row, int[] rows) {
		return -1;
	}



}
