package hackerrank.algorithms.greedy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/greedy-florist
 */
public class GreedyFlorist {

	@Test
	public void test2() {
		assertEquals(13, findMinCost2(new int[]{2, 5, 6}, 4));
		assertEquals(13, findMinCost2(new int[]{2, 5, 6}, 3));
		assertEquals(15, findMinCost2(new int[]{2, 5, 6}, 2));
		assertEquals(22, findMinCost2(new int[]{2, 5, 6}, 1));
	}

	@Test
	public void test1() {
		assertEquals(13, findMinCost(new int[]{2, 5, 6}, 4));
		assertEquals(13, findMinCost(new int[]{2, 5, 6}, 3));
		assertEquals(15, findMinCost(new int[]{2, 5, 6}, 2));
		assertEquals(22, findMinCost(new int[]{2, 5, 6}, 1));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCosts = scanner.nextInt();
		int numOfPeople = scanner.nextInt();
		int[] costArray = new int[numOfCosts];
		for (int i = 0; i < numOfCosts; i++) {
			costArray[i] = scanner.nextInt();
		}
		int minCost = findMinCost(costArray, numOfPeople);
		System.out.println(minCost);
	}

	public static int findMinCost2(int[] costArray, int numOfPeople) {
		Arrays.sort(costArray);

		int result = 0;
		for (int i = costArray.length - 1; i > -1; i--) {
			int times = ((costArray.length - 1 - i) / numOfPeople) + 1;
			result += costArray[i] * times;
		}

		return result;
	}

	public static int findMinCost(int[] costArray, int numOfPeople) {
		Arrays.sort(costArray);

		int total = 0;
		int times = 1;
		int costIdx = costArray.length - 1;
		while (true) {
			for (int personIdx = 0; personIdx < numOfPeople; personIdx++) {
				int price = costArray[costIdx] * times;
				// System.out.printf("Sell the product # %s to the customer # %s at %s.\n", costIdx, personIdx, price);
				total += price;
				costIdx--;
				if (costIdx < 0) {
					break;
				}
			}
			if (costIdx < 0) {
				break;
			}
			times++;
		}

		return total;
	}


}
