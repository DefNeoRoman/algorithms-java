package seo.dale.algorithm.graph;

import org.junit.Test;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class AdjacencyListTest {

	@Test
	public void test() {
		int vertexCnt = 7;
		int edgeCnt = 6;
		int[] starts = {1, 2, 2, 3, 5, 5};
		int[] ends = {2, 4, 5, 4, 6, 7};

		AdjacencyList adjacencyList = new AdjacencyList(vertexCnt);
		for (int i = 0; i < edgeCnt; i++) {
			adjacencyList.addEdge(starts[i], ends[i]);
		}

		adjacencyList.printAdjacencyList();
	}

}