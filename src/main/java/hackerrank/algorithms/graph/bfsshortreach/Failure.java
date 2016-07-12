/**
 * https://www.hackerrank.com/challenges/bfsshortreach
 */
package hackerrank.algorithms.graph.bfsshortreach;

import java.util.*;

public class Failure {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTests = scan.nextInt();
		while (numTests-- > 0) {
			int numVertices = scan.nextInt();
			int numEdges = scan.nextInt();
			int[][] edges = new int[numEdges][2];
			for (int i = 0; i < numEdges; i++) {
				int[] edge = new int[2];
				edge[0] = scan.nextInt();
				edge[1] = scan.nextInt();
				edges[i] = edge;
			}
			int start = scan.nextInt();
			solve(numVertices, numEdges, edges, start);
			System.out.println();
		}
		scan.close();
	}

	public static void solve(int numVertices, int numEdges, int[][] edges, int startData) {
		List<Vertex> vertexList = new LinkedList<>();
		Map<Vertex, List<Vertex>> adjacencyListMap = new HashMap<>();
		for (int i = 1; i < numVertices  + 1 ; i++) {
			Vertex vertex = new Vertex(i);
			vertexList.add(vertex);
			adjacencyListMap.put(vertex, new LinkedList<>());
		}

		for (int[] edge : edges) {
			adjacencyListMap.get(vertexList.get(edge[0] - 1)).add(vertexList.get(edge[1] - 1));
			adjacencyListMap.get(vertexList.get(edge[1] - 1)).add(vertexList.get(edge[0] - 1));
		}

		// System.out.println(adjacencyListMap);

		Vertex start = vertexList.get(startData - 1);
		for (int i = 0; i < numVertices; i++) {
			Vertex end = vertexList.get(i);
			if (end.data == start.data) {
				continue;
			}

			for (Vertex vertex : vertexList) {
				vertex.visited = false;
			}

			Queue<Vertex> queue = new LinkedList<>();
			queue.add(start);
			start.visited = true;

			boolean found = false;
			int distance = 0;
			while (!queue.isEmpty()) {
				distance++;
				Vertex vertex = queue.remove();
				List<Vertex> neighbors = adjacencyListMap.get(vertex);
				for (Vertex neighbor : neighbors) {
					if (neighbor.visited == false) {
						if (neighbor.data == end.data) {
							found = true;
							break;
						} else {
							neighbor.visited = true;
							queue.add(neighbor);
						}
					}
				}
				if (found) {
					break;
				}
			}

			if (found && distance > 0) {
				// System.out.println(end + " -> " + distance * 6);
				System.out.print(distance * 6 + " ");
			} else {
				// System.out.println(end + " -> " + -1);
				System.out.print(-1 + " ");
			}

		}
	}

	static class Vertex {

		int data;
		boolean visited;

		public Vertex(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return data + "";
		}
	}

}
