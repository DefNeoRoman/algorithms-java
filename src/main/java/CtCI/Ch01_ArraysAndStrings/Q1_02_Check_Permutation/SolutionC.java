package CtCI.Ch01_ArraysAndStrings.Q1_02_Check_Permutation;

import org.junit.Test;

/**
 * O(n) time complexity & O(1) space complexity
 */
public class SolutionC {

	public static boolean permutation(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}

		int[] arr = new int[26]; // assume it takes only lower-case alphabets

		for (int i = 0; i < word1.length(); i++) {
			char ch1 = word1.charAt(i);
			arr[ch1 - 'a']++;
		}

		for (int i = 0; i < word2.length(); i++) {
			char ch2 = word2.charAt(i);
			arr[ch2 - 'a']--;
			if (arr[ch2 - 'a'] < 0) {
				return false;
			}
		}
/*
		for (int count : arr) {
			if (count != 0) {
				return false;
			}
		}
*/
		return true;
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
