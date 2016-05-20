package CtCI.Ch05_BitManipulation.Q5_02_Binary_to_String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MySolution {

	@Test
	public void testToBinary() {
		double[] inputs = {0.125, 0.25, 0.375, 0.5, 0.51, 0.625, 0.75, 0.875};
		String[] outputs = {"0.001", "0.01", "0.011", "0.1", "ERROR", "0.101", "0.11", "0.111"};
		for (int i = 0; i < inputs.length; i++) {
			String expected = outputs[i];
			String actual = toBinary(inputs[i]);
			System.out.println(inputs[i] + " -> " + actual);
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testToBinary2() {
		double[] inputs = {0.125, 0.25, 0.375, 0.5, 0.51, 0.625, 0.75, 0.875};
		String[] outputs = {"0.001", "0.01", "0.011", "0.1", "ERROR", "0.101", "0.11", "0.111"};
		for (int i = 0; i < inputs.length; i++) {
			String expected = outputs[i];
			String actual = toBinary2(inputs[i]);
			System.out.println(inputs[i] + " -> " + actual);
			assertEquals(expected, actual);
		}
	}

	/**
	 * 소수에 2를 곱해서 1보다 크면 "1"
	 */
	public static String toBinary(double num) {
		if (num >= 1 || num <= 0) {
			return "ERROR";
		}

		StringBuilder builder = new StringBuilder("0.");
		while (num > 0) {
			num *= 2;
			// System.out.println(" * 2 : " + num);
			if (num >= 1) {
				builder.append(1);
				num -= 1;
			} else {
				builder.append(0);
			}
			if (builder.length() > 32) {
				System.out.println("- toBinary1 : " + builder.toString());
				return "ERROR";
			}
		}
		return builder.toString();
	}

	/**
	 * 소수가 0.5^i보다 크면 i번째 수는 "1"
	 */
	public static String toBinary2(double num) {
		if (num >= 1 || num <= 0) {
			return "ERROR";
		}

		StringBuilder builder = new StringBuilder("0.");
		double frac = 0.5;
		while (num > 0) {
			if (num >= frac) {
				builder.append(1);
				num -= frac;
			} else {
				builder.append(0);
			}
			frac *= 0.5;
			if (builder.length() > 32) {
				System.out.println("- toBinary2 : " + builder.toString());
				return "ERROR";
			}
		}
		return builder.toString();
	}


}
