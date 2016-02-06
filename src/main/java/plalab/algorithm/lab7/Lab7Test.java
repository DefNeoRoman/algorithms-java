package plalab.algorithm.lab7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Lab7Test {

	@Test
	public void test() {
		int[] arr = {1, 2, 4, 5, 6};
		assertEquals(3, Lab7.getMssingNo(arr));
	}
	
	@Test
	public void test2() {
		int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};
		assertEquals(7, Lab7.getMssingNo(arr));
	}

}
