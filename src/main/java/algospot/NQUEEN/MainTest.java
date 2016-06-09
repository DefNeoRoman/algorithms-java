package algospot.NQUEEN;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class MainTest {

	@Test
	public void test() {
		Main.nqueen(4);
	}

	@Test
	public void testCanPutQueenIn() throws Exception {
		int[] lines = {1, 3, -1, -1};
		assertTrue(Main.canPutQueenIn(2, 0, lines));
		assertFalse(Main.canPutQueenIn(2, 1, lines));
		assertFalse(Main.canPutQueenIn(2, 2, lines));
		assertFalse(Main.canPutQueenIn(2, 3, lines));
	}
}