package CtCI.Ch04_TreesAndGraphs.Q4_01_Route_Between_Nodes;

public class Vertex {

	private State state;
	private String data;
	private Vertex[] adjacents;
	public int size;

	public Vertex(String data, int adjacentLength) {
		this.data = data;
		size = 0;
		adjacents = new Vertex[adjacentLength];
	}

	public void addAdjacent(Vertex vertex) {
		if (size >= adjacents.length) {
			throw new RuntimeException("No more adjacent can be added");
		}
		adjacents[size++] = vertex;
	}

	public Vertex[] getAdjacents() {
		return adjacents;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return data;
	}
}
