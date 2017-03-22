package codility.optimizing_farthest_equal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://codility.com/tasks/optimizing_farthest_equal/
 * https://codility.com/tickets/tryUG86RK-3XE/
 * O(n) time & space: Using an array
 */
public class Solution2 {

	@Test
	public void test() {
		assertEquals(4, new Solution2().solution(new int[]{4, 6, 2, 2, 6, 6, 1}));
	}

	@Test
	public void test2() {
		int[] arr = new int[50001];
		assertEquals(50000, new Solution2().solution(arr));
	}

	public int solution(int[] A) {
		int[] lastIndices = new int[A.length + 1];
		for (int i = 0; i < A.length; i++) {
			lastIndices[A[i]] = i;
		}
		int maxDistance = 0;
		for (int i = 0; i < A.length; i++) {
			maxDistance = Math.max(lastIndices[A[i]] - i, maxDistance);
		}
		return maxDistance;
	}

}
