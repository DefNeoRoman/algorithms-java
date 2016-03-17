package hackerrank.algorithms.greedy;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mark-and-toys
 */
public class MarkAndToys {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int length = scanner.nextInt();
		int money = scanner.nextInt();
		int[] prices = new int[length];
		for (int i = 0; i < length; i++) {
			prices[i] = scanner.nextInt();
		}

		int cnt = countMaxItemsToBuy(money, prices);
		System.out.println(cnt);
	}

	private static int countMaxItemsToBuy(int money, int[] prices) {
		int cnt = 0;
		Arrays.sort(prices);
		for (int price : prices) {
			money -= price;
			if (money < 0) {
				break;
			}
			cnt++;
		}
		return cnt;
	}

	@Test
	public void test() {
		String input = "7 50\n" +
				"1 12 5 111 200 1000 10";

		ByteArrayInputStream is = new ByteArrayInputStream(input.getBytes());
		Scanner scanner = new Scanner(is);

		int length = scanner.nextInt();
		int money = scanner.nextInt();
		int[] prices = new int[length];
		for (int i = 0; i < length; i++) {
			prices[i] = scanner.nextInt();
		}

		System.out.printf("length : %s, money : %s, prices : %s\n", length, money, Arrays.toString(prices));

		int cnt = countMaxItemsToBuy(money, prices);
		System.out.println(cnt);
	}

}
