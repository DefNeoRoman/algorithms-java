package algospot.COINS.MakingChange;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.interviewcake.com/question/coin
 
이해가 잘 안 되서 해답보고 코딩 한 번 해보고 넘어감 ㅠㅠ 
 
 Write a function that, given:

an amount of money
a list of coin denominations
computes the number of ways to make amount of money with coins of the available denominations.

Example: for amount=4 (4¢) and denominations=[1,2,3] (1¢, 2¢ and 3¢), your program would output 4—the number of ways to make 4¢ with those denominations:

1¢, 1¢, 1¢, 1¢
1¢, 1¢, 2¢
1¢, 3¢
2¢, 2¢
 
 */
public class MakingChange {

	private static Map<String, Long> mem = new HashMap<>();

	public long compute(int amount, int[] denominations) {
		return compute(amount, denominations, 0);
	}
	
	public long compute(int amount, int[] denominations, int level) {
		String indent = indent(level);

		System.out.printf(indent + "Checking ways to make %d with %s.\n", amount, Arrays.toString(denominations));

		if (amount == 0) {
			System.out.println(indent + "Return 1 : Hit the amount.");
			return 1;
		}
		
		if (amount < 0) {
			System.out.println(indent + "Return 0 : Overshot the amount.");
			return 0;
		}
		
		if (denominations.length == 0) {
			System.out.println(indent + "Return 0 : Out of denominations.");
			return 0;
		}
		
		int currentCoin = denominations[0];
		int[] restOfCoins = Arrays.copyOfRange(denominations, 1, denominations.length);
		// System.out.printf(indent + "currentCoin = %d / resetOfCoins = %s.\n", currentCoin, Arrays.toString(restOfCoins));

		long count = 0;
		while (amount >= 0) {
			String key = amount + ":" + Arrays.toString(restOfCoins);

			if (!mem.containsKey(key)) {
				long value = compute(amount, restOfCoins, level + 1);
				mem.put(key, value);
			}

			count += mem.get(key);
			amount -= currentCoin;
		}

		System.out.println(indent + "Return " + count);

		return count;
	}

	private static String indent(int level) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < level; i++) {
			builder.append("| ");
		}
		return builder.toString();
	}

}
