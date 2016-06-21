package algospot.TRIPATHCNT;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

	@Test
	public void testTripathcnt() throws Exception {
		int[][] tri = {
				{3, 5, 5, 6},
				{1, 3, 2},
				{5, 7},
				{9}
		};
		assertEquals(3, Main.tripathcnt(tri));
	}

	@Test
	public void testTripathcnt2() throws Exception {
		int[][] tri = {
				{1, 1, 1, 1},
				{1, 1, 1},
				{1, 1},
				{1}
		};
		assertEquals(8, Main.tripathcnt(tri));
	}

}