package hackerrank.algorithms;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SherlockAndTheBeastRef {

	private static String makeDecentString(int num5s, int num3s) {
		char[] chars = new char[num5s + num3s];
		Arrays.fill(chars, 0, num5s, '5');
		Arrays.fill(chars, num5s, chars.length, '3');
		return new String(chars);
	}

	private static String makeDecentNumber(int n) {
		if (n < 3 || n == 4 || n == 7) {
			return "-1";
		} else if (n == 5) {
			return "33333";
		}
		int num5s = n / 3;
		int num3s = 0;
		switch (n % 3) {
			case 0:
				break;
			case 1:
				num5s -= 3;
				num3s += 2;
				break;
			case 2:
				num5s--;
				num3s++;
				break;
		}
		return makeDecentString(num5s * 3, num3s * 5);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTests = in.nextInt();
		for (int i = 0; i < numTests; i++) {
			System.out.println(makeDecentNumber(in.nextInt()));
		}
	}

	@Test
	public void test() {
		assertEquals("-1", makeDecentNumber(1));
		assertEquals("555", makeDecentNumber(3));
		assertEquals("33333", makeDecentNumber(5));
		assertEquals("55555533333", makeDecentNumber(11));
	}

}
