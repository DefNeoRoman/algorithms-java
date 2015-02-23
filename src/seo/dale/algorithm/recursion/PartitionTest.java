package seo.dale.algorithm.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PartitionTest {

	@Test
	public void test1() {
		assertEquals(1, Partition.count(1, 1));
		assertEquals(1, Partition.count(2, 1));
	}
	
	@Test
	public void test2() {
		assertEquals(5, Partition.count(5, 3));
	}
	
	@Test
	public void test3() {
		// assertEquals(1, Partition.count(1, 1));
		// assertEquals(1, Partition.count(2, 1));
		Partition.count(50, 50);
	}
	
	@Test
	public void countWithOrder() {
		// assertEquals(1, Partition.count(1));
		// assertEquals(2, Partition.count(2));
		// assertEquals(4, Partition.count(3));
		assertEquals(8, Partition.count(4));
	}
	
}
