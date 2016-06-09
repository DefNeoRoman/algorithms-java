package algospot.NQUEEN;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MainTest {

	@Test
	public void test() {
		assertEquals(1, Main.nqueen(1));
		assertEquals(0, Main.nqueen(2));
		assertEquals(0, Main.nqueen(3));
		assertEquals(2, Main.nqueen(4));
		assertEquals(92, Main.nqueen(8));
	}

	@Test
	public void testCanPutQueenIn() throws Exception {
		int[] lines = {1, 3, -1, -1};
		assertTrue(Main.canPlaceQueenIn(2, 0, lines));
		assertFalse(Main.canPlaceQueenIn(2, 1, lines));
		assertFalse(Main.canPlaceQueenIn(2, 2, lines));
		assertFalse(Main.canPlaceQueenIn(2, 3, lines));
	}
}