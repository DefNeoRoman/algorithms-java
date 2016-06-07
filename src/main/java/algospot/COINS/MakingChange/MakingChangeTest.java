package algospot.COINS.MakingChange;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakingChangeTest {

	MakingChange makingChange = new MakingChange();
	
	@Test
	public void test() {
		int amount = 4;
		int[] denominations = {1, 2, 3};
		long expected = 4; // {{1, 1, 1, 1}, {1, 1, 2}, {1, 3}, {2, 2}};
		long actual = makingChange.compute(amount, denominations);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		int amount = 110;
		int[] denominations = {10, 50, 100, 500};
		long expected = 4;
		long actual = makingChange.compute(amount, denominations);
		assertEquals(expected, actual);
	}

	@Test
	public void test3() {
		int amount = 850;
		int[] denominations = {10, 50, 100, 500};
		long expected = 110;
		long actual = makingChange.compute(amount, denominations);
		assertEquals(expected, actual);
	}

	@Test
	public void test4() {
		int amount = 1278;
		int[] denominations = {1, 2, 4, 8, 16, 32, 64, 128};
		long expected = 873794561;
		long actual = makingChange.compute(amount, denominations);
		assertEquals(expected, actual);
	}

}
