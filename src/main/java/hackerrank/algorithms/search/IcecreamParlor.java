package hackerrank.algorithms.search;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/icecream-parlor
 */
public class IcecreamParlor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		for (int i = 0; i < cnt; i++) {
			int amt = scanner.nextInt();
			int length = scanner.nextInt();
			int[] costs = new int[length];
			for (int j = 0; j < length; j++) {
				costs[j] = scanner.nextInt();
			}
			printTwoIndices(amt, costs);
		}
	}

	public static void printTwoIndices(int amt, int[] costs) {
		for (int first = 0; first < costs.length - 1; first++) {
			for (int second = first + 1; second < costs.length; second++) {
				if (costs[first] + costs[second] == amt) {
					System.out.println((first + 1) + " " + (second + 1));
					return;
				}
			}
		}
	}

	@Test
	public void test() {
		String input =
				"2\n" +
				"4\n" +
				"5\n" +
				"1 4 5 3 2\n" +
				"4\n" +
				"4\n" +
				"2 2 4 3";

		InputStream is = new ByteArrayInputStream(input.getBytes());

		Scanner scanner = new Scanner(is);
		int cnt = scanner.nextInt();
		for (int i = 0; i < cnt; i++) {
			int amt = scanner.nextInt();
			int length = scanner.nextInt();
			int[] costs = new int[length];
			for (int j = 0; j < length; j++) {
				costs[j] = scanner.nextInt();
			}
			System.out.println("# Test " + i);
			System.out.println("- amt : " + amt);
			System.out.println("- costs : " + Arrays.toString(costs));
			System.out.print("- indices : ");
			printTwoIndices(amt, costs);
		}
	}

}
