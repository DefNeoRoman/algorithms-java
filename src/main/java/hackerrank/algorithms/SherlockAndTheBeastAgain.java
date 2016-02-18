package hackerrank.algorithms;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-the-beast
 */
public class SherlockAndTheBeastAgain {

	public static long getlargestDecentNumber(int numOfDigits) {
		int[] combination = getFiveThreeCombination(numOfDigits);
		if (combination == null) {
			return -1;
		}
		return buildLargetNumber(combination[0], combination[1]);
	}

	private static int[] getFiveThreeCombination(int numOfDigits) {
		int numOfFives = numOfDigits;

		while (numOfFives >= 0 && (numOfFives % 3) != 0) {
			numOfFives -= 5;
		}

		if (numOfFives < 0) {
			return null;
		} else {
			int numOfThrees = numOfDigits - numOfFives;
			return new int[]{numOfFives, numOfThrees};
		}
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
		int cnt = input.nextInt();
		for (int i = 0; i < cnt; i++) {
			int num = input.nextInt();
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
