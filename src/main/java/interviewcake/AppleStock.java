package interviewcake;

/**
Writing coding interview questions hasn't made me rich. Maybe trading Apple stocks will.
I have an array stock_prices_yesterday where:

The indices are the time in minutes past trade opening time, which was 9:30am local time.
The values are the price in dollars of Apple stock at that time.
For example, the stock cost $500 at 10:30am, so stock_prices_yesterday[60] = 500.

Write an efficient algorithm for computing the best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.

No "shorting"—you must buy before you sell. You may not buy and sell in the same time step (at least 1 minute must pass).
 */
public class AppleStock {
    
    /**
     * Max Profit = The price at index - Min price so far
     */
	public int getMaxProfitWithSingleLoop(int[] stocks) {
    	if (stocks.length < 2) {
    		throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
    	}

    	int minPrice = stocks[0];
       	int maxProfit = stocks[1] - stocks[0];
        
        for (int i = 1; i < stocks.length - 1; i++) {
        	maxProfit = Math.max(maxProfit, stocks[i] - minPrice);
        	minPrice = Math.min(minPrice, stocks[i]);
        }
       
        return maxProfit;
    }
    
    /**
     * Brute Force
     */
    public int getMaxProfitWithDoubleLoop(int[] stocks) {
       	int maxProfit = Integer.MIN_VALUE;
        
        for (int i = 0; i < stocks.length - 1; i++) {
            for (int j = i + 1; j < stocks.length; j++) {
            	maxProfit = Math.max(stocks[i] - stocks[j], maxProfit);
            }
        }
       
        return maxProfit;
    }
    
}