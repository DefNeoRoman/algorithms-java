package seo.dale.algorithm.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciNumberTest {

	@Test
	public void testFibo() {
		/*
		assertEquals(1, FibonacciNumber.fibo(0));
		assertEquals(1, FibonacciNumber.fibo(1));
		assertEquals(2, FibonacciNumber.fibo(2));
		assertEquals(3, FibonacciNumber.fibo(3));
		assertEquals(5, FibonacciNumber.fibo(4));
		assertEquals(8, FibonacciNumber.fibo(5));
		assertEquals(13, FibonacciNumber.fibo(6));
		assertEquals(21, FibonacciNumber.fibo(7));
		*/
		assertEquals(1836311903, FibonacciNumber.fibo(45));
	}
	
	@Test
	public void testFiboWithoutDups() {
		/*
		assertEquals(1, FibonacciNumber.fibo(0));
		assertEquals(1, FibonacciNumber.fibo(1));
		assertEquals(2, FibonacciNumber.fibo(2));
		assertEquals(3, FibonacciNumber.fibo(3));
		assertEquals(5, FibonacciNumber.fibo(4));
		assertEquals(8, FibonacciNumber.fibo(5));
		assertEquals(13, FibonacciNumber.fibo(6));
		assertEquals(21, FibonacciNumber.fibo(7));
		*/
		assertEquals(1836311903, FibonacciNumber.fiboWithoutDups(45));
	}

}
