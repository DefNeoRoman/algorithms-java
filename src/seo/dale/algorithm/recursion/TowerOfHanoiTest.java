package seo.dale.algorithm.recursion;

import org.junit.Test;

public class TowerOfHanoiTest {

	@Test
	public void test() {
		System.out.println("# TowerOfHanoi.solveTowers(1, 'A', 'C', 'B')");
		TowerOfHanoi.solveTowers(1, 'A', 'C', 'B');
		System.out.println("# TowerOfHanoi.solveTowers(2, 'A', 'C', 'B')");
		TowerOfHanoi.solveTowers(2, 'A', 'C', 'B');
		System.out.println("# TowerOfHanoi.solveTowers(3, 'A', 'C', 'B')");
		TowerOfHanoi.solveTowers(3, 'A', 'C', 'B');
		System.out.println("# TowerOfHanoi.solveTowers(4, 'A', 'C', 'B')");
		TowerOfHanoi.solveTowers(4, 'A', 'C', 'B');
	}

}
