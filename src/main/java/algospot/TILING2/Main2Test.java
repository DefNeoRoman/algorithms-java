package algospot.TILING2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main2Test {

	@Test
	public void test() {
		assertEquals(1, Main2.tiling(1));
		assertEquals(3, Main2.tiling(3));
		assertEquals(5, Main2.tiling(4));
		assertEquals(8, Main2.tiling(5));
		assertEquals(782204094, Main2.tiling(100));
	}

}