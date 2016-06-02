package algospot.RATIO;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

	@Test
	public void test() {
		assertEquals(1, Main.ratio(1, 0));
		assertEquals(1, Main.ratio(10, 8));
		assertEquals(6, Main.ratio(100, 80));
		assertEquals(-1, Main.ratio(47, 47));
		assertEquals(1000, Main.ratio(99000, 0));
		assertEquals(19230770, Main.ratio(1000000000, 470000000));
	}
	
}