package seo.dale.algorithm.dynamic.largestSquare;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {
	
	private Solution2 solution = new Solution2();

	@Test
	public void findLargestSquare() throws Exception {
		char[][] matrix = new char[][] {
				{'O', 'X', 'O', 'X', 'X'},
				{'O', 'X', 'O', 'O', 'O'},
				{'O', 'O', 'O', 'O', 'O'},
				{'O', 'X', 'X', 'O', 'X'}
		};
		assertEquals(4, solution.findLargestSquare(matrix));
	}

	@Test
	public void findLargestSquare2() throws Exception {
		char[][] matrix = new char[][] {
				{'X', 'O', 'O', 'O', 'X'},
				{'X', 'O', 'O', 'O', 'O'},
				{'X', 'X', 'O', 'O', 'O'},
				{'X', 'X', 'O', 'O', 'O'},
				{'X', 'X', 'X', 'X', 'X'}
		};
		assertEquals(9, solution.findLargestSquare(matrix));
	}

	@Test
	public void findLargestSquare3() throws Exception {
		char[][] matrix = new char[][] {{'O'}};
		assertEquals(1, solution.findLargestSquare(matrix));
	}

}