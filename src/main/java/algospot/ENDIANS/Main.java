package algospot.ENDIANS;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfInputs = scanner.nextInt();
		for (int i = 0; i < numOfInputs; i++) {
			long input = scanner.nextLong();
			endians(input);
		}
	}

	public static long endians(long unsignedInteger) {
		short[] unsignedBytes = new short[4];
		for (int i = 0; i < 4; i++) {
			unsignedBytes[i] = (short) (unsignedInteger % 256);
			unsignedInteger /= 256;
		}

		long mul = (long) Math.pow(256, 3);
		for (int i = 0; i < 4; i++) {
			unsignedInteger += unsignedBytes[i] * mul;
			mul /= 256;
		}

		System.out.println(unsignedInteger);

		return unsignedInteger;
	}

}
