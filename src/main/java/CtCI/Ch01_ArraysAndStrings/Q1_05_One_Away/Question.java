package CtCI.Ch01_ArraysAndStrings.Q1_05_One_Away;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_05_One_Away/QuestionA.java
 */
public class Question {

	public static boolean oneEditAway(String first, String second) {
		if (first.length() == second.length()) {
			return oneReplaceAway(first, second);
		} else if (first.length() + 1 == second.length()) {
			return oneInsertAway(first, second);
		} else if (first.length() == second.length() + 1) {
			return oneInsertAway(second, first);
		}
		return false;
	}

	private static boolean oneReplaceAway(String first, String second) {
		boolean foundDiff = false;
		for (int i = 0; i < first.length(); i++) {
			if (first.charAt(i) != second.charAt(i)) {
				if (foundDiff) {
					return false;
				}
				foundDiff = true;
			}
		}
		return true;
	}

	private static boolean oneInsertAway(String shorter, String longer) {
		int j = 0;
		for (int i = 0; i < shorter.length(); i++) {
			if (shorter.charAt(i) != longer.charAt(j)) {
				if (shorter.charAt(i) != longer.charAt(j + 1)) {
					return false;
				}
				j++;
			}
			j++;
		}
		return true;
	}

	@Test
	public void test() {
		assertTrue(oneEditAway("pale", "bale"));
		assertFalse(oneEditAway("pale", "bake"));
	}

	@Test
	public void test2() {
		assertTrue(oneEditAway("pale", "ple"));
		assertTrue(oneEditAway("pales", "pale"));
		assertFalse(oneEditAway("pse", "pale"));
	}

}
