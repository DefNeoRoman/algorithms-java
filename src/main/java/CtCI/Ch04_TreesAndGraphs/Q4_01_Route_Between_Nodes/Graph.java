package CtCI.Ch04_TreesAndGraphs.Q4_01_Route_Between_Nodes;

public class Graph {

	private static int MAX_VERTICES = 6;

	private Vertex[] vertices;
	public int size;

	public Graph() {
		vertices = new Vertex[MAX_VERTICES];
		size = 0;
	}

	public void addVertex(Vertex vertex) {
		if (size >= vertices.length) {
			throw new RuntimeException("Graph full");
		}
		vertices[size++] = vertex;
	}

	public Vertex[] getVertices() {
		return vertices;
	}

}
