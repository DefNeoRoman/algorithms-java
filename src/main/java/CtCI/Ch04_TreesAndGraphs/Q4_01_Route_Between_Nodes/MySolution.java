package CtCI.Ch04_TreesAndGraphs.Q4_01_Route_Between_Nodes;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 너비 우선 탐색을 위해 Queue를 이용하여 Iterative하게 구현 (최단 거리찾을 때 유용)
 */
public class MySolution {

	@Test
	public void test() {
		Graph graph = createNewGraph();
		Vertex[] vertices = graph.getVertices();

		assertTrue(search(graph, vertices[3], vertices[5]));
		assertFalse(search(graph, vertices[1], vertices[4]));
		assertFalse(search(graph, vertices[2], vertices[0]));
		assertTrue(search(graph, vertices[0], vertices[5]));
	}

	public static boolean search(Graph graph, Vertex start, Vertex end) {
		System.out.println("============================================");
		Queue<Vertex> queue  = new LinkedList<>();

		queue.add(start);
		System.out.println(queue);

		Vertex current;
		while (!queue.isEmpty()) {
			current = queue.remove();
			System.out.println("remove # " + queue);

			for (Vertex adjacent : current.getAdjacents()) {
				if (adjacent == end) {
					return true;
				} else {
					queue.add(adjacent);
					System.out.println("add # " + queue);
				}
			}
		}

		return false;
	}

	public static Graph createNewGraph() {
		Graph graph = new Graph();
		Vertex[] vertices = new Vertex[6];

		vertices[0] = new Vertex("a", 3);
		vertices[1] = new Vertex("b", 0);
		vertices[2] = new Vertex("c", 0);
		vertices[3] = new Vertex("d", 1);
		vertices[4] = new Vertex("e", 1);
		vertices[5] = new Vertex("f", 0);

		vertices[0].addAdjacent(vertices[1]);
		vertices[0].addAdjacent(vertices[2]);
		vertices[0].addAdjacent(vertices[3]);
		vertices[3].addAdjacent(vertices[4]);
		vertices[4].addAdjacent(vertices[5]);

		for (int i = 0; i < 6; i++) {
			graph.addVertex(vertices[i]);
		}

		return graph;
	}

}
