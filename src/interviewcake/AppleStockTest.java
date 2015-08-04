package interviewcake;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppleStockTest {

	AppleStock appleStock = new AppleStock();
	
	int[] stock_prices_yesterday = {500, 450, 350, 200, 300, 600, 550, 500, 200, 400, 550, 500};   
	
	@Test
	public void getMaxProfitWithSingleLoop() {
		 assertEquals(400, appleStock.getMaxProfitWithSingleLoop(stock_prices_yesterday));
	}
	
	@Test
	public void getMaxProfitWithDoubleLoop() {
		assertEquals(400, appleStock.getMaxProfitWithDoubleLoop(stock_prices_yesterday));
	}

}
