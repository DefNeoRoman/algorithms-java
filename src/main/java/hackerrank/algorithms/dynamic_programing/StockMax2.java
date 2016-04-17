package hackerrank.algorithms.dynamic_programing;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/stockmax
 */
public class StockMax2 {

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
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            int numOfDays = scanner.nextInt();
            int[] prices = new int[numOfDays];
            for (int j = 0; j < numOfDays; j++) {
                prices[j] = scanner.nextInt();
            }
            System.out.println(getMaxProfit(prices));
        }
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
            System.out.println(getMaxProfit(prices));
        }
    }

    public static long getMaxProfit(int[] prices) {
        long profit = 0L;
        int maxSoFar = 0;
        for (int i = prices.length - 1; i > -1 ; i--) {
            if (prices[i] >= maxSoFar) {
                maxSoFar = prices[i];
            }
            profit += maxSoFar - prices[i];
        }
        return profit;
    }

}
