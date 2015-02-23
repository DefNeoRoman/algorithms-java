package seo.dale.algorithm.recursion;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class GrayCodeTest {

	@Test
	public void test() {
		String[] expected1 = {"0", "1"};
		assertTrue(Arrays.equals(expected1, GrayCode.code(1)));
		
		String[] expected2 = {"00", "01", "11", "10"};
		assertTrue(Arrays.equals(expected2, GrayCode.code(2)));
		
		String[] expected3 = {"000", "001", "011", "010", "110", "111", "101", "100"};
		assertTrue(Arrays.equals(expected3, GrayCode.code(3)));
	}

}
