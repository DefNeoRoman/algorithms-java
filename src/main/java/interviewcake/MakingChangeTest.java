package interviewcake;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MakingChangeTest {

	MakingChange makingChange = new MakingChange();
	
	@Test
	public void test() {
		int amount = 4;
		int[] denominations = {1, 2, 3};
		int expected = 4; // {{1, 1, 1, 1}, {1, 1, 2}, {1, 3}, {2, 2}};
		int actual = makingChange.compute(amount, denominations);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		int amount = 110;
		int[] denominations = {10, 50, 100, 500};
		int expected = 4;
		int actual = makingChange.compute(amount, denominations);
		assertEquals(expected, actual);
	}

	@Test
	public void test3() {
		int amount = 850;
		int[] denominations = {10, 50, 100, 500};
		int expected = 110;
		int actual = makingChange.compute(amount, denominations);
		assertEquals(expected, actual);
	}

	@Test
	public void test4() {
		int amount = 1278;
		int[] denominations = {1, 2, 4, 8, 16, 32, 64, 128};
		int expected = 873794561;
		int actual = makingChange.compute(amount, denominations);
		assertEquals(expected, actual);
	}

}
