/**
 * https://github.com/havelessbemore/hackerrank/blob/master/algorithms/graph_theory/bfsshortreach.java 참고해서 재구성
 */
package hackerrank.algorithms.graph.bfsshortreach;

import java.io.IOException;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		for (byte cnt = scan.nextByte(); cnt-- > 0;) {
			int numVertices = scan.nextInt();
			int numEdges = scan.nextInt();

			Vertex[] vertexes = new Vertex[numVertices];
			for (int i = 0; i < numVertices; i++) {
				vertexes[i] = new Vertex(i);
			}

			for (int i = 0; i < numEdges; i++) {
				int x = scan.nextInt() - 1;
				int y = scan.nextInt() - 1;
				vertexes[x].edges.add(vertexes[y]);
				vertexes[y].edges.add(vertexes[x]);
			}

			int start = scan.nextInt() - 1;

			final int[] distances = solve(numVertices, start, vertexes);

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < numVertices; i++) {
				if (i != start) {
					sb.append(distances[i] + " ");
				}
			}
			System.out.println(sb);
		}
	}

	private static int[] solve(int size, int start, Vertex[] vertexes) {
		// Initialize min distances
		int[] distances = new int[size];
		Arrays.fill(distances, -1);

		// Add the start vertex to the queue
		Queue<Vertex> queue = new LinkedList<>();
		queue.add(vertexes[start]);
		distances[start] = 0;

		// Breath first search
		while (!queue.isEmpty()) {
			Vertex vertex = queue.poll();
			int curDistance = distances[vertex.id];

			// Calculate minDistances for unvisited edges
			for (Vertex edge : vertex.edges) {
				if (distances[edge.id] > -1) {
					continue; // Already visited
				}

				queue.add(edge);
				distances[edge.id] = 6 + curDistance;
			}
		}

		return distances;
	}

	private static class Vertex {
		public int id;
		public List<Vertex> edges;

		public Vertex(final int id) {
			this.id = id;
			this.edges = new LinkedList<>();
		}

		@Override
		public String toString() {
			return String.format("V{%d}", id);
		}
	}

}
