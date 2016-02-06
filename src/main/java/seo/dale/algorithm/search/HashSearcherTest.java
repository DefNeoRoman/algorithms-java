package seo.dale.algorithm.search;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashSearcherTest {
	
	private int a[] = {1, 3, 4, 5, 10, 13, 14, 15, 22};

	@Test
	public void testSearchUsingHashArray() {
		assertEquals(3, HashSearcher.searchUsingHashArray(a, 3));
		assertEquals(5, HashSearcher.searchUsingHashArray(a, 5));
		assertEquals(14, HashSearcher.searchUsingHashArray(a, 14));
		assertEquals(-1, HashSearcher.searchUsingHashArray(a, 2));
		assertEquals(-1, HashSearcher.searchUsingHashArray(a, 99));
	}
	
	@Test
	public void testSearchUsingHashSet() {
		assertEquals(3, HashSearcher.searchUsingHashSet(a, 3));
		assertEquals(5, HashSearcher.searchUsingHashSet(a, 5));
		assertEquals(14, HashSearcher.searchUsingHashSet(a, 14));
		assertEquals(-1, HashSearcher.searchUsingHashSet(a, 2));
		assertEquals(-1, HashSearcher.searchUsingHashSet(a, 99));
	}
	
	@Test
	public void testSearchUsingHashMap() {
		assertEquals(3, HashSearcher.searchUsingHashMap(a, 3));
		assertEquals(5, HashSearcher.searchUsingHashMap(a, 5));
		assertEquals(14, HashSearcher.searchUsingHashMap(a, 14));
		assertEquals(-1, HashSearcher.searchUsingHashMap(a, 2));
		assertEquals(-1, HashSearcher.searchUsingHashMap(a, 99));
	}
	
}
