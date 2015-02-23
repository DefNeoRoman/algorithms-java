package seo.dale.algorithm.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class BillCombinationTest {

	@Test
	public void test() {
		assertEquals(1, BillCombination.count(new int[]{20}, 100));
		assertEquals(0, BillCombination.count(new int[]{20}, 101));
		// assertEquals(4562, BillCombination.count(new int[]{1, 2, 5, 10, 20, 50}, 100));
	}

}
