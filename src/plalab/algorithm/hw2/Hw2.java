package plalab.algorithm.hw2;

public class Hw2 {
	public static Subsquare findSquareDaleSeo(int[][] matrix) {	
		Subsquare biggestSubsquare = new Subsquare(0, 0, 0);
		
		for (int row = 0 ; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				int range = getRangeDaleSeo(row, col, matrix);
				if (range <= biggestSubsquare.getSize()) {
					continue;
				}
				
				int size = getSizeDaleSeo(row, col, range, matrix);
				Subsquare subsquare = new Subsquare(row, col, size);
				
				if (subsquare.compareTo(biggestSubsquare) > 0) {
					biggestSubsquare = subsquare;
				}
			}
		}
		
		return biggestSubsquare;
	}
	
	public static int getSizeDaleSeo(int row, int col, int range, int[][] matrix) {	
		while (range > 1) {
			boolean topClosed = true;
			boolean bottomClosed = true;
			boolean leftClosed = true;
			boolean rightClosed = true;
			
			for (int i = 1; i <= range - 1; i++) {
				if (matrix[row][col + i] != 1) {
					topClosed = false;
					break;
				}
			}
				
			for (int i = 1; i <= range - 1; i++) {
				if (matrix[row + range - 1][col + i] != 1) {
					bottomClosed = false;
					break;
				}
			}
				
			for (int i = 1; i <= range - 1; i++) {
				if (matrix[row + i][col] != 1) {
					leftClosed = false;
					break;
				}
			}
			
			for (int i = 1; i <= range - 1; i++) {
				if (matrix[row + i][col + range - 1] != 1) {
					rightClosed = false;
					break;
				}
			}
			
			if (topClosed && bottomClosed && leftClosed && rightClosed) {
				return range;
			}
			
			range--;
		}
		
		return 1;
	}
	
	public static int getRangeDaleSeo(int row, int col, int[][] matrix) {
		if (matrix[row][col] == 0) {
			return 0;
		}
		
		int capacity = matrix.length;
		int heightRange = capacity - row;
		int widthRange = capacity - col;
		int range = heightRange < widthRange ? heightRange : widthRange;
		
		while (range > 1) {
			if (matrix[row + range - 1][col + range - 1] == 1) {
				return range;
			}
			range--;
		}
		
		return range;
	}
}
