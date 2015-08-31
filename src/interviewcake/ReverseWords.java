package interviewcake;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * https://www.interviewcake.com/question/reverse-words?utm_source=weekly_email
 */
public class ReverseWords {

	public String reverseWrods(String input) {
		String[] tokens = input.split(" ");
		System.out.println(Arrays.toString(tokens));
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
		assertEquals(output, reverseWords.reverseWrods(input));
	}
	
	@Test
	public void test2() {
		String input = "find you will pain only go you recordings security the into";
		String output = "into the security recordings you go only pain will you find";
		assertEquals(output, reverseWords.reverseWrods(input));
	}
	
	@Test
	public void test3() {
		String input = "find you";
		String output = "you find";
		assertEquals(output, reverseWords.reverseWrods(input));
	}
	
	@Test
	public void test4() {
		String input = "find";
		String output = "find";
		assertEquals(output, reverseWords.reverseWrods(input));
	}
	
}
