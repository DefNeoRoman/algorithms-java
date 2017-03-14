package codility.bugfixing_bisection;

/**
 * https://codility.com/tasks/bugfixing_bisection
 * https://codility.com/tickets/try7FD4W4-27Y/
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(new Solution().solution(new int[]{1, 2, 5, 7, 9}, 5)); // 2
		System.out.println(new Solution().solution(new int[]{1, 2, 5, 7, 9}, 7)); // 3
		System.out.println(new Solution().solution(new int[]{1, 2, 5, 7, 9}, 9)); // 4
		System.out.println(new Solution().solution(new int[]{1, 2, 5, 7, 9}, 2)); // 1
		System.out.println(new Solution().solution(new int[]{1, 2, 5, 7, 9}, 1)); // 0
		System.out.println(new Solution().solution(new int[]{1, 2, 5, 7, 9}, 10)); // -1
	}

	int solution(int[] A, int X) {
		int N = A.length;
		if (N == 0) {
			return -1;
		}
		int l = 0;
		int r = N - 1;
		while (l < r) {
			int m = (l + r) / 2;
			if (A[m] < X) {
				l = m + 1;
			} else {
				r = m;
			}
		}
		if (A[l] == X) {
			return l;
		}
		return -1;
	}
}
