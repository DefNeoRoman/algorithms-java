package hackerrank.algorithms;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/find-digits
 */
public class FindDigits {

	public static long countEvenlyDivisible(String text) {
		long dividend = Long.parseLong(text);

		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			int divisor = Character.getNumericValue(text.charAt(i));
			if (divisor == 0) {
				continue;
			}
			if (dividend % divisor == 0) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numOfTests = input.nextInt();
		for (int i = 0; i < numOfTests; i++) {
			String text = input.next();
			Long count = countEvenlyDivisible(text);
			System.out.println(count);
		}
	}

	@Test
	public void test() {
		assertEquals(2, countEvenlyDivisible("12"));
		assertEquals(3, countEvenlyDivisible("1012"));
	}

}
