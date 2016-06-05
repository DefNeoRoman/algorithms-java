/**
 * https://www.algospot.com/judge/problem/read/COINS
 */
package algospot.COINS;

import java.util.*;

public class LoggingMain {

    private static Map<String, Integer> mem = new HashMap<>();

    public static int func(int money, List<Integer> coins) {
        Collections.sort(coins);
        Collections.reverse(coins);
        int result = func(money, coins, 0);
        System.out.println(mem);
        return result;
    }

    public static int func(int money, List<Integer> coins, int index) {
        String indent = indent(index);

        System.out.printf(indent + "CALL func( %d, %s )%n", money, coins);

        if (money < 0) {
            System.out.printf(indent + "RETURN 0%n");
            return 0;
        }

        if (coins.isEmpty()) {
            if (money == 0) {
                System.out.printf(indent + "RETURN 1%n");
                return 1;
            } else {
                System.out.printf(indent + "RETURN 0%n");
                return 0;
            }

        }

        //////////////////////////////////////////////////////////////////////

        int total = 0;

        int biggestCoin = coins.get(0);

        System.out.printf(indent + "For coinValue %d : %n", biggestCoin);

        int coinCount = money / biggestCoin;
        while (coinCount >= 0) {
            int moneyLeft = money - biggestCoin * coinCount;

            List<Integer> coinsLeft = new ArrayList<>(coins);
            coinsLeft.remove(new Integer(biggestCoin));

            System.out.printf(indent + "coinCount : %d, moneyLeft : %d%n", coinCount, moneyLeft);

            String key = moneyLeft + ":" + coinsLeft;

            if (!mem.containsKey(key)) {
                int value = func(moneyLeft, coinsLeft, index + 1);
                mem.put(key, value);
            }

            total += mem.get(key);

            coinCount--;
        }


        System.out.printf(indent + "RETURN %d%n", total);
        return total;
    }

    private static String indent(int level) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            builder.append("| ");
        }
        return builder.toString();
    }

}
