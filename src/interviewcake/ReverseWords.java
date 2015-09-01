package interviewcake;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * https://www.interviewcake.com/question/reverse-words?utm_source=weekly_email
 */
public class ReverseWords {

	/**
	 * O(n) time and O(n) space
	 */
	public String reverseWordsCharacterLevel(String input) {
		char[] chars = input.toCharArray();
		// Reverse all characters first.
		reverseCharactersBetween(chars, 0, chars.length);
		// Reverse each word.
		for (int start = 0, end = 0; end <= chars.length; end++) {
			if (end == chars.length || chars[end] == ' ') {
				reverseCharactersBetween(chars, start, end);
				start = end + 1;
			}
		}
		return String.valueOf(chars);
	}
	
	/**
	 * @param start inclusive
	 * @param end exclusive
	 */
	private void reverseCharactersBetween(char[] chars, int start, int end) {
		while (start < end - 1) {
			char tmp = chars[start];
			chars[start] = chars[end - 1];
			chars[end - 1] = tmp;
			start++;
			end--;
		}
	}
	
	public String reverseWordsStringLevel(String input) {
		String[] tokens = input.split(" ");
		// System.out.println(Arrays.toString(tokens));
		for (int len = tokens.length, i = 0; i < len / 2; i++) {
			int opp = len - 1 - i;
			System.out.printf("%s(%s) <-> %s(%s)\n", i, tokens[i], opp, tokens[opp]);
			String tmp = tokens[i];
			tokens[i] = tokens[opp];
			tokens[opp] = tmp;
		}
		return String.join(" ", tokens);
	}
	
	ReverseWords reverseWords;
	
	@Before
	public void before() {
		reverseWords = new ReverseWords();
	}
	
	@Test
	public void test1() {
		String input = "find you will pain only go you recordings security the into if";
		String output = "if into the security recordings you go only pain will you find";
		assertEquals(output, reverseWords.reverseWordsStringLevel(input));
		assertEquals(output, reverseWords.reverseWordsCharacterLevel(input));
	}
	
	@Test
	public void test2() {
		String input = "find you will pain only go you recordings security the into";
		String output = "into the security recordings you go only pain will you find";
		assertEquals(output, reverseWords.reverseWordsStringLevel(input));
		assertEquals(output, reverseWords.reverseWordsCharacterLevel(input));
	}
	
	@Test
	public void test3() {
		String input = "find you";
		String output = "you find";
		assertEquals(output, reverseWords.reverseWordsStringLevel(input));
		assertEquals(output, reverseWords.reverseWordsCharacterLevel(input));
	}
	
	@Test
	public void test4() {
		String input = "find";
		String output = "find";
		assertEquals(output, reverseWords.reverseWordsStringLevel(input));
		assertEquals(output, reverseWords.reverseWordsCharacterLevel(input));
	}
	
	@Test
	public void testReverseCharactersBetween1() {
		char[] chars = "the eagle has landed".toCharArray();
		reverseCharactersBetween(chars, 0, chars.length);
		assertEquals("[d, e, d, n, a, l,  , s, a, h,  , e, l, g, a, e,  , e, h, t]", Arrays.toString(chars));
	}
	
	@Test
	public void testReverseCharactersBetween2() {
		char[] chars = "the eagle has landed".toCharArray();
		reverseCharactersBetween(chars, 0, 0);
		assertEquals("[t, h, e,  , e, a, g, l, e,  , h, a, s,  , l, a, n, d, e, d]", Arrays.toString(chars));
	}
	
	@Test
	public void testReverseCharactersBetween3() {
		char[] chars = "the eagle has landed".toCharArray();
		reverseCharactersBetween(chars, 2, 8);
		assertEquals("[t, h, l, g, a, e,  , e, e,  , h, a, s,  , l, a, n, d, e, d]", Arrays.toString(chars));
	}
	
}
