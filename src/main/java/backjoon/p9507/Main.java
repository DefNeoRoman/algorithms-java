package backjoon.p9507;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/9507
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTests = scanner.nextInt();

		while (numOfTests --> 0) {
			int number = scanner.nextInt();
			long count = Main.koong(number);
			System.out.println(count);
		}
	}

	private static long[] memoizationArray;

	public static long koong(int number) {
		if (number < 4) {
			memoizationArray = new long[4];
		} else {
			memoizationArray = new long[number + 1];
		}

		memoizationArray[0] = 1;
		memoizationArray[1] = 1;
		memoizationArray[2] = 2;
		memoizationArray[3] = 4;

		return koongRecursively(number);
	}

	public static long koongRecursively(int number) {
		if (memoizationArray[number] != 0) {
			return memoizationArray[number];
		}

		memoizationArray[number] = koongRecursively(number - 1) + koongRecursively(number - 2) + koongRecursively(number - 3) + koongRecursively(number -4);
		return memoizationArray[number];
	}

}
