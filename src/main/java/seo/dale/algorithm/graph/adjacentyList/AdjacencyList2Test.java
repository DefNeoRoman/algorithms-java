package seo.dale.algorithm.graph.adjacentyList;

import org.junit.Test;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class AdjacencyList2Test {

	/**
	 7 6
	 1 2 1
	 2 4 1
	 2 5 1
	 3 4 1
	 5 6 1
	 5 7 1
	 */

	@Test
	public void test() {
		int vertexCnt = 7;
		int edgeCnt = 6;
		int[] starts = {1, 2, 2, 3, 5, 5};
		int[] ends = {2, 4, 5, 4, 6, 7};

		AdjacencyList2 adjacencyList2 = new AdjacencyList2(vertexCnt);
		for (int i = 0; i < edgeCnt; i++) {
			adjacencyList2.addEdge(starts[i], ends[i], 1);
		}

		adjacencyList2.printAdjacencyList();
	}

}