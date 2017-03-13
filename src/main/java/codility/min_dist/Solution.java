package codility.min_dist;

import java.util.Arrays;

/**
 * https://codility.com/tasks/min_dist/
 * https://codility.com/tickets/try6UC4YM-B2X/
 */
public class Solution {

	public int solution(int[] A) {
		Arrays.sort(A);
		int minDist = A[1] - A[0];
		for (int i = 2; i < A.length; i++) {
			minDist = Math.min(A[i] - A[i - 1], minDist);
		}
		return minDist;
	}

}
