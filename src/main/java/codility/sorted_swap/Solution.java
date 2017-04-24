package codility.sorted_swap;

import java.util.Arrays;

/**
 * https://codility.com/tasks/sorted_swap/
 * https://codility.com/tickets/try2Y4YZP-EGD/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{1, 5, 3, 3, 7})); // true
		System.out.println(s.solution(new int[]{1, 3, 5, 3, 4})); // false
		System.out.println(s.solution(new int[]{1, 3, 5})); // true
	}

	public boolean solution(int[] A) {
		int[] B = Arrays.copyOf(A, A.length);
		Arrays.sort(A);
		int miss = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i]) {
				if (++miss > 2) {
					return false;
				}
			}
		}
		return true;
	}

}
