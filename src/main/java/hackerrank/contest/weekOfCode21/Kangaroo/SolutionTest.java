package hackerrank.contest.weekOfCode21.Kangaroo;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {

	@Test
	public void testKangaroo() throws Exception {
		assertTrue(Solution.kangaroo(0, 3, 4, 2));
	}

	@Test
	public void testKangaroo2() throws Exception {
		assertFalse(Solution.kangaroo(0, 2, 5, 3));
	}

	@Test
	public void testKangaroo3() throws Exception {
		assertFalse(Solution.kangaroo(0, 5, 4, 2));
	}

	@Test
	public void testKangaroo4() throws Exception {
		assertFalse(Solution.kangaroo(0, 10, 100, 2));
	}

}