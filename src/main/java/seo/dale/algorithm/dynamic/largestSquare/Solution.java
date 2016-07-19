package seo.dale.algorithm.dynamic.largestSquare;

/**
 * 양파 껍질을 벗기듯이 오른쪽 아래 다각선 방향으로 체크하면서 정사각형을 넓혀 나간다.
 * Time Complexity : O((mn)^2)
 * Space Complexity : O(1)
 */
public class Solution {

	public int findLargestSquare(char[][] matrix) {
		int height = matrix.length;
		int width = height > 0 ? matrix[0].length : 0;

		int maxSize = 0;
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				if (matrix[row][col] == 'X') {
					continue;
				}

				int size = findLargestSquareAt(row, col, matrix, height, width);
				maxSize = Math.max(maxSize, size);
			}
		}
		return maxSize * maxSize;
	}

	private int findLargestSquareAt(int row, int col, char[][] matrix, int height, int width) {
		int size = 1;
		while (size + row < height && size + col < width) {
			// 아랫 줄의 오른 쪽 방향 체크
			boolean downRight = true;
			for (int i = col; i <= col + size; i++) {
				if (matrix[row + size][i] == 'X') {
					downRight = false;
					break;
				}
			}

			// 오른 칸의 아래 쪽 방향 체크
			boolean rightDown = true;
			for (int i = row; i <= row + size; i++) {
				if (matrix[i][col + size] == 'X') {
					rightDown = false;
					break;
				}
			}

			// 둘 중에 한 뱡향이라도 맞지 않으면 크기를 늘릴 수 없음
			if (downRight && rightDown)
				size++;
			else
				break;
		}
		return size;
	}

}
