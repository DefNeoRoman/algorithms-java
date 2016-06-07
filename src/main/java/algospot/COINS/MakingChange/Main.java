package algospot.COINS.MakingChange;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		for (int i = 0; i < count; i++) {
			int money = scanner.nextInt();
			int length = scanner.nextInt();
			int[] coins = new int[length];
			for (int j = 0; j < length; j++) {
				mem = new HashMap<>();
				coins[j] = scanner.nextInt();
			}
			System.out.println(compute(money, coins));
		}
		scanner.close();
	}

	private static Map<String, Long> mem;

	public static long compute(int amount, int[] denominations) {
		if (amount == 0) {
			return 1;
		}

		if (amount < 0) {
			return 0;
		}

		if (denominations.length == 0) {
			return 0;
		}

		int currentCoin = denominations[0];
		int[] restOfCoins = Arrays.copyOfRange(denominations, 1, denominations.length);

		long count = 0;
		while (amount >= 0) {
			String key = amount + Arrays.toString(restOfCoins);

			if (!mem.containsKey(key)) {
				long value = compute(amount, restOfCoins);
				mem.put(key, value);
			}

			count += mem.get(key);
			amount -= currentCoin;
		}

		return count;
	}

}
