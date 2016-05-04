package seo.dale.algorithm.bit;

/**
 * @author 서대영/Store기술개발팀/SKP
 */
public class BitMaker2 {

	public static boolean getBit(int num, int i) {
		int mask = 1 << i;

		System.out.printf("%32s\n", Integer.toBinaryString(num));
		System.out.printf("%32s\n", Integer.toBinaryString(mask));
		System.out.println("--------------------------------");
		System.out.printf("%32s\n", Integer.toBinaryString(num & mask));
		System.out.println("================================");

		return (num & mask) != 0;
	}

	public static int clearBit(int num, int i) {
		int mask = ~(1 << i);

		System.out.printf("%32s\n", Integer.toBinaryString(num));
		System.out.printf("%32s\n", Integer.toBinaryString(mask));
		System.out.println("--------------------------------");
		System.out.printf("%32s\n", Integer.toBinaryString(num & mask));
		System.out.println("================================");

		return num & mask;
	}

	public static int clearBitsMSBthroughI(int num, int i) {
		int mask = (1 << i) - 1;

		System.out.printf("%32s\n", Integer.toBinaryString(num));
		System.out.printf("%32s\n", Integer.toBinaryString(mask));
		System.out.println("--------------------------------");
		System.out.printf("%32s\n", Integer.toBinaryString(num & mask));
		System.out.println("================================");

		return num & mask;
	}

	public static int clearBitsIthrough0(int num, int i ) {
		int mask = ~(-1 >>> (31 - i));
		// int mask2 = -1 ^ ((1 << i + 1) - 1);

		System.out.printf("%32s\n", Integer.toBinaryString(num));
		System.out.printf("%32s\n", Integer.toBinaryString(mask));
		System.out.println("--------------------------------");
		System.out.printf("%32s\n", Integer.toBinaryString(num & mask));
		System.out.println("================================");

		return num & mask;
	}

}
