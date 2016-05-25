package CtCI.Ch08_RecursionAndDynamicProgramming.Q8_02_Robot_in_a_Grid;

import org.junit.Test;
import seo.dale.algorithm.sort.Introduction.library.AssortedMethods;

import java.util.List;

public class MySolution2Test {

	private MySolution2 mySolution;

	@Test
	public void test() {
		int size = 3;
		boolean[][] maze = AssortedMethods.randomBooleanMatrix(size, size, 100);

		AssortedMethods.printMatrix(maze);

		mySolution = new MySolution2(maze);
		List<List<Point>> path = mySolution.getPath();
		if (path != null) {
			System.out.println(path.toString());
		} else {
			System.out.println("No path found.");
		}
	}

}