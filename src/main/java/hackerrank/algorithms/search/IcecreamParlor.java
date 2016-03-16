package hackerrank.algorithms.search;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
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

	// O(n*log(n))
	public static void printTwoIndices(int amt, int[] costs) {
		HashMap<Integer, Integer> maps = new HashMap<>();

		for(int i = 0; i < costs.length; i++){
			maps.put(costs[i], i);
		}

		//array.sort consumes O(n*log(n))
		Arrays.sort(costs);

		//for loop and binary search both together consumes O(n*log(n))
		for (int i = 0; i < costs.length - 1; i++) {
			int index = Arrays.binarySearch(costs, i + 1, costs.length, amt - costs[i]);

			if(index >= 0) {
				//we need to increment by 1, in case, two duplicates make up M
				int startIndex = costs[index] == costs[i] ? maps.get(costs[i]) : maps.get(costs[i]) + 1;
				int endIndex = maps.get(costs[index]) + 1;

				if (startIndex > endIndex)
					System.out.println(endIndex + " " + startIndex);
				else
					System.out.println(startIndex + " " + endIndex);
				return;
			}
		}
	}

	// O(n^2)
	public static void printTwoIndicesSlow(int amt, int[] costs) {
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
