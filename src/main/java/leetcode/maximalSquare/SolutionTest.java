package leetcode.maximalSquare;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void testMaximalSquare() throws Exception {
		char[][] matrix = new char[][] {
			{'1', '0', '1', '0', '0'},
			{'1', '0', '1', '1', '1'},
			{'1', '1', '1', '1', '1'},
			{'1', '0', '0', '1', '0'}
		};
		assertEquals(4, solution.maximalSquare(matrix));
	}

	@Test
	public void testMaximalSquare2() throws Exception {
		char[][] matrix = new char[][] {
				{'0', '1', '1', '1', '0'},
				{'0', '1', '1', '1', '1'},
				{'0', '0', '1', '1', '1'},
				{'0', '0', '1', '1', '1'},
				{'0', '0', '0', '0', '0'}
		};
		assertEquals(9, solution.maximalSquare(matrix));
	}

	@Test
	public void testMaximalSquare3() throws Exception {
		char[][] matrix = new char[][] {
				{'1'}
		};
		assertEquals(1, solution.maximalSquare(matrix));
	}

}