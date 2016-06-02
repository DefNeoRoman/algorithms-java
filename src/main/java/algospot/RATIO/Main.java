package algospot.RATIO;

import java.util.Scanner;

/**
 * 승률올리기
 * https://www.algospot.com/judge/problem/read/RATIO
 *
 * 왜 통과를 못했는지 이해를 못했음
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		for (int i = 0; i < count; i++) {
			int numOfPlays = scanner.nextInt();
			int numOfWins = scanner.nextInt();
			System.out.println(ratio(numOfPlays, numOfWins));
		}
		scanner.close();
	}

	/**
	 * Mathematically
	 * X >= numOfPlays^2 / (99 * numOfPlays - 100 * numOfWins)
	 */
	public static long ratio(double numOfPlays, double numOfWins) {
		if (numOfPlays <= numOfWins) {
			return -1;
		}

		double result = (numOfPlays * numOfPlays) / (99d * numOfPlays - 100d * numOfWins);

		if (Double.isInfinite(result)) {
			return -1;
		}

		return (long) Math.ceil(result);
	}

	/**
	 * Brute Force : Add 1 until it's 0.1 greater.
	 * Takes forever if the arguments are big.
	 */
	public static long ratio2(double numOfPlays, double numOfWins) {
		if (numOfPlays <= numOfWins) {
			return -1;
		}

		double current = numOfWins / numOfPlays;
		double target = current + 0.01;
		System.out.println("# current : " + current);
		System.out.println("# target : " + target);
		double result = 0;
		while (current < target) {
			result++;
			current = (numOfWins + result) / (numOfPlays + result);
			System.out.printf("- %f = (%f + %f) / (%f + %f)%n", current, numOfWins, result, numOfPlays, result);
		}
		return (long) result;
	}

}
