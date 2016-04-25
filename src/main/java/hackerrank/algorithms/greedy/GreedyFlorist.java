package hackerrank.algorithms.greedy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/greedy-florist
 */
public class GreedyFlorist {

	@Test
	public void test() {
		//assertEquals(13, findMinCost(new int[]{2, 5, 6}, 3));
		assertEquals(15, findMinCost(new int[]{2, 5, 6}, 2));
		assertEquals(22, findMinCost(new int[]{2, 5, 6}, 1));
	}


	public int findMinCost(int[] costArray, int numOfPeople) {
		int numOfCosts = costArray.length;
		if (numOfCosts <= numOfPeople) {
			// return sum all costs
		}

		Arrays.sort(costArray);

		int total = 0;
		int times = 1;
		int costIdx = costArray.length - 1;
		while (costIdx > 0) {
			for (int personIdx = 0; personIdx < numOfPeople; personIdx++) {
				if (costIdx < 0) {
					break;
				}
				int price = costArray[costIdx] * times;
				System.out.printf("Sell the product # %s to the customer # %s at %s.\n", costIdx, personIdx, price);
				total += price;
				costIdx--;
			}
			times++;
		}

		return total;
	}


}
