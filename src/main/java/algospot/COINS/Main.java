/**
 * https://www.algospot.com/judge/problem/read/COINS
 */
package algospot.COINS;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int money = scanner.nextInt();
            int length = scanner.nextInt();
            List<Integer> coins = new ArrayList<>(length);
            for (int j = 0; j < length; j++) {
                coins.add(j, scanner.nextInt());
            }

            System.out.println(func(money, coins));
        }
        scanner.close();
    }

    private static Map<String, Long> mem;

    public static long func(int money, List<Integer> coins) {
        mem = new HashMap<>();
        Collections.sort(coins);
        Collections.reverse(coins);
        return func(money, coins, 0);
    }

    public static long func(int money, List<Integer> coins, int index) {
        if (money < 0) {
            return 0;
        }

        if (coins.isEmpty()) {
            if (money == 0) {
                return 1;
            } else {
                return 0;
            }

        }

        //////////////////////////////////////////////////////////////////////

        long total = 0;

        int biggestCoin = coins.get(0);

        int coinCount = money / biggestCoin;
        while (coinCount >= 0) {
            int moneyLeft = money - biggestCoin * coinCount;

            List<Integer> coinsLeft = new ArrayList<>(coins);
            coinsLeft.remove(new Integer(biggestCoin));

            String key = moneyLeft + ":" + coinsLeft;

            if (!mem.containsKey(key)) {
                long value = func(moneyLeft, coinsLeft, index + 1);
                mem.put(key, value);
            }

            total += mem.get(key);

            coinCount--;
        }

        return total;
    }

}
