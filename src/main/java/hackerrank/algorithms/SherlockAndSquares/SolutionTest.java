package hackerrank.algorithms.SherlockAndSquares;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	@Test
	public void test() {
		assertEquals(2, Solution.solve(3, 9));
		assertEquals(0, Solution.solve(17, 24));
		assertEquals(2, Solution.solve(24, 37));
		assertEquals(10, Solution.solve(1, 100));

	}

}