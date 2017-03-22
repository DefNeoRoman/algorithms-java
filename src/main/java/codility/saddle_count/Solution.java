package codility.saddle_count;

/**
 * https://codility.com/tasks/saddle_count/
 * https://codility.com/tickets/try6UTZR4-CSC/
 */
public class Solution {

	public static void main(String[] args) {
		int[][] A = {
				{0, 1, 9, 3},
				{7, 5, 8, 3},
				{9, 2, 9, 4},
				{4, 6, 7, 1}
		};
		System.out.println(new Solution().solution(A)); // 2
	}

	public int solution(int[][] A) {
		int count = 0;
		for (int r = 1; r < A.length - 1; r++) {
			for (int c = 1; c < A[r].length - 1; c++) {
				if (isSaddlePoint(A, r, c)) {
					count++;
				}
			}
		}
		return count;
	}

	private boolean isSaddlePoint(int[][] A, int r, int c) {
		boolean minInRow = A[r][c-1] > A[r][c] && A[r][c] < A[r][c+1];
		boolean maxInCol = A[r-1][c] < A[r][c] && A[r][c] > A[r+1][c];
		boolean maxInRow = A[r][c-1] < A[r][c] && A[r][c] > A[r][c+1];
		boolean minInCol = A[r-1][c] > A[r][c] && A[r][c] < A[r+1][c];
		return (minInRow && maxInCol) || (maxInRow && minInCol);
	}

}
