package codility.coding_equi_2d_count;

import java.util.Arrays;

/**
 * https://codility.com/tasks/coding_equi_2d_count/
 * https://codility.com/tickets/tryEXBVCR-4FK/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();

//		int[][] A = {
//				{2, 7, 5},
//				{3, 1, 1},
//				{2, 1, -7},
//				{0, 2, 1},
//				{1, 6, 8}
//		};
//		System.out.println(s.solution(A));

		int[][] B = {
				{0, 0}
		};
		System.out.println(s.solution(B));
	}

	public int solution(int[][] A) {
		int cnt = 0;
		long[] rowSums = rowSums(A);
		long[] colSums = colSums(A);
//		System.out.println(Arrays.toString(rowSums));
//		System.out.println(Arrays.toString(colSums));
		for (int r = 0; r < A.length; r++) {
			for (int c = 0; c < A[r].length; c++) {
//				System.out.printf("(%d, %d)%n", r, c);
				if (equilibrium(rowSums, colSums, r, c)) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	private long[] rowSums(int[][] A) {
		long[] rowSums = new long[A.length];
		for (int r = 0; r < A.length; r++) {
			for (int c = 0; c < A[r].length; c++) {
				rowSums[r] += A[r][c];
			}
		}
		return rowSums;
	}

	private long[] colSums(int[][] A) {
		long[] colSums = new long[A[0].length];
		for (int r = 0; r < A.length; r++) {
			for (int c = 0; c < A[r].length; c++) {
				colSums[c] += A[r][c];
			}
		}
		return colSums;
	}

	private boolean equilibrium(long[] rowSums, long[] colSums, int r, int  c) {
		long topSum = Arrays.stream(Arrays.copyOfRange(rowSums, 0, r)).sum();
		long bottomSum = Arrays.stream(Arrays.copyOfRange(rowSums, r + 1, rowSums.length)).sum();

		// System.out.printf("- %d vs %d%n", topSum, bottomSum);

		if (topSum != bottomSum) {
			return false;
		}

		long leftSum = Arrays.stream(Arrays.copyOfRange(colSums, 0, c)).sum();
		long rightSum = Arrays.stream(Arrays.copyOfRange(colSums, c + 1, colSums.length)).sum();

		if (leftSum != rightSum) {
			return false;
		}

		// System.out.printf("- %d vs %d%n", leftSum, rightSum);

		return true;
	}

}
