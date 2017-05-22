package codility.min_abs_slice_sum;

import java.util.Arrays;

/**
 * https://codility.com/tasks/min_abs_slice_sum/
 * https://codility.com/tickets/tryAMXYZR-745/
 * http://stackoverflow.com/questions/25965939/finding-minimal-absolute-sum-of-a-subarray
 * http://codility-lessons.blogspot.kr/2015/04/lesson-15-minabssum-min-abs-sum.html
 * O(n * log(n))
 */
public class Solution2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();

		System.out.println(s.solution(new int[]{2, -4, 6, -3, 9})); // 1
		System.out.println(s.solution(new int[]{1})); // 1
		System.out.println(s.solution(new int[]{-1, -2, -3})); // 2
		System.out.println(s.solution(new int[]{-5, 8, -1})); // 1
	}

	public int solution(int[] A) {
		int[] sums = new int[A.length + 1];
		sums[0] = 0;
		for (int i = 0; i < A.length; i++) {
			sums[i + 1] = sums[i] + A[i];
		}
		Arrays.sort(sums);

		int minAbsSum = Integer.MAX_VALUE;
		for (int i = 1; i < sums.length; i++) {
			minAbsSum = Math.min(minAbsSum, Math.abs(sums[i] - sums[i - 1]));
		}
		return minAbsSum;
	}

}
