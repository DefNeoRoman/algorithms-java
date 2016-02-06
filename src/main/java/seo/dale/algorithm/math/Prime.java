package seo.dale.algorithm.math;

import java.util.Arrays;


public class Prime {

	/**
	 * A number is prime if it is only divisible by 1 and itself.
	 */
	public boolean isPrime(int n) {
		if (n <= 1) return false;
		
		/* there are no even primes greater than 2 */
		if (n == 2) return true;
		if (n % 2 == 0) return false;
		
		/* 
		we only need to check divisibility for values of i that are less or equal to the square root of n (call this m). 
		If n divides a number that is greater than m then the result of that division will be some number less than m and thus n will also divide a number less or equal to m. 
		*/
		double csqrt = Math.ceil(Math.sqrt(n));
		for (int i = 2; i <= csqrt; i++) {
			if (n % i ==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean[] getAllPrimesLessThan(int n) {
		boolean[] primes = new boolean[n];
		
		for(int i = 2; i < n; i++) {
			if (isPrime(i)) {
				primes[i] = true;
			}
		}
		
		return primes;
	}
	
	/**
	 * The Sieve of Eratosthenes
	 */
	public boolean[] getAllPrimesLessThanOptimized(int n) {
		boolean[] primes = new boolean[n];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		
		// System.out.println(1 + " >> " + Arrays.toString(primes));
		double csqrt = Math.ceil(Math.sqrt(n));
		for(int i = 2; i <= csqrt; i++) {
			if (primes[i]) {
				if (isPrime(i)) {
					// takes the first prime number and removes all of its multiples
					for (int j = i * i; j < primes.length; j+=i) {
						primes[j] = false;
					}
				}
			}
			// System.out.println(i + " >> " + Arrays.toString(primes));
		}
		
		return primes;
	}
	
}