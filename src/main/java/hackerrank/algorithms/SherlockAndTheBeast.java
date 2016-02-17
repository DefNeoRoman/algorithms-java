package hackerrank.algorithms;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-the-beast
 */
public class SherlockAndTheBeast {

	public static long getlargestDecentNumber(int numOfDigits) {
		int[] combination = getFiveThreeCombination(numOfDigits);
		if (combination == null) {
			return -1;
		}
		return buildLargetNumber(combination[0], combination[1]);
	}

	private static int[] getFiveThreeCombination(int numOfDigits) {
		int numOfFives = numOfDigits - (numOfDigits % 3);
		int numOfThrees = numOfDigits - numOfFives;

		while (numOfFives >= 0) {
			if (numOfFives % 3 == 0 && numOfThrees % 5 == 0) {
				return new int[]{numOfFives, numOfThrees};
			}

			numOfFives -= 3;
			numOfThrees = numOfDigits - numOfFives;
		}

		return null;
	}

	private static long buildLargetNumber(int numOfFives, int numOfThrees) {
		StringBuilder builder = new StringBuilder(numOfFives + numOfThrees);
		for (int f = 0; f < numOfFives; f++) {
			builder.append('5');
		}
		for (int t = 0; t < numOfThrees; t++) {
			builder.append('3');
		}

		return Long.valueOf(builder.toString());
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cnt = Integer.valueOf(input.nextLine());
		for (int i = 0; i < cnt; i++) {
			int num = Integer.valueOf(input.nextLine());
			long largestDecentNumber = getlargestDecentNumber(num);
			System.out.println(largestDecentNumber);
		}
	}

	@Test
	public void test() {
		assertEquals(-1L, getlargestDecentNumber(1));
		assertEquals(555L, getlargestDecentNumber(3));
		assertEquals(33333L, getlargestDecentNumber(5));
		assertEquals(55555533333L, getlargestDecentNumber(11));
	}

}
