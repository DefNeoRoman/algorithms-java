package codility.pow11;

import java.math.BigInteger;

/**
 * https://codility.com/tasks/pow11/
 * https://codility.com/tickets/trySY4FY3-YFZ/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " : " + s.solution(i));
		}
	}

	public int solution(int N) {
		BigInteger eleven = new BigInteger("11");
		BigInteger power = new BigInteger("1");
		while (N-- > 0) {
			power = power.multiply(eleven);
		}
		String text = power.toString();

		int cnt = 0;
		for (char ch : text.toCharArray()) {
			if (ch == '1') {
				cnt ++;
			}
		}
		return cnt;
	}

}
