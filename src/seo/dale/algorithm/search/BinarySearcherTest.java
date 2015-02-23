package seo.dale.algorithm.search;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearcherTest {
	
	private int a[] = {1, 3, 4, 5, 10, 13, 14, 15, 22};

	@Test
	public void testLoopSearch() {
		assertEquals(1, BinarySearcher.loopSearch(a, 3));
		assertEquals(3, BinarySearcher.loopSearch(a, 5));
		assertEquals(6, BinarySearcher.loopSearch(a, 14));
		assertEquals(-1, BinarySearcher.loopSearch(a, 2));
		assertEquals(-1, BinarySearcher.loopSearch(a, -1));
		assertEquals(-1, BinarySearcher.loopSearch(a, 100));
	}
	
	@Test
	public void testRecursiveSearch() {
		assertEquals(1, BinarySearcher.recursiveSearch(a, 3));
		assertEquals(3, BinarySearcher.recursiveSearch(a, 5));
		assertEquals(6, BinarySearcher.recursiveSearch(a, 14));
		assertEquals(-1, BinarySearcher.recursiveSearch(a, 2));
		assertEquals(-1, BinarySearcher.recursiveSearch(a, -1));
		assertEquals(-1, BinarySearcher.recursiveSearch(a, 100));
	}

}
