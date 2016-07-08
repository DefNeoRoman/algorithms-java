package seo.dale.algorithm.graph.beginner;

import org.junit.Before;
import org.junit.Test;

public class GraphSearchTest {

	private Graph graph;

	@Before
	public void setUp() throws Exception {
		Vertex vertexA = new Vertex('A');
		Vertex vertexB = new Vertex('B');
		Vertex vertexC = new Vertex('C');
		Vertex vertexD = new Vertex('D');
		Vertex vertexE = new Vertex('E');
		Vertex vertexF = new Vertex('F');
		Vertex[] vertexes = {vertexA, vertexB, vertexC, vertexD, vertexE, vertexF};

		graph = new Graph(vertexes);

		graph.addEdges(vertexA, vertexB, vertexC, vertexD);
		graph.addEdges(vertexB, vertexB, vertexE, vertexF);
		graph.addEdges(vertexC, vertexA, vertexF);
		graph.addEdges(vertexD, vertexA);
		graph.addEdges(vertexE, vertexB);
		graph.addEdges(vertexF, vertexB, vertexC);
	}

	@Test
	public void testDepthFirstSearch() {
		graph.depthFirstSearch(); // A, B, E, F, C, D
	}

	@Test
	public void testBreadthFirstSearch() {
		graph.breadthFristSearch(); // A, B, C, D, E, F
	}

}
