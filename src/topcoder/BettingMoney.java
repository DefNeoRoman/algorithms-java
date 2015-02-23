package topcoder;

/**
http://community.topcoder.com/stat?c=problem_statement&pm=2913&rd=5849
 */
public class BettingMoney {

	public static int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult) {
		// the net gain = the total money from the others - the money to give to the winner
		int netGain = 0;
		for (int i = 0; i < amounts.length; i++) {
			if (i == finalResult) {
				netGain -= amounts[i] * centsPerDollar[i];
			} else {
				netGain += amounts[i] * 100;
			}
		}
		return netGain;
	}
	
}
