package codility.optimizing_farthest_equal;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * https://codility.com/tasks/optimizing_farthest_equal/
 * https://codility.com/tickets/tryTBQVP6-7BS/
 * O(n) time & space: Using a hash table (improved)
 */
public class Solution3 {

	@Test
	public void test() {
		assertEquals(4, new Solution3().solution(new int[]{4, 6, 2, 2, 6, 6, 1}));
	}

	@Test
	public void test2() {
		int[] arr = new int[50001];
		assertEquals(50000, new Solution3().solution(arr));
	}

	public int solution(int[] A) {
		int maxDistance = 0;
		Map<Integer, Integer> firstIndexes = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			if (firstIndexes.containsKey(A[i])) {
				maxDistance = Math.max(i - firstIndexes.get(A[i]), maxDistance);
			} else {
				firstIndexes.put(A[i], i);
			}
		}
		return maxDistance;
	}

}
