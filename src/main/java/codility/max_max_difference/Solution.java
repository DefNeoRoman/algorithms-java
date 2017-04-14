package codility.max_max_difference;

/**
 * https://codility.com/tasks/max_max_difference/
 * https://codility.com/tickets/tryH22UNZ-FBC/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{1, 3, -3})); // 6
		System.out.println(s.solution(new int[]{4, 3, 2, 5, 1, 1})); // 4
	}

	public int solution(int[] A) {
		int[] leftMaxes = new int[A.length - 1];
		int[] rightMaxes = new int[A.length - 1];

		int leftMax = Integer.MIN_VALUE;
		int rightMax = Integer.MIN_VALUE;

		for (int i = 0; i < A.length - 1; i++) {
			leftMax = Math.max(leftMax, A[i]);
			leftMaxes[i] = leftMax;
			rightMax = Math.max(rightMax, A[A.length - 1 - i]);
			rightMaxes[A.length - 2 - i] = rightMax;
		}

//		System.out.println("leftMaxes: " + Arrays.toString(leftMaxes));
//		System.out.println("rightMaxes: " + Arrays.toString(rightMaxes));

		int maxDiff = Integer.MIN_VALUE;
		for (int i = 0; i < A.length - 1; i++) {
			maxDiff = Math.max(maxDiff, Math.abs(leftMaxes[i] - rightMaxes[i]));
		}

		return maxDiff;
	}

}
