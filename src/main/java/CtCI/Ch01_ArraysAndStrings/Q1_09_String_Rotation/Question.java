package CtCI.Ch01_ArraysAndStrings.Q1_09_String_Rotation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_09_String_Rotation/Question.java
 */
public class Question {

	public static boolean isSubstring(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(0) && findsSubstringFrom(s1, i, s2)) {
				return true;
			}
		}
		return false;
	}

	public static boolean findsSubstringFrom(String s1, int start, String s2) {
		int i = start + 1;
		int j = 1;
		while (j < s2.length()) {
			if (i == s1.length()) {
				return false;
			}
			if (s1.charAt(i) != s2.charAt(j)) {
				return false;
			}
			i++;
			j++;
		}
		return true;
	}

	public static boolean isRotation(String s1, String s2) {
		String s1s1 = s1 + s1;
		return s1s1.contains(s2);
		// return isSubstring(s1s1, s2);
	}

	@Test
	public void test() {
		String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
		boolean[] expecteds = {true, true, false};

		for (int i = 0; i < expecteds.length; i++) {
			String[] pair = pairs[i];
			String word1 = pair[0];
			String word2 = pair[1];
			boolean is_rotation = isRotation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + is_rotation);
			assertEquals(expecteds[i], is_rotation);
		}
	}

	@Test
	public void testIsSubstring() {
		assertTrue(isSubstring("appleapple", "pleap"));
	}

}
