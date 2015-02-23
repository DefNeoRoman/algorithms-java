package seo.dale.algorithm.dynamic;

import java.util.Arrays;

public class PathCounter {

	/**
	 * Counts the number of shortest paths from (0,0) to (m, m).
	 * You can only move to 1. (0 is a hole.)b
	 */
	public int countShourtestPaths(int[][] map) {
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map[0].length; j++) {
				if (map[i][j] == 0) continue;
				map[i][j] = map[i][j-1] + map[i-1][j];
			}
		}
		
		for (int[] row : map) {
			System.out.println(Arrays.toString(row));
		}
		
		return map[map.length -1][map[0].length -1];
	}
	
	/**
	 * Get the maximum joy you can reach on the way.
	 */
	public int maxJoyOnWay(int[][] map) {
		// first row
		for (int j = 1; j < map[0].length; j++) {
			map[0][j] = map[0][j] + map[0][j-1];
		}
		
		// first col
		for (int i = 1; i < map.length; i++) {
			map[i][0] = map[i][0] + map[i-1][0];
		}
		
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map[0].length; j++) {
				map[i][j] = map[i][j] + Math.max(map[i][j-1], map[i-1][j]);
			}
		}
		
		for (int[] row : map) {
			System.out.println(Arrays.toString(row));
		}
		
		return map[map.length -1][map[0].length -1];
	}
	
	
}
