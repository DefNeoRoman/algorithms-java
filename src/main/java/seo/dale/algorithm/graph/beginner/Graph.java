/**
 * http://www.codeproject.com/Articles/32212/Introduction-to-Graph-with-Breadth-First-Search-BF
 */
package seo.dale.algorithm.graph.beginner;

import java.util.*;

public class Graph {

	private Vertex root;
	private Map<Vertex, List<Vertex>> adjacencyListMap;

	public Graph(Vertex[] vertexes) {
		root = vertexes[0];
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

	public List<Vertex> getUnvisitedChidren(Vertex parent) {
		List<Vertex> unvisitedChildList = new LinkedList<>();
		List<Vertex> childList = adjacencyListMap.get(parent);
		for (Vertex child : childList) {
			if (!child.visited) {
				unvisitedChildList.add(child);
			}
		}
		return unvisitedChildList;
	}

	public Vertex getUnvisitedChild(Vertex parent) {
		List<Vertex> childList = adjacencyListMap.get(parent);
		for (Vertex child : childList) {
			if (!child.visited) {
				return child;
			}
		}
		return null;
	}

	public void depthFirstSearch() {
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

	public void breadthFristSearch() {
		Queue<Vertex> queue = new LinkedList<>();
		queue.add(root);
		root.visited = true;
		System.out.println(root);

		while (!queue.isEmpty()) {
			Vertex parent = queue.remove();
			List<Vertex> children = getUnvisitedChidren(parent);
			for (Vertex child : children) {
				queue.add(child);
				child.visited = true;
				System.out.println(child);
			}
		}
	}

}
