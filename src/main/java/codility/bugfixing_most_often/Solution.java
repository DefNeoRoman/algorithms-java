package codility.bugfixing_most_often;

/**
 * https://codility.com/tasks/bugfixing_most_often/
 */
public class Solution {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(3, new int[]{1, 2, 3, 3, 1, 3, 1}));
		System.out.println(sol.solution(1, new int[]{1}));
		System.out.println(sol.solution(3, new int[]{1, 2, 3, 3, 1}));
	}

	int solution(int M, int[] A) {
		int N = A.length;
		int[] count = new int[M + 1];
		for (int i = 0; i <= M; i++)
			count[i] = 0;
		int maxOccurence = 1;
		int index = 0;
		for (int i = 0; i < N; i++) {
			if (count[A[i]] > 0) {
				int tmp = count[A[i]] + 1;
				if (tmp > maxOccurence) {
					maxOccurence = tmp;
					index = i;
				}
				count[A[i]] = tmp;
			} else {
				count[A[i]] = 1;
			}
		}
		return A[index];
	}
}
