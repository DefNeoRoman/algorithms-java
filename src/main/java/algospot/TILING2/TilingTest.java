package algospot.TILING2;

import org.junit.Test;

public class TilingTest {

	private Tiling tiling;

	@Test
	public void test() {
		boolean[][] matrix = new boolean[2][5];
		matrix[1][0] = true;
		matrix[1][1] = true;
		tiling = new Tiling(matrix);
		tiling.printMatrix();
	}

}