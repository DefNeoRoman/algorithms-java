package CtCI.Ch08_RecursionAndDynamicProgramming.Q8_02_Robot_in_a_Grid;

import java.util.ArrayList;

public class MySolution {

	private boolean[][] maze;

	public MySolution(boolean[][] maze) {
		this.maze = maze;
	}

	public ArrayList<Point> getPath() {
		ArrayList<Point> path = new ArrayList<>();
		if (canReach(maze.length - 1, maze[0].length - 1, path, 0)) {
			return path;
		}
		return null;
	}

	public boolean canReach(int row, int column, ArrayList<Point> path, int level) {
		System.out.printf(indent(level) + "Can Reach at (%s, %s)?%n", row, column);

		if (row < 0 || column < 0) {
			System.out.println(indent(level) + "NO!!!");
			return false;
		}

		boolean reachedAtStart = row == 0 && column == 0;
		// boolean canReachLeft = canReach(row, column - 1, path, level + 1);
		// boolean canReachTop = canReach(row - 1, column, path, level + 1);

		if (reachedAtStart || canReach(row, column - 1, path, level + 1) || canReach(row - 1, column, path, level + 1)) {
			Point point = new Point(row, column);
			path.add(point);
			System.out.println(indent(level) + "Reached at " + point);
			System.out.println(indent(level) + path);
			return true;
		}

		return false;
	}

	public static String indent(int level) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < level; i++) {
			builder.append(". ");
		}
		return builder.toString();
	}

}
