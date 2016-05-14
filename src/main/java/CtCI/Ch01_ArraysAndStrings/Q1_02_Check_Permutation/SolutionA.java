package CtCI.Ch01_ArraysAndStrings.Q1_02_Check_Permutation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * O(n^2) time complexity & O(n) space complexity
 */
public class SolutionA {

	public static boolean permutation(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}

		List<Character> list = new ArrayList<>();
		for (int i = 0; i < word1.length(); i++) {
			char ch1 = word1.charAt(i);
			list.add(ch1);
		}

		for (int i = 0; i < word2.length(); i++) {
			char ch2 = word2.charAt(i);
			if (!list.contains(ch2)) {
				return false;
			} else {
				list.remove(Character.valueOf(ch2));
			}
		}

		if (list.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@Test
	public void test() {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}

}
