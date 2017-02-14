package seo.dale.algorithm.heap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinHeapTest {

	@Test
	public void test() {
		MinHeap minHeap = new MinHeap();
		minHeap.add(10);
		minHeap.add(20);
		minHeap.add(15);
		minHeap.add(17);
		System.out.println(minHeap);

		assertEquals(10, minHeap.pool());
		assertEquals(15, minHeap.peek());
	}

}