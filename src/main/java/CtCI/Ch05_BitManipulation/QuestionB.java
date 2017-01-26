package CtCI.Ch05_BitManipulation;

import CtCI.CtCILibrary.AssortedMethods;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2005.%20Bit%20Manipulation/Q5_06_Conversion/QuestionB.java
 */
public class QuestionB {

	public static int bitSwapRequired(int a, int b) {
		int xor = a ^ b;
		int cnt = 0;
		while (xor != 0) {
			cnt ++;
			xor &= xor - 1; // clear the least significant bit (1)
		}
		return cnt;
	}

	@Test
	public void test() {
		int a = 29;
		int b = 15;
		System.out.println(a + ": " + AssortedMethods.toFullBinaryString(a));
		System.out.println(b + ": " + AssortedMethods.toFullBinaryString(b));
		System.out.println("Required number of bits: " + bitSwapRequired(a, b));
		assertEquals(2, bitSwapRequired(a, b));
	}

	@Test
	public void test2() {
		int a = -23432;
		int b = 512132;
		System.out.println(a + ": " + AssortedMethods.toFullBinaryString(a));
		System.out.println(b + ": " + AssortedMethods.toFullBinaryString(b));
		System.out.println("Required number of bits: " + bitSwapRequired(a, b));
		assertEquals(23, bitSwapRequired(a, b));
	}

}
