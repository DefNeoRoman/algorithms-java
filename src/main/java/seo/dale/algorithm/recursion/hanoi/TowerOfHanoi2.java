package seo.dale.algorithm.recursion.hanoi;

import org.junit.Test;

public class TowerOfHanoi2 {

	public static void towerOfHanoi(int n, char from, char to, char via) {
		if (n == 1) {
			move(1, from, to);
			return;
		}

		towerOfHanoi(n - 1, from, via, to);
		move(n, from, to);
		towerOfHanoi(n - 1, via, to, from);
	}

	private static void move(int n, char from, char via) {
		System.out.printf("Move disk %d from %c to %c%n", n, from, via);
	}

	@Test
	public void test() {
		towerOfHanoi(3, 'A', 'C', 'B');
	}

}
