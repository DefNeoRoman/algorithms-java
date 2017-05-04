package codility.union_of_intervals;

import java.util.Arrays;

/**
 * https://codility.com/tasks/union_of_intervals/
 * https://codility.com/tickets/tryG4VEH3-KJR/
 */
public class Solution {

	public static void main(String[] args) {
		int[] A = {1, 12, 42, 70, 36, -4, 43, 15};
		int[] B = {5, 15, 44, 72, 36, 2, 69, 24};
		Solution s = new Solution();
		System.out.println(s.solution(A, B));
	}

	public int solution(int[] A, int[] B) {
		if (A == null || A.length == 0) {
			return 0;
		}
		Arrays.sort(A);
		Arrays.sort(B);
		int cnt = 1;
		for (int i = 0; i < A.length - 1; i++) {
			if (B[i] < A[i + 1]) {
				// System.out.printf("%d < %d%n", B[i], A[i + 1]);
				cnt++;
			}
		}
		return cnt;
	}

}
