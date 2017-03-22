package codility.optimizing_farthest_equal;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * https://codility.com/tasks/optimizing_farthest_equal/
 * https://codility.com/tickets/tryP7RCMB-KG2/
 * O(n) time & space: Using hash table
 */
public class Solution {

	@Test
	public void test() {
		assertEquals(4, new Solution().origianlSolution(new int[]{4, 6, 2, 2, 6, 6, 1}));
		assertEquals(4, new Solution().solution(new int[]{4, 6, 2, 2, 6, 6, 1}));
	}

	@Test
	public void test2() {
		int[] arr = new int[50001];
		assertEquals(50000, new Solution().origianlSolution(arr));
		assertEquals(50000, new Solution().solution(arr));
	}

	public int solution(int[] A) {
		Map<Integer, int[]> indexPairs = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			if (!indexPairs.containsKey(A[i])) {
				indexPairs.put(A[i], new int[]{i, -1});
			} else {
				int[] arr = indexPairs.get(A[i]);
				arr[1] = i;
			}
		}
		int result = 0;
		for (int[] arr : indexPairs.values()) {
			result = Math.max(arr[1] - arr[0], result);
		}
		return result;
	}

	public int origianlSolution(int[] A) {
		int N = A.length;
		int result = 0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (A[i] == A[j]) {
					System.out.printf("i:%d, j:%d, A[i]:%d, A[j]%d, j-i:%d%n", i, j, A[i], A[j], j-i);
					result = Math.max(result, Math.abs(i - j));
				}

		return result;
	}

}
