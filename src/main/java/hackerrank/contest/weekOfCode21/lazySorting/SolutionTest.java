package hackerrank.contest.weekOfCode21.lazySorting;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {

	@Test
	public void testIsAlreadySorted() throws Exception {
		assertTrue(Solution.isAlreadySorted(new int[]{1}));
		assertTrue(Solution.isAlreadySorted(new int[]{1, 2}));
		assertTrue(Solution.isAlreadySorted(new int[]{1, 2, 3}));
		assertTrue(Solution.isAlreadySorted(new int[]{2, 2, 2}));
		assertFalse(Solution.isAlreadySorted(new int[]{1, 2, 1}));
		assertFalse(Solution.isAlreadySorted(new int[]{3, 2, 1}));
	}

	@Test
	public void testSolve() throws Exception {
		Solution.solve(1, new int[]{1});
	}

	@Test
	public void testSolve2() throws Exception {
		Solution.solve(2, new int[]{5, 2});
	}

	@Test
	public void testSolve3() throws Exception {
		Solution.solve(9, new int[]{1, 2, 2, 3, 4, 4, 5, 5, 5});
	}

	@Test
	public void testSolve4() throws Exception {
		Solution.solve(10, new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2});
	}

	@Test
	public void testSolve5() throws Exception {
		Solution.solve(8, new int[]{1, 3, 5, 8, 6, 9, 15, 12});
	}

	@Test
	public void testSolve6() throws Exception {
		Solution.solve(18, new int[]{18, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 1});
	}

	@Test
	public void testSolve7() throws Exception {
		Solution.solve(3, new int[]{3, 2, 3});
	}

	@Test
	public void testSolve8() throws Exception {
		Solution.solve(6, new int[]{5, 1, 4, 2, 4, 2});
	}

	@Test
	public void testSolve9() throws Exception {
		Solution.solve(4, new int[]{3, 3, 3, 1});
	}
}