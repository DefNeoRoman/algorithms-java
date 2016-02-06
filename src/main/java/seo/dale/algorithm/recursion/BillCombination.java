package seo.dale.algorithm.recursion;

/**
 * 여러 종류의 지폐로 지불하는 방법의 개수 구하기를 재귀적으로 구현 (포기)
 */
public class BillCombination {

	public static int count(int[] bills, int money) {
		return count(bills.length, bills, money);
	}
	
	private static int count(int length, int[] bills, int money) {
		if (length == 1) {
			if (money % bills[0] == 0) {
				return 1;
			} else {
				return 0;
			}
		}
		
		int cnt = 0;
		for (int i = length; i > 0; i--) {
			cnt += count(length - 1, bills, money - bills[length - 1]);
		}
		
		return cnt;
	}
	
}
