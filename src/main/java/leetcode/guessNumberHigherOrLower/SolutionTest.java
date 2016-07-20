package leetcode.guessNumberHigherOrLower;

import org.junit.Test;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class SolutionTest {

	@Test
	public void testGuessNumber() {
		Solution solution = new Solution(10);
		int result = solution.guessNumber(10);
		System.out.println(result);
	}

}