package seo.dale.algorithm.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	private Prime prime = new Prime();
	
	@Test
	public void testIsPrime() {
		assertFalse(prime.isPrime(-1));
		assertFalse(prime.isPrime(0));
		assertFalse(prime.isPrime(1));
		assertTrue(prime.isPrime(2));
		assertTrue(prime.isPrime(3));
		assertTrue(prime.isPrime(5));
		assertFalse(prime.isPrime(21));
		assertTrue(prime.isPrime(79));
		assertTrue(prime.isPrime(311));
		assertTrue(prime.isPrime(1931));
	}
	
	@Test
	public void testGetAllPrimesLessThan() {
		boolean[] primes = prime.getAllPrimesLessThan(100000);
		int count = 0;
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				System.out.println(i + " is prime.");
				count++;
			}
		}
		System.out.println("The total : " + count);
		assertEquals(9592, count);
	}
	
	@Test
	public void testGetAllPrimesLessThanOptimized() {
		boolean[] primes = prime.getAllPrimesLessThanOptimized(100000);
		int count = 0;
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				System.out.println(i + " is prime.");
				count++;
			}
		}
		System.out.println("The total : " + count);
		assertEquals(9592, count);
	}

}
