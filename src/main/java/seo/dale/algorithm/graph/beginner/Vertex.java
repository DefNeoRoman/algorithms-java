package seo.dale.algorithm.graph.beginner;

import java.util.List;

public class Vertex {

	char data;
	boolean visited;

	public Vertex(char data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return data + "(" + visited + ")";
	}
}
