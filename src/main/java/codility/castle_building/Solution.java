package codility.castle_building;

/**
 * https://codility.com/tasks/castle_building/
 * https://codility.com/tickets/try83VCQK-ET9/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
//		System.out.println(s.solution(new int[]{2})); // 1
//		System.out.println(s.solution(new int[]{2, 2})); // 1
//		System.out.println(s.solution(new int[]{2, 1})); // 2
//		System.out.println(s.solution(new int[]{2, 3})); // 2
		System.out.println(s.solution(new int[]{2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5})); // 4
	}

	public int solution(int[] A) {
		int cnt = 1;
		int i = 1;

		int trend = 0; // 0: flat, 1: increasing, -1: decreasing

		while (i < A.length) {
			if (trend != 1 && A[i - 1] < A[i]) {
				cnt++;
				trend = 1;
			} else if (trend != -1 && A[i - 1] > A[i]) {
				cnt++;
				trend = -1;
			}
			i++;
		}

		return cnt;
	}

}
