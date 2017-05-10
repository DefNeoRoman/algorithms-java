package codility.countries_count;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://codility.com/tasks/countries_count/
 * https://codility.com/tickets/try3XMU4W-J2J/
 */
public class Solution {

	public static void main(String[] args) {
		int[][] A = {
			new int[]{5, 4, 4},
			new int[]{4, 3, 4},
			new int[]{3, 2, 4},
			new int[]{2, 2, 2},
			new int[]{3, 3, 4},
			new int[]{1, 4, 4},
			new int[]{4, 1, 1}
		};
		Solution s = new Solution();
		System.out.println(s.solution(A));
	}

	private static final int COUNTED = Integer.MIN_VALUE;

	public int solution(int[][] A) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				if (A[i][j] == COUNTED) {
					continue;
				}
				count++;
				expand(A, i, j);
			}
		}
		return count;
	}

	private void expand(int[][] A, int i, int j) {
		int country = A[i][j];
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{i, j});
		A[i][j] = COUNTED;
		while (!queue.isEmpty()) {
			int[] point = queue.poll();
			int[][] neighbors = {
				new int[]{point[0], point[1] - 1},
				new int[]{point[0], point[1] + 1},
				new int[]{point[0] - 1, point[1]},
				new int[]{point[0] + 1, point[1]},
			};
			for (int[] neighbor : neighbors) {
				if (0 <= neighbor[0] && neighbor[0] < A.length && 0 <= neighbor[1] && neighbor[1] < A[0].length) {
					if (A[neighbor[0]][neighbor[1]] == country) {
						queue.offer(new int[]{neighbor[0], neighbor[1]});
						A[neighbor[0]][neighbor[1]] = COUNTED;
					}
				}
			}
		}
	}

}
