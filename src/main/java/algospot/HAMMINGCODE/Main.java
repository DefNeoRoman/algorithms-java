/**
 * https://www.algospot.com/judge/problem/read/HAMMINGCODE
 */
package algospot.HAMMINGCODE;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		while (count-- > 0) {
			System.out.println(hammingcode(scanner.next()));
		}
		scanner.close();
	}

	public static String hammingcode(String message) {
		int[] bits = new int[message.length()];
		for (int i = 0; i < message.length(); i++) {
			bits[i] = message.charAt(i) - '0';
		}

		int check1 = bits[0] ^ bits[2] ^ bits[4] ^ bits[6];
		int check2 = bits[1] ^ bits[2] ^ bits[5] ^ bits[6];
		int check3 = bits[3] ^ bits[4] ^ bits[5] ^ bits[6];
		int syndrome = check1 + check2 * 2 + check3 * 4;

		if (syndrome > 0) {
			bits[syndrome - 1] = (bits[syndrome - 1] + 1) % 2;
		}

		return "" + bits[2] + bits[4] + bits[5] + bits[6];
	}

}
