package seo.dale.algorithm.math;

/**
 * The greatest common divisor 
 * The lowest common multiple 
 */
public class GcdAndLcm {

	public int getGcd(int a, int b) {
		for (int i = Math.min(a, b); i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Euclid's algorithm. 
	 */
	public int getGcdEnhanced(int a, int b) {
		if (b == 0) return a;
		return getGcdEnhanced(b, a%b);
	}
	
	public int getLcm(int a, int b) {
		return a * b / getGcd(a, b);
	}
	
}
