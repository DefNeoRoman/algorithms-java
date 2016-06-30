package hackerrank.contest.weekOfCode21.lazySorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
		}
		solve(length, array);
	}

	public static void solve(int length, int[] array) {
		if (isAlreadySorted(array)) {
			System.out.println(".000000");
			return;
		}

		long probability = calculateProbability(length, array);
		System.out.println(probability + ".000000");
	}

	public static boolean isAlreadySorted(int[] array) {
		int max = 0;
		for (int num : array) {
			if (num < max) {
				return false;
			}
			max = num;
		}
		return true;
	}

	public static long calculateProbability(int length, int[] array) {
		Map<Integer, Integer> counterMap = new HashMap<>();
		for (int num : array) {
			int count = counterMap.containsKey(num) ? counterMap.get(num) + 1 : 1;
			counterMap.put(num, count);
		}

		long probability = calculateFactorial(length);
		for (Integer value : counterMap.values()) {
			if (value > 1) {
				probability /= calculateFactorial(value);
			}
		}

		return probability;
	}

	public static long calculateFactorial(int num) {
		long factorial = num;
		while(--num > 0) {
			factorial *= num;
		}
		return factorial;
	}

}
