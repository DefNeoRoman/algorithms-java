package codility.dec_repr_senior;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * https://codility.com/tasks/dec_repr_senior/
 * https://codility.com/tasks/coding_dec_repr_senior/
 * https://codility.com/tickets/tryGQA8PP-CPW/
 * As a string
 */
public class Solution2 {

	@Test
	public void test() {
		assertEquals(321, new Solution2().solution(213));
		assertEquals(553, new Solution2().solution(553));
		assertEquals(9987, new Solution2().solution(9879));
		assertEquals(-1, new Solution2().solution(123456789));
		assertEquals(-1, new Solution2().solution(1777777777));
	}

	public int solution(int N) {
		char[] digits = Integer.toString(N).toCharArray();
		Arrays.sort(digits);
		long result = Long.parseLong(new StringBuilder(new String(digits)).reverse().toString());
		return result > 100_000_000 ? -1 : (int) result;
	}

}

