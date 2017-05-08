package codility.count_identical_pairs;

import java.util.Arrays;

/**
 * https://codility.com/tasks/count_identical_pairs/
 * O(n*log(n))
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{3, 5, 6, 3, 3, 5})); // 4
		System.out.println(s.solution(new int[]{0, 0})); // 1
	}

	public int solution(int[] A) {
		Arrays.sort(A);
		int sum = 0;
		int size = 1;
		for (int i = 0; i < A.length; i++) {
			if (i == A.length - 1 || A[i] != A[i + 1]) {
				sum += size * (size - 1) / 2;
				if (sum > 1_000_000_000 || sum < 0) {
					return 1_000_000_000;
				}
				size = 1;
			} else {
				size++;
			}
		}
		return sum;
	}

}
