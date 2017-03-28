package codility.prefix_permutations;

/**
 * https://codility.com/tasks/prefix_permutations/
 * https://codility.com/tickets/try72HUNG-5XC/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{2, 1, 3, 5, 4}));
	}

	public int solution(int[] A) {
		int cnt = 0;
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			max = Math.max(A[i], max);
			if (i + 1 == max) {
				cnt++;
			}
		}
		return cnt;
	}

}
