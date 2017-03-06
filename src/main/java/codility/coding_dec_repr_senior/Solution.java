package codility.coding_dec_repr_senior;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

/**
 * https://codility.com/tasks/coding_dec_repr_senior/
 * https://codility.com/c/run/tryVCA7HE-RSR
 * https://codility.com/tickets/tryVCA7HE-RSR/
 */
public class Solution {

	@Test
	public void test() {
		assertEquals(321, new Solution().solution(213));
		assertEquals(553, new Solution().solution(553));
		assertEquals(9987, new Solution().solution(9879));
	}

	public int solution(int N) {
		Queue<Integer> queue = new PriorityQueue<>();
		while (N > 0) {
			queue.add(N % 10);
			N /= 10;
		}
		int result = 0;
		int div = 1;
		while (!queue.isEmpty()) {
			result += queue.poll() * div;
			div *= 10;
		}
		return result;
	}

}

