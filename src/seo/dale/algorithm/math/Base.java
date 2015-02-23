package seo.dale.algorithm.math;

public class Base {

	/**
	 * Converts from a decimal to a binary.
	 */
	public int fromDecimal(int number, int base) {
		int sum = 0;
		int multiflier = 1;
		while (number > 0) {
			sum += number % base * multiflier;
			multiflier *= 10;
			number /= base;
		}
		return sum;
	}
	
	/**
	 * Converts from a decimal to any base. (up to base 20)
	 */
	public String fromDecimal2(int number, int base) {
		String chars = "0123456789ABCDEFGHIJ";
		String sum = "";
		while (number > 0) {
			sum = chars.charAt(number % base) + sum;
			number /= base;
		}
		return sum;
	}
	
	/**
	 * Converts a number n in base b (2<=b<=10) to a decimal number
	 */
	public int toDecimal(int number, int base) {
		int sum = 0;
		int multiflier = 1;
		while (number > 0) {
			sum += number % 10 * multiflier;
			multiflier *= base;
			number /= 10;
		}
		return sum;
	}
	
	public int toDecimal2(int number, int base) {
		return Integer.parseInt("" + number, base);
	}
	
}
