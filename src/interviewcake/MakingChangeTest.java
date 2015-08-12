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

}
