package CtCI.Ch05_BitManipulation.Q5_03_Flip_Bit_to_Win;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2005.%20Bit%20Manipulation/Q5_03_Flip_Bit_to_Win/QuestionD.java
 * Time Complexity: O(b) where b is the number of bits
 * Space Complexity: O(1)
 */
public class QuestionB {

	public static int longestSequence(int n) {
		if (n == -1) {
			return Integer.BYTES * 8;
		}

		int prev = 0, curr = 0;
		int longest = 1;
		while (n != 0) {
			if ((n & 1) == 1) {
				curr ++;
			} else {
				prev = curr;
				curr = 0;
			}
			longest = Math.max(prev + curr + 1, longest);
			n >>>= 1;
		}

		return longest;
	}

	@Test
	public void test() {
		assertEquals(6, longestSequence(3535));
		assertEquals(8, longestSequence(1775));
	}

	@Test
	public void test2() {
		int[][] cases = {{-1, 32}, {Integer.MAX_VALUE, 32}, {-10, 31}, {0, 1}, {1, 2}, {15, 5}, {1775, 8}};
		for (int[] c : cases) {
			assertEquals(c[1], longestSequence(c[0]));
		}
	}


}
