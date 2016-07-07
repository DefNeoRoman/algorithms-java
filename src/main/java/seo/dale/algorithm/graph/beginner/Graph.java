package seo.dale.algorithm.graph.beginner;

import java.util.*;

public class Graph {

	private Map<Vertex, List<Vertex>> adjacencyListMap;

	public Graph(Vertex[] vertexes) {
		adjacencyListMap = new HashMap<>();
		for (Vertex vertex : vertexes) {
			adjacencyListMap.put(vertex, new LinkedList<>());
		}
	}

	public void addEdges(Vertex parent, Vertex... children) {
		List<Vertex> childList = adjacencyListMap.get(parent);
		for (Vertex child : children) {
			childList.add(child);
		}
	}

	public Vertex getUnvisitedChild(Vertex parent) {
		List<Vertex> childList = adjacencyListMap.get(parent);
		for (Vertex child : childList) {
			if (child.visited == false) {
				return child;
			}
		}
		return null;
	}

	public void depthFirstSearch(Vertex root) {
		Stack<Vertex> stack = new Stack<>();
		stack.push(root);
		root.visited = true;
		System.out.println(root);

		while (!stack.isEmpty()) {
			Vertex parent = stack.peek();
			Vertex child = getUnvisitedChild(parent);
			if (child != null) {
				stack.push(child);
				child.visited = true;
				System.out.println(child);
			} else {
				stack.pop();
			}
		}
	}

}
