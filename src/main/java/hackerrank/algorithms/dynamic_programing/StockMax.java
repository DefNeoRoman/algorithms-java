package hackerrank.algorithms.dynamic_programing;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/stockmax
 */
public class StockMax {

    @Test
    public void test() {
        String input =
                "3\n" +
                        "3\n" +
                        "5 3 2\n" +
                        "3\n" +
                        "1 2 100\n" +
                        "4\n" +
                        "1 3 1 2";
        ByteArrayInputStream is = new ByteArrayInputStream(input.getBytes());
        execute(is);
    }

    public static void main(String[] args) {
        execute(System.in);
    }

    private static void execute(InputStream is) {
        Scanner scanner = new Scanner(is);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            int numOfDays = scanner.nextInt();
            int[] prices = new int[numOfDays];
            for (int j = 0; j < numOfDays; j++) {
                prices[j] = scanner.nextInt();
            }
            MaxProfitCalculator cal = new MaxProfitCalculator(prices);
            System.out.println(cal.calculate());
        }
    }

    public static class MaxProfitCalculator {

        private int[] prices;

        public MaxProfitCalculator(int[] prices) {
            this.prices = prices;
        }

        public long calculate() {
            int length = prices.length;
            int memo[] = new int[length];

            memo[0] = -1;

            for (int i = 1; i < length; i++) {
                int j = i - 1;

                while (prices[j] < prices[i] && memo[j] != -1) {
                    j = memo[j];
                }

                if (prices[j] > prices[i]) {
                    memo[i] = j;
                } else {
                    memo[i] = memo[j];
                }
            }

            return calculateProfit(memo);
        }

        private long calculateProfit(int[] memo) {
            long profit = 0;
            int n = prices.length;
            for (int i = n - 1; i > 0; ) {
                int end = i;
                int start = memo[i] + 1;

                for (int j = start; j < end; j++) {
                    profit += prices[end] - prices[j];
                }
                i = memo[i];
            }
            return profit;
        }

    }

}
