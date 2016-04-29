package CtCI.Ch01.ArraysAndStrings.Q01_Is_Unique;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author 서대영/Store기술개발팀/SKP
 */
public class SolutionBTest extends TestCase {

	@Test
	public void testIsUniqueChars() throws Exception {
		int testCount = 5;
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		boolean[] expecteds = {true, false, false, true, true};

		for (int i = 0; i < testCount; i++) {
			boolean actual = SolutionB.hasUniqueChars(words[i]);
			System.out.println(words[i] + " : " + actual);
			System.out.println("========================================");
			assertEquals(expecteds[i], SolutionA.hasUniqueChars(words[i]));
		}
	}
}