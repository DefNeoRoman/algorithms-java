package codility.monotonic_segment_count;

/**
 * https://codility.com/tasks/monotonic_segment_count/
 * https://codility.com/tickets/tryZHTQK8-977/
 * Improved
 */
public class Solution2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(new int[]{1, 2, 4, 7, 6, 6, 6, 2, 0}));
	}

	public int solution(int[] A) {
		if (A == null || A.length <= 1) {
			return 0;
		}
		int sum = 0;
		int trend = A[1] - A[0]; // 0: constant, positive: increasing, negative: decreasing
		int length = 1;
		int count = 1;

		for (int i = 2; i < A.length; i++) {
			boolean increasing = trend > 0 && A[i - 1] < A[i];
			boolean constant = trend == 0 && A[i - 1] == A[i];
			boolean decreasing = trend < 0 && A[i - 1] > A[i];

			if (increasing || constant || decreasing) {
				length++;
				count += length;
			} else {
				sum += count;
				length = 1;
				count = 1;
				trend = A[i] - A[i-1];
			}
		}

		sum += count;

		return sum > 100_000_000 ? -1 : sum;
	}

}
