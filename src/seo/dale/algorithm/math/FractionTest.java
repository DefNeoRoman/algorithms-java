package seo.dale.algorithm.math;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class FractionTest {

	private Fraction fraction = new Fraction();
	
	@Test
	public void testMultifly() {
		int[] a = {4, 9};
		int[] b = {1, 6};
		int[] expected = {4, 54};
		int[] actual = fraction.multiply(a, b);
		System.out.println(Arrays.toString(expected) + " = " + Arrays.toString(actual));
		assertTrue(Arrays.equals(expected, actual));
	}
	
	@Test
	public void testAdd() {
		int[] a = {4, 9};
		int[] b = {1, 6};
		int[] expected = {11, 18};
		int[] actual = fraction.add(a, b);
		System.out.println(Arrays.toString(expected) + " = " + Arrays.toString(actual));
		assertTrue(Arrays.equals(expected, actual));
	}
	
	@Test
	public void testReduce() {
		int[] a = {4, 6};
		int[] expected = {2, 3};
		int[] actual = fraction.reduce(a);
		System.out.println(Arrays.toString(expected) + " = " + Arrays.toString(actual));
		assertTrue(Arrays.equals(expected, actual));
	}

}
