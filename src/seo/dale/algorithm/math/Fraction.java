package seo.dale.algorithm.math;

public class Fraction {
	
	private GcdAndLcm gcdAndLcm = new GcdAndLcm();

	public int[] multiply(int[] a, int[] b) {
		return new int[]{a[0] * b[0], a[1] *b [1]};
	}
	
	public int[] add(int[] a, int[] b) {
		int denom = gcdAndLcm.getLcm(a[1], b[1]);
		return new int[]{a[0] * denom / a[1] + b[0] * denom / b[1], denom};
	}
	
	public int[] reduce(int[] a) {
		int gcd = gcdAndLcm.getGcd(a[0], a[1]);
		return new int[]{a[0] / gcd, a[1] / gcd};
	}
	
}
