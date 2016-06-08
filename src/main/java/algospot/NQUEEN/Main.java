package algospot.NQUEEN;

/**
 * https://www.algospot.com/judge/problem/read/NQUEEN
 */
public class Main {

	public static void main(String[] args) {

	}

	public static int nqueen(int size) {
		boolean[][] matrix = new boolean[size][size];
		print(matrix);

		// Point[] points = initializePoints(size);
		// System.out.println(Arrays.toString(points));

		int y = 1;
		int x = 1;

		matrix[y][x] = true;

		int i = 1;
		while (y + i < size && x + i < size) {
			matrix[y][x + i] = true;
			matrix[y + i][x] = true;
			matrix[y + i][x + i] = true;
			matrix[y - i][x + i] = true;
			i++;
		}


		int j = -1;
		while (y + j >= 0 && x + j >= 0) {
			matrix[y][x + j] = true;
			matrix[y + j][x] = true;
			matrix[y + j][x + j] = true;
			matrix[y + j][x - j] = true;
			j--;
		}

		print(matrix);

		return -1;
	}

	private static Point[] initializePoints(int size) {
		Point[] points = new Point[size * size];
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				Point point = new Point(x, y);
				points[x * size + y] = point;
			}
		}
		return points;
	}

	private static void print(boolean[][] matrix) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j]) {
					builder.append('O');
				} else {
					builder.append('X');
				}
			}
			builder.append('\n');
		}

		System.out.println(builder.toString());
	}

	static class Point {
		int x;
		int y;

		boolean occupied;
		boolean canOccupied;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return String.format("(%d, %d) : %s%n", x, y, occupied);
		}
	}

}
