package seo.dale.algorithm.recursion;

public class FibonacciNumber {

	public static long fibo(int n) {
		// fibo(0) = 1, fibo(1) = 1
		if (n <= 1) {
			return 1;
		}
		
		// fobo(n) = fibo(n - 1) + fibo (n - 2)
		return fibo(n - 1) + fibo(n - 2);
	}
	
	private static long[] reuse = new long[100];
	
	public static long fiboWithoutDups(int n) {
		// Resue
		if (reuse[n] > 0) {
			return reuse[n];
		}
		
		// fibo(0) = 1, fibo(1) = 1
		if (n <= 1) {
			return 1;
		}
		
		// fobo(n) = fibo(n - 1) + fibo (n - 2)
		reuse[n] = fiboWithoutDups(n - 1) + fiboWithoutDups(n - 2);
		return reuse[n];
	}
	
	public static int fiboEnhanced(int n) {
		
		
		return 0;
	}
	
}
