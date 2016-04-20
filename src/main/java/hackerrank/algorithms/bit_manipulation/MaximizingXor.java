package hackerrank.algorithms.bit_manipulation;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/maximizing-xor
 */
public class MaximizingXor {

	@Test
	public void test() {
		assertEquals(7, maximizeXor(10, 15));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		int r = scanner.nextInt();
		System.out.println(maximizeXor(l, r));
	}

	public static int maximizeXor(int from, int to) {
		int max = Integer.MIN_VALUE;
		for (int i = from; i <= to; i++) {
			for (int j = i; j <= to; j++) {
				max = Math.max(i ^ j, max);
			}
		}
		return max;
	}

}
