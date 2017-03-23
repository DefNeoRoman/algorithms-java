package codility.max_perimeter_triangle;

import java.util.Arrays;

/**
 * https://codility.com/tasks/max_perimeter_triangle/
 * https://codility.com/tickets/try2HMZAB-VCR/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{10, 2, 5, 1, 8, 20})); // 23
		System.out.println(s.solution(new int[]{5, 10, 18, 7, 8, 3})); // 25
		System.out.println(s.solution(new int[]{10, 20, 30})); // -1
	}

	public int solution(int[] A) {
		Arrays.sort(A);
		for (int i = A.length - 1; i >= 2; i--) {
			if (A[i] - A[i - 1] - A[i - 2] < 0) {
				return A[i] + A[i - 1] + A[i - 2];
			}
		}
		return -1;
	}

}
