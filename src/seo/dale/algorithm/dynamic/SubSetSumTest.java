package seo.dale.algorithm.dynamic;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubSetSumTest {

	private SubSetSum sss = new SubSetSum();
	
	@Test
	public void test() {
		int[] arr = {6, 9, 13, 14, 20, 21, 22, 30, 49, 55};
		int num = 110;
		assertTrue(sss.isPossilbe(arr, num));
	}

	@Test
	public void test2() {
		int[] arr = {6, 9, 13, 14, 20, 21, 22, 30, 49, 55};
		int num = 101;
		assertFalse(sss.isPossilbe(arr, num));
	}
	
}
