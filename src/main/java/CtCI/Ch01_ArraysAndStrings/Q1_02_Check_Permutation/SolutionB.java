package CtCI.Ch01_ArraysAndStrings.Q1_02_Check_Permutation;

import org.junit.Test;

import java.util.Arrays;

/**
 * O(n*log(n)) time complexity & O(n) space complexity
 */
public class SolutionB {

	public static boolean permutation(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}

		char[] arr1 = word1.toCharArray();
		Arrays.sort(arr1);

		char[] arr2 = word2.toCharArray();
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);
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
