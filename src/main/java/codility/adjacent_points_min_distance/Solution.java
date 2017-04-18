package codility.adjacent_points_min_distance;

import java.util.Arrays;

/**
 * https://codility.com/tasks/adjacent_points_min_distance/
 * https://codility.com/tickets/try6BGCTV-2B3/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{0, 3, 3, 7, 5, 3, 11, 1})); // 0
		System.out.println(s.solution(new int[]{-1, 2147483647})); // -1
	}

	public int solution(int[] A) {
		if (A.length < 2) {
			return -2;
		}
		Arrays.sort(A);
		long min = (long) A[1] - A[0];
		for (int i = 2; i < A.length; i++) {
			min = Math.min(min, (long) A[i] - A[i-1]);
		}
		return min > 100_000_000 ? -1 : (int) min;
	}

}
