package seo.dale.algorithm.search;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArraySearcherTest {
	
	private int a[] = {1, 3, 4, 5, 10, 13, 14, 15, 22};

	@Test
	public void testLoopSearch() {
		assertEquals(1, BinaryArraySearcher.loopSearch(a, 3));
		assertEquals(3, BinaryArraySearcher.loopSearch(a, 5));
		assertEquals(6, BinaryArraySearcher.loopSearch(a, 14));
		assertEquals(-1, BinaryArraySearcher.loopSearch(a, 2));
		assertEquals(-1, BinaryArraySearcher.loopSearch(a, -1));
		assertEquals(-1, BinaryArraySearcher.loopSearch(a, 100));
	}
	
	@Test
	public void testRecursiveSearch() {
		assertEquals(1, BinaryArraySearcher.recursiveSearch(a, 3));
		assertEquals(3, BinaryArraySearcher.recursiveSearch(a, 5));
		assertEquals(6, BinaryArraySearcher.recursiveSearch(a, 14));
		assertEquals(-1, BinaryArraySearcher.recursiveSearch(a, 2));
		assertEquals(-1, BinaryArraySearcher.recursiveSearch(a, -1));
		assertEquals(-1, BinaryArraySearcher.recursiveSearch(a, 100));
	}

}
