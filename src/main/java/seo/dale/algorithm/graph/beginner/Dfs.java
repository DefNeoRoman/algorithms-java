package seo.dale.algorithm.graph.beginner;

public class Dfs {

	public static void main(String[] args) {
		Vertex vertexA = new Vertex('A');
		Vertex vertexB = new Vertex('B');
		Vertex vertexC = new Vertex('C');
		Vertex vertexD = new Vertex('D');
		Vertex vertexE = new Vertex('E');
		Vertex vertexF = new Vertex('F');
		Vertex[] vertexes = {vertexA, vertexB, vertexC, vertexD, vertexE, vertexF};

		Graph graph = new Graph(vertexes);

		graph.addEdges(vertexA, vertexB, vertexC, vertexD);
		graph.addEdges(vertexB, vertexB, vertexE, vertexF);
		graph.addEdges(vertexC, vertexA, vertexF);
		graph.addEdges(vertexD, vertexA);
		graph.addEdges(vertexE, vertexB);
		graph.addEdges(vertexF, vertexB, vertexC);

		graph.depthFirstSearch(vertexA); // A, B, E, F, C, D
	}

}
