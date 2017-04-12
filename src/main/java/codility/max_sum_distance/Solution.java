package codility.max_sum_distance;

/**
 * https://codility.com/tasks/max_sum_distance/
 * https://codility.com/tickets/tryEZFM64-QPS/
 * O(n) time & O(1) space
 * Max sum distances can be found between peeks
 * Compare sum distances between the old max and the new possible maxes
 * (left, right) vs. (left, i) vs. (right, i)
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{1, 3, -3})); // 6
		System.out.println(s.solution(new int[]{-8, 4, 0, 5, -3, 6})); // 14
	}

	public int solution(int[] A) {
		int left = 0, right = 0;
		int max = A[0] + A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i - 1] <= A[i]) {
				if (i == A.length - 1 || A[i] > A[i + 1]) {
					int leftSum = A[left] + A[i] + i - left;
					if (leftSum > max) {
						right = i;
						max = leftSum;
					}

					int rightSum = A[right] + A[i] + i - right;
					if (rightSum > max) {
						left = right;
						right = i;
						max = rightSum;
					}
				}
			}
		}
		return max;
	}

}
