package codility.bugfixing_max_nonneg_slice_sum;

/**
 * https://codility.com/tasks/bugfixing_max_nonneg_slice_sum/
 * https://codility.com/tickets/tryJYRQPG-EAN/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
//		System.out.println(s.solution(new int[]{1, 2, -3, 4, 5, -6})); // 9
//		System.out.println(s.solution(new int[]{-1, -2, -3, -4, -5, -6})); // -1
//		System.out.println(s.solution(new int[]{1, 2, 3, 4, 5, 6})); // 21
//		System.out.println(s.solution(new int[]{1, 2, -3, -4, 5, 6})); // 11
//		System.out.println(s.solution(new int[]{-1, -2, 3, 4, -5, -6})); // 7
//		System.out.println(s.solution(new int[]{6, 5, -4, -3, 2, 1})); // 11
//
//		System.out.println(s.solution(new int[]{})); // -1
//		System.out.println(s.solution(new int[]{-5})); // -1
//		System.out.println(s.solution(new int[]{5})); // 5
//		System.out.println(s.solution(new int[]{5, -5})); // 5
//		System.out.println(s.solution(new int[]{-5, 5})); // 5

//		System.out.println(s.solution(new int[]{0})); // 0
		System.out.println(s.solution(new int[]{4, -1, 2, -1, 3})); // 0
	}

	public int solution(int[] S) {
		int max_sum = 0;
		int current_sum = 0;
		boolean positive = false;
		int n = S.length;
		for (int i = 0; i < n; ++i) {
			int item = S[i];
			if (item < 0) {
				if (max_sum < current_sum) {
					max_sum = current_sum;
				}
				current_sum = 0;
			} else {
				positive = true;
				current_sum += item;
			}
		}
		if (current_sum > max_sum) {
			max_sum = current_sum;
		}
		if (positive) {
			return max_sum;
		}
		return -1;
	}

}
