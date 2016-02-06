package seo.dale.algorithm.graph;

public class Node {

	private boolean visited;
	private int data;
	
	public Node(int data) {
		visited = false;
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
