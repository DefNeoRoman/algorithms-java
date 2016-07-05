package seo.dale.algorithm.graph.BreadthFirstSearch;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class BreadthFirstSearchTest {

	@Test
	public void test() {
		int vertexCnt = 9;
		int edgeCnt = 12;

		int[][] edges = {
				{0, 1},
				{0, 7},
				{0, 5},
				{1, 2},
				{2, 3},
				{2, 7},
				{2, 8},
				{3, 4},
				{4, 6},
				{4, 8},
				{5, 6},
				{6, 8}
		};

		// Prepare a adjacency lists
		List<Integer>[] adjacencyLists = new List[vertexCnt];
		for (int i = 0; i < vertexCnt; i++) {
			adjacencyLists[i] = new LinkedList<>();
		}

		for (int[] edge : edges) {
			int start = edge[0], end = edge[1];
			adjacencyLists[start].add(end);
		}

		System.out.println("# adjacencyList : ");
		for (List<Integer> adjacencyList : adjacencyLists) {
			System.out.println(adjacencyList);
		}

		// Prepare parents and levels
		int[] levels = new int[vertexCnt];
		int[] parents = new int[vertexCnt];
		for (int i = 0; i < vertexCnt; i++) {
			levels[i] = 0;
			parents[i] = -1;
		}

		// Breadth First Search
		BreadthFirstSearch.search(adjacencyLists, levels, parents);

		for (int i = 0; i < vertexCnt; i++) {
			System.out.printf("%d >> Level is %d, Parent is %d%n", i, levels[i], parents[i]);
		}
	}

}
