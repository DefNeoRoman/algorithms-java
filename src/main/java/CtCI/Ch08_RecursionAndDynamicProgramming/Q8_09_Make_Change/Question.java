package CtCI.Ch08_RecursionAndDynamicProgramming.Q8_09_Make_Change;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%209/Question9_8/Question.java
 */
public class Question {

	public static int makeChange(int n) {
		int[] denoms = {1, 5, 10, 25};
		int[][] memo = new int[n + 1][denoms.length];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < denoms.length; j++) {
				memo[i][j] = -1;
			}
		}
		return makeChange(n, denoms, 0, memo);
	}

	private static int makeChange(int amount, int[] denoms, int index, int[][] memo) {
		if (memo[amount][index] > 0) {
			return memo[amount][index];
		}

		if (index == denoms.length - 1) {
			return amount % denoms[index] == 0 ? 1 : 0;
		}

		int ways = 0;

		for (int spent = 0; spent <= amount; spent += denoms[index]) {
			int left = amount - spent;
			ways += makeChange(left, denoms, index + 1, memo);
		}

		memo[amount][index] = ways;
		return ways;
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println("makeChange(" + i + ") = " + makeChange(i));
		}
	}

}
