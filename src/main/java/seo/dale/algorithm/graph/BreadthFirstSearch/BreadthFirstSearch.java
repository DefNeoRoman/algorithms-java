/**
 * http://theoryofprogramming.com/2014/12/25/breadth-first-search-algorithm/
 */
package seo.dale.algorithm.graph.BreadthFirstSearch;

import java.util.List;

public class BreadthFirstSearch {
	
	public static void search(List<Integer>[] adjacencyLists, int[] parents, int[] levels) {
		int currParent, currLevel = 0;
		levels[0] = currLevel;

		boolean needsToExplore = true;

		while (needsToExplore) {
			needsToExplore = false;
			for (int vertexIdx = 0; vertexIdx < adjacencyLists.length; vertexIdx++) {
				if (levels[vertexIdx] == currLevel) {
					needsToExplore = true;

					currParent = vertexIdx;

					List<Integer> endList = adjacencyLists[vertexIdx];
					for (Integer end : endList) {
						if (levels[end] != -1) {
							continue;
						}

						levels[end] = currLevel + 1;
						parents[end] = currParent;
					}
				}
			}
			currLevel++;
		}
	}

}
