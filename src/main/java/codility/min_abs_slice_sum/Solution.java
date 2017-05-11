package codility.min_abs_slice_sum;

/**
 * https://codility.com/tasks/min_abs_slice_sum/
 * https://codility.com/tickets/tryAMXYZR-745/
 * O(n^2)
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();

//		System.out.println(s.solution(new int[]{2, -4, 6, -3, 9}));
		System.out.println(s.solution(new int[]{1}));
	}

	public int solution(int[] A) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			int sum = 0;
			for (int j = i; j < A.length; j++) {
				sum += A[j];
//				System.out.printf("(%d, %d) => %d%n", i, j, Math.abs(sum));
				min = Math.min(min, Math.abs(sum));
			}
		}
		return min;
	}

}
