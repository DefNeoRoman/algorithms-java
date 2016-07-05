package seo.dale.algorithm.graph.adjacentyList;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class AdjacencyList {

	private List<Integer>[] edgesList;

	public AdjacencyList(int vertexCnt) {
		edgesList = new List[vertexCnt];
		for (int i = 0; i < edgesList.length; i++) {
			edgesList[i] = new LinkedList<>();
		}
	}

	public void addEdge(int start, int end) {
		edgesList[start].add(end);
	}

	public void printAdjacencyList() {
		for (int i = 0; i < edgesList.length; i++) {
			System.out.println(i + "->" + edgesList[i]);
		}
	}

}
