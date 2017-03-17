package codility.integer_bin_construction;

/**
 * https://codility.com/tasks/integer_bin_construction/
 * https://codility.com/tickets/tryRE7YBR-R3F/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		for (int i = 1; i <= 18; i++) {
			System.out.println(i + ":" + s.solution(i));
		}
		System.out.println(123456789 + ":" + s.solution(123456789));
	}

	/*
	 * O(log(N)) time & O(1) space
	 */
	public int solution(int N) {
		if (N == 1) return 1;
		return (N & 1) == 1 ? solution(N - 1) + 1 : solution(N / 2) + 1;
	}

	/*
	 * O(n) time & space
	 */
	public int solution2(int N) {
		int[] memo = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			memo[i] = (i & 1) == 1 ? memo[i - 1] + 1 : memo[i / 2] + 1;
		}
		return memo[N];
	}

}
