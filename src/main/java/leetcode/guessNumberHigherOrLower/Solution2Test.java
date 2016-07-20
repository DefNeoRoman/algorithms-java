package leetcode.guessNumberHigherOrLower;

import org.junit.Test;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class Solution2Test {

	@Test
	public void testGuessNumber() {
		Solution2 solution = new Solution2(10);
		int result = solution.guessNumber(10);
		System.out.println(result);
	}

}