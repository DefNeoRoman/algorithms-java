package leetcode.maximalSquare;

import org.junit.Test;

import static org.junit.Assert.*;

public class FailureTest {

	private Failure solution = new Failure();

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
}