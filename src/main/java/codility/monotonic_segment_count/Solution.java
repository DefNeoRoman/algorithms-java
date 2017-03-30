package codility.monotonic_segment_count;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codility.com/tasks/monotonic_segment_count/
 * https://codility.com/tickets/tryZHTQK8-977/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{1, 2, 4, 7, 6, 6, 6, 2, 0}));
	}

	public int solution(int[] A) {
		if (A == null || A.length <= 1) {
			return 0;
		}
		int count = 0;
		int trend = A[1] - A[0]; // 0: constant, positive: increasing, negative: decreasing
		int length = 1;

		for (int i = 2; i < A.length; i++) {
			boolean increasing = trend > 0 && A[i - 1] < A[i];
			boolean constant = trend == 0 && A[i - 1] == A[i];
			boolean decreasing = trend < 0 && A[i - 1] > A[i];

			if (increasing || constant || decreasing) {
				length++;
			} else {
				count += countSegments(length);
				length = 1;
				trend = A[i] - A[i-1];
			}
		}

		count += countSegments(length);

		return count > 100_000_000 ? -1 : count;
	}

	private static Map<Integer, Integer> memo = new HashMap<>();

	private int countSegments(int length) {
		if (length == 1) {
			return 1;
		}
		if (!memo.containsKey(length)) {
			memo.put(length, length + countSegments(length - 1));
		}
		return memo.get(length);
	}

}
