package codility.bugfixing_consecutive_integers;

/**
 * https://codility.com/tasks/bugfixing_consecutive_integers/
 * https://codility.com/tickets/try3FEY3K-N8U/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{1, 1, 2, 3, 3}, 3)); // true
		System.out.println(s.solution(new int[]{1, 1, 3}, 2)); // false
		System.out.println(s.solution(new int[]{1, 2}, 2)); // true
		System.out.println(s.solution(new int[]{1}, 2)); // false
		System.out.println(s.solution(new int[]{0, 1, 2, 3, 4, 5}, 5)); // false
		System.out.println(s.solution(new int[]{1, 2, 3, 4}, 5)); // false
	}

	public boolean solution(int[] A, int K) {
		int n = A.length;
		for (int i = 0; i < n - 1; i++) {
			if (A[i] + 1 < A[i + 1])
				return false;
		}
		if (A[0] != 1 || A[n - 1] != K)
			return false;
		else
			return true;
	}

}
