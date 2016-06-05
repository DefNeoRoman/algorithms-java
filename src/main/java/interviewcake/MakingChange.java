package interviewcake;

import java.util.Arrays;

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
	
	public int compute(int amount, int[] denominations) {
		//System.out.printf(">> Checking ways to make %d with %s.\n", amount, Arrays.toString(denominations));
		
		if (amount == 0) {
			//System.out.println("Hit the amount.");
			return 1;
		}
		
		if (amount < 0) {
			//System.out.println("Overshot the amount.");
			return 0;
		}
		
		if (denominations.length == 0) {
			//System.out.println("Out of denominations.");
			return 0;
		}
		
		int currentCoin = denominations[0];
		int[] restOfCoins = Arrays.copyOfRange(denominations, 1, denominations.length);
		//System.out.printf("currentCoin = %d / resetOfCoins = %s.\n", currentCoin, Arrays.toString(restOfCoins));
		
		int count = 0;
		while (amount >= 0) {
			count += compute(amount, restOfCoins);
			amount -= currentCoin;
		}
		
		return count;
	}
	
}
