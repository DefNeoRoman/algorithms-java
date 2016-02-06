package seo.dale.algorithm.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorTest {

	@Test
	public void testIsAfactorOf3() {
		assertFalse(Factor.isAfactorOf3(0));
		assertTrue(Factor.isAfactorOf3(1));
		assertFalse(Factor.isAfactorOf3(2));
		assertTrue(Factor.isAfactorOf3(3));
		assertFalse(Factor.isAfactorOf3(4));
		assertFalse(Factor.isAfactorOf3(9));
		
		System.out.println(3 / 1);
		System.out.println(3 / 2);
		System.out.println(3 / 3);
		System.out.println(3 / 90);
	}
	
	@Test
	public void testIsAfactorOf3withoutModulo() {
		assertFalse(Factor.isAfactorOf3withoutModulo(0));
		assertTrue(Factor.isAfactorOf3withoutModulo(1));
		assertFalse(Factor.isAfactorOf3withoutModulo(2));
		assertTrue(Factor.isAfactorOf3withoutModulo(3));
		assertFalse(Factor.isAfactorOf3withoutModulo(4));
		assertFalse(Factor.isAfactorOf3withoutModulo(9));
		
		System.out.println(3 / 1);
		System.out.println(3 / 2);
		System.out.println(3 / 3);
		System.out.println(3 / 90);
	}

}
