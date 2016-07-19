package seo.dale.algorithm.dynamic.largestSquare;

/**
 * Dynamic Programing
 * 왼쪽 위 대각산 방향으로 체크해나가면서 계산.
 * 이 전 단계에서 구해놓은 결과값을 재활용 한다.
 * Time Space Complexity : O(mn)
 */
public class Solution2 {

	// 메모이제이션 용 배열
	private Integer[][] memo;

	public int findLargestSquare(char[][] matrix) {
		int height = matrix.length;
		int width = height > 0 ? matrix[0].length : 0;

		memo = new Integer[height][width];

		int maxSize = 0;
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				int size = findLargestSquareAt(row, col, matrix);
				maxSize = Math.max(maxSize, size);
			}
		}
		return maxSize * maxSize;
	}

	private int findLargestSquareAt(int row, int col, char[][] matrix) {
		// 기저 조건
		if (row < 0 || col < 0)
			return 0;

		// 전 단계에서 배열에 결과값을 저장해놨다면 재활용
		if (memo[row][col] != null)
			return memo[row][col];

		// X 칸은 무조건 0
		if (matrix[row][col] == 'X')
			return memo[row][col] = 0;

		// O 칸에 대해서는 재귀적으로 LargestSquare 계산
		// 일단 바로 왼쪽 칸과 위 칸 그리고 왼쪽 위칸의 LargestSquare 를 각각 구함
		int left = findLargestSquareAt(row, col - 1, matrix);
		int up = findLargestSquareAt(row - 1, col, matrix);
		int leftUp = findLargestSquareAt(row - 1, col - 1, matrix);

		// 셋 중에서 최소값에 1을 더한 값이 이번 칸의 LargestSquare
		int min = Math.min(left, up);
		min = Math.min(min, leftUp);

		return memo[row][col] = min + 1;
	}

}
