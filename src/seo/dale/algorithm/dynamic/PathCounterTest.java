package seo.dale.algorithm.dynamic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PathCounterTest {

	private PathCounter shourtestPath = new PathCounter();
	
	@Test
	public void testCountShourtestPaths() {
		int[][] map = {
				{1, 1, 1, 1, 1},
				{1, 1, 0, 0, 1},
				{1, 1, 1, 1, 1},
				{1, 1, 1, 0, 1},
				{0, 0, 1, 1, 1}
		};
		
		assertEquals(11, shourtestPath.countShourtestPaths(map));
	}
	
	@Test
	public void testCountShourtestPaths2() {
		int[][] map = {
				{1, 1, 1, 1, 0},
				{1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1},
				{1, 0, 1, 1, 1},
				{1, 1, 1, 1, 1}
		};
		
		assertEquals(53, shourtestPath.countShourtestPaths(map));
	}
	
	@Test
	public void testMaxJoyOnWay() {
		int[][] map = {
				{1, 2, 2, 1, 5},
				{1, 4, 4, 3, 1},
				{2, 1, 1, 1, 2},
				{1, 3, 5, 1, 1},
				{1, 5, 1, 2, 2}
		};
		
		assertEquals(22, shourtestPath.maxJoyOnWay(map));
	}

}
