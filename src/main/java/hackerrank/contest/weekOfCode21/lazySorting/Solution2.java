/**
 * https://www.hackerrank.com/contests/w21/challenges/lazy-sorting
 * 확률을 구할 때 중복 원소가 있는 것도 고려해야 할 것 같음
 */
package hackerrank.contest.weekOfCode21.lazySorting;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		solve(cnt);
	}

	public static void solve(int length) {
		double sum = 0;
		int minute = 1;
		double probability = calculateProbability(length);
		double antiProbability = 1;
		while (antiProbability * 1000000000 > 1) {
			double cost = minute * antiProbability * probability;
			sum += minute * antiProbability * probability;
			// System.out.printf("plus %2d * %.8f => %.8f%n", minute, cost, sum);
			minute++;
			antiProbability *= 1 - probability;
		}
		// System.out.println(sum);
		System.out.printf("%.6f%n", sum);
	}

	private static double calculateProbability(int length) {
		int factorial = length;
		while(--length > 0) {
			factorial *= length;
		}
		return 1.0 / factorial;
	}

}
