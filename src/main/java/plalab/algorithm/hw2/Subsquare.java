package plalab.algorithm.hw2;

public class Subsquare implements Comparable<Subsquare> {
	private final int row;
	private final int col;
	private final int size;

	public Subsquare(int row, int col, int size) {
		this.row = row;
		this.col = col;
		this.size = size;
	}

	@Override
	public boolean equals(Object other) {
		Subsquare otherSubsquare = (Subsquare) other;
		return this.row == otherSubsquare.row && this.col == otherSubsquare.col && this.size == otherSubsquare.size;
	}

	@Override
	public String toString() {
		return "Subsquare [row=" + this.row + ", col=" + this.col + ", size=" + this.size + "]";
	}

	@Override
	public int compareTo(Subsquare o) {
		return this.size - o.size;
	}
	
	public int getSize() {
		return size;
	}
	
	
}
