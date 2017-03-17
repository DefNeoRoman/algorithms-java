package codility.dec_repr_senior;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

/**
 * https://codility.com/tasks/dec_repr_senior/
 * https://codility.com/tasks/coding_dec_repr_senior/
 * https://codility.com/tickets/tryTQKS9M-QW2/
 */
public class Solution {

	@Test
	public void test() {
		assertEquals(321, new Solution().solution(213));
		assertEquals(553, new Solution().solution(553));
		assertEquals(9987, new Solution().solution(9879));
		assertEquals(-1, new Solution().solution(123456789));
		assertEquals(-1, new Solution().solution(1777777777));
	}

	public int solution(int N) {
		Queue<Integer> queue = new PriorityQueue<>();
		while (N > 0) {
			queue.add(N % 10);
			N /= 10;
		}
		long result = 0;
		long div = 1;
		while (!queue.isEmpty()) {
			result += queue.poll() * div;
			div *= 10;
		}
		return result > 100_000_000 ? -1 : (int) result;
	}

}

