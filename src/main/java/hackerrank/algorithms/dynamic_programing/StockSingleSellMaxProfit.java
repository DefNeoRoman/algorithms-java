package hackerrank.algorithms.dynamic_programing;

import org.junit.Test;

/**
 * https://expcode.wordpress.com/2015/08/28/given-an-array-of-stock-prices-find-maximum-profit-by-one-transaction-buy-and-sell/
 * https://programming4interviews.wordpress.com/2012/02/27/maximize-the-single-sell-profit-of-a-stock/
 */
public class StockSingleSellMaxProfit {

    @Test
    public void test() {
        System.out.println(StockSingleSellMaxProfit.findMaxProfit(new int[]{100, 80, 120, 130, 70, 60, 100, 125})); // 65
    }

    public static void main(String[] args) {
        int[] stockPrices = new int[] { 5, 2, 10, 3, 10, 5, 5, 1, 17, 4, 100 }; // 99
        System.out.println(findMaxProfit(stockPrices));
    }

    public static int findMaxProfit(int[] stockPriceSamples) {
        int maxProfit = 0;
        int minTillNow = stockPriceSamples[0];
        for (int i = 0; i < stockPriceSamples.length; i++) {
            int price = stockPriceSamples[i];
            int profit = price - minTillNow;
            maxProfit = Math.max(profit, maxProfit);
            minTillNow = Math.min(price, minTillNow);
        }
        return maxProfit;
    }

}
