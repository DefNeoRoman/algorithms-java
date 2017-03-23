package codility.max_nonneg_slice_sum;

/**
 * https://codility.com/tasks/max_nonneg_slice_sum/
 * https://codility.com/tickets/trySX9S7T-FFQ/
 */
public class Solution {

	public static void main(String[] args) {
		codility.bugfixing_max_nonneg_slice_sum.Solution s = new codility.bugfixing_max_nonneg_slice_sum.Solution();
		System.out.println(s.solution(new int[]{1, 2, -3, 4, 5, -6})); // 9
		System.out.println(s.solution(new int[]{-1, -2, -3, -4, -5, -6})); // -1
		System.out.println(s.solution(new int[]{1, 2, 3, 4, 5, 6})); // 21
		System.out.println(s.solution(new int[]{1, 2, -3, -4, 5, 6})); // 11
		System.out.println(s.solution(new int[]{-1, -2, 3, 4, -5, -6})); // 7
		System.out.println(s.solution(new int[]{6, 5, -4, -3, 2, 1})); // 11

		System.out.println(s.solution(new int[]{})); // -1
		System.out.println(s.solution(new int[]{-5})); // -1
		System.out.println(s.solution(new int[]{5})); // 5
		System.out.println(s.solution(new int[]{5, -5})); // 5
		System.out.println(s.solution(new int[]{-5, 5})); // 5

		System.out.println(s.solution(new int[]{0})); // 0
		System.out.println(s.solution(new int[]{4, -1, 2, -1, 3})); // 0
	}

	public int solution(int[] A) {
		int maxSum = -1;
		int sum = 0;
		boolean positive = false;
		for (int i = 0; i <= A.length; i++) {
			if (i == A.length || A[i] < 0) {
				maxSum = Math.max(sum, maxSum);
				sum = 0;
			} else {
				positive = true;
				sum += A[i];
			}
		}
		return positive ? maxSum : -1;
	}

}
