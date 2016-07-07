/**
 * https://www.hackerrank.com/challenges/the-quickest-way-up
 * http://theoryofprogramming.com/2014/12/25/snakes-and-ladders-game-code/
 * https://www.youtube.com/watch?v=19tY6Y90TP0
 * Timout 나서 통과 못함 ㅠㅠ
 */
package hackerrank.algorithms.graph.SnakesAndLadders;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();

		while (cnt-- > 0) {
			int numOfLadders = scan.nextInt();
			Map<Integer, Integer> ladderMap = new HashMap<>();
			while (numOfLadders-- > 0) {
				ladderMap.put(scan.nextInt() - 1, scan.nextInt() - 1);
			}

			int numOfSnakes = scan.nextInt();
			Map<Integer, Integer> snakeMap = new HashMap<>();
			while (numOfSnakes-- > 0) {
				snakeMap.put(scan.nextInt() - 1, scan.nextInt() - 1);
			}

			System.out.println(solve(100, ladderMap, snakeMap));
		}

		scan.close();
	}

	public static int solve(int size, Map<Integer, Integer> ladderMap, Map<Integer, Integer> snakeMap) {
		boolean[] visited = new boolean[size];

		Queue<Entry> queue = new LinkedList<>();

		queue.add(new Entry(0, 0));

		while (!queue.isEmpty()) {
			Entry current = queue.remove();

			if (current.vertex == size - 1) {
				return current.distance;
			}

			int nextDistance = current.distance + 1;

			// roll dices
			for (int i = 0; i < 6; i++) {
				int nextVertex = current.vertex + 1 + i;

				if (nextVertex > size - 1) {
					break;
				}

				if (visited[nextVertex]) {
					continue;
				}

				if (ladderMap.containsKey(nextVertex)) {
					nextVertex = ladderMap.get(nextVertex);
				} else if (snakeMap.containsKey(nextVertex)) {
					nextVertex = snakeMap.get(nextVertex);
				}

				Entry next = new Entry(nextVertex, nextDistance);
				queue.add(next);
				visited[nextDistance] = true;
			}
	}

		return -1;
	}

	static class Entry {
		int vertex;
		int distance;

		public Entry(int vertex, int distance) {
			this.vertex = vertex;
			this.distance = distance;
		}

		@Override
		public String toString() {
			return String.format("(%d)%d", distance, vertex);
		}
	}

}
