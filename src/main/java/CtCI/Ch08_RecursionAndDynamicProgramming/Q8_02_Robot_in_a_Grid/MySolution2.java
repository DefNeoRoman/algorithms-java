package CtCI.Ch08_RecursionAndDynamicProgramming.Q8_02_Robot_in_a_Grid;

import java.util.ArrayList;
import java.util.List;

public class MySolution2 {

	private boolean[][] maze;

	private List<List<Point>> pathList = new ArrayList<>();

	private List<Point> currentPath;

	public MySolution2(boolean[][] maze) {
		this.maze = maze;
	}

	public List<List<Point>> getPath() {
		currentPath = new ArrayList<>();
		if (canReach(maze.length - 1, maze[0].length - 1, 0)) {
			return pathList;
		}
		return null;
	}

	public boolean canReach(int row, int column, int level) {
		System.out.printf(indent(level) + "Can Reach at (%s, %s)?%n", row, column);

		if (row < 0 || column < 0) {
			System.out.println(indent(level) + "NO!!!");
			return false;
		}

		boolean reachedAtStart = row == 0 && column == 0;
		boolean reachedAtEnd = row == maze.length -1 && column == maze[0].length - 1;
		boolean canReachLeft = canReach(row, column - 1, level + 1);
		boolean canReachTop = canReach(row - 1, column, level + 1);

		if (reachedAtStart || canReachLeft || canReachTop) {
			Point point = new Point(row, column);
			currentPath.add(point);

			System.out.println(indent(level) + "Reached at " + point);
			System.out.println(indent(level) + currentPath);

			if (reachedAtEnd) {
				System.out.println(indent(level) + "Reached at end!!");
				pathList.add(currentPath);
				currentPath = new ArrayList<>();
			}

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
