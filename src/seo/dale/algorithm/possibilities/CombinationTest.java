package seo.dale.algorithm.possibilities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CombinationTest {

	@Test
	public void testCalculateInteratively() {
		assertEquals(1, Combination.calculateInteratively(4, 0));
		assertEquals(4, Combination.calculateInteratively(4, 1));
		assertEquals(6, Combination.calculateInteratively(4, 2));
		assertEquals(1, Combination.calculateInteratively(4, 4));
		assertEquals(10, Combination.calculateInteratively(5, 3));
		assertEquals(30045015, Combination.calculateInteratively(30, 10));
	}
	
	@Test
	public void testCalculateRecursively() {
		/*
		assertEquals(1, Combination.calculateRecursively(4, 0));
		assertEquals(4, Combination.calculateRecursively(4, 1));
		assertEquals(6, Combination.calculateRecursively(4, 2));
		assertEquals(1, Combination.calculateRecursively(4, 4));
		assertEquals(10, Combination.calculateRecursively(5, 3));
		*/
		assertEquals(30045015, Combination.calculateRecursively(30, 10));
	}
	
	@Test
	public void testCalculateRecursivelyWithoutDuplication() {
		System.out.println("##########");
		assertEquals(1, Combination.calculateRecursivelyWithoutDuplication(4, 0));
		System.out.println("##########");
		assertEquals(4, Combination.calculateRecursivelyWithoutDuplication(4, 1));
		System.out.println("##########");
		assertEquals(6, Combination.calculateRecursivelyWithoutDuplication(4, 2));
		System.out.println("##########");
		assertEquals(1, Combination.calculateRecursivelyWithoutDuplication(4, 4));
		System.out.println("##########");
		assertEquals(10, Combination.calculateRecursivelyWithoutDuplication(5, 3));
		System.out.println("##########");
		assertEquals(30045015, Combination.calculateRecursivelyWithoutDuplication(30, 10));
	}

}
