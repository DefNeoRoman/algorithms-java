package CtCI.Ch05_BitManipulation.Q5_03_Flip_Bit_to_Win;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2005.%20Bit%20Manipulation/Q5_03_Flip_Bit_to_Win/QuestionA.java
 * Time Complexity: O(b) where b is the number of bits
 * Space Complexity: O(1)
 */
public class QuestionA {

	public static int longestSequence(int n) {
		String binaryString = Integer.toBinaryString(n);
		List<String> list = new ArrayList<>();
		for (int i = 0; i < binaryString.length(); i++) {
			char ch = binaryString.charAt(i);
			if (ch == '0') {
				String flipped = binaryString.substring(0, i) + '1' + binaryString.substring(i + 1);
				list.add(flipped);
			}
		}

		int longest = 1;
		for (String flipped : list) {
			String[] tokens = flipped.split("0");
			for (String token : tokens) {
				longest = Math.max(longest, token.length());
			}
		}

		return longest;
	}

	@Test
	public void test() {
		assertEquals(8, longestSequence(1775));
	}

}
