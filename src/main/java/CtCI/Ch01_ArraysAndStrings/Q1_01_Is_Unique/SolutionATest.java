package CtCI.Ch01_ArraysAndStrings.Q1_01_Is_Unique;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author 서대영/Store기술개발팀/SKP
 */
public class SolutionATest extends TestCase {

	@Test
	public void testIsUniqueChars() throws Exception {
		int testCount = 5;
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		boolean[] expecteds = {true, false, false, true, true};

		for (int i = 0; i < testCount; i++) {
			boolean actual = SolutionA.hasUniqueChars(words[i]);
			System.out.println(words[i] + " : " + actual);
			assertEquals(expecteds[i], SolutionA.hasUniqueChars(words[i]));
		}
	}

}