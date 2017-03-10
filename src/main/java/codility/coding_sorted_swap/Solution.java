package codility.coding_sorted_swap;

import java.util.Arrays;

/**
 * https://codility.com/tasks/coding_sorted_swap/
 * https://codility.com/c/run/try25HTP4-GJJ
 * https://codility.com/tickets/try25HTP4-GJJ/
 */
public class Solution {
	public boolean solution(int[] A) {
		int[] B = new int[A.length];
		System.arraycopy(A, 0, B, 0, A.length);
		Arrays.sort(A);
		int diff = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i]) {
				diff++;
			}
			if (diff > 2) {
				return false;
			}
		}
		return true;
	}
}
