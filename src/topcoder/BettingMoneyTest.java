package topcoder;

import static org.junit.Assert.*;

import org.junit.Test;

public class BettingMoneyTest {

	@Test
	public void test() {
		int[] amounts = {10,20,30};
		int[] centsPerDollar = {20,30,40};
		int finalResult = 1;
		
		int expected = 3400;
		int actual = BettingMoney.moneyMade(amounts, centsPerDollar, finalResult);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test1() {
		int[] amounts = {200,300,100};
		int[] centsPerDollar = {10,10,10};
		int finalResult = 2;
		
		int expected = 49000;
		int actual = BettingMoney.moneyMade(amounts, centsPerDollar, finalResult);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		int[] amounts = {100,100,100,100};
		int[] centsPerDollar = {5,5,5,5};
		int finalResult = 0;
		
		int expected = 29500;
		int actual = BettingMoney.moneyMade(amounts, centsPerDollar, finalResult);
		assertEquals(expected, actual);
	}

	
	@Test
	public void test3() {
		int[] amounts = {5000,5000};
		int[] centsPerDollar = {100,2};
		int finalResult = 0;
		
		int expected = 0;
		int actual = BettingMoney.moneyMade(amounts, centsPerDollar, finalResult);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		int[] amounts = {100};
		int[] centsPerDollar = {10};
		int finalResult = 0;
		
		int expected = -1000;
		int actual = BettingMoney.moneyMade(amounts, centsPerDollar, finalResult);
		assertEquals(expected, actual);
	}
	
}
