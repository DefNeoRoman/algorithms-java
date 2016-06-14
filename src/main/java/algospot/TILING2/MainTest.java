package algospot.TILING2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

	@Test
	public void test() {
		assertEquals(1, Main.tiling(1));
		assertEquals(3, Main.tiling(3));
		assertEquals(5, Main.tiling(4));
		assertEquals(8, Main.tiling(5));
		assertEquals(782204094, Main.tiling(100));
	}

}