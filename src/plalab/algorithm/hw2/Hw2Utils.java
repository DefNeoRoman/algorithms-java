package plalab.algorithm.hw2;

public class Hw2Utils {
	
	public static void paint(int[][] matrix) {
		for (int[] row : matrix) {
			for (int col : row) {
				System.out.print(col);
			}
			System.out.println("\r");
		}
	}

}