package seo.dale.algorithm.tree;

import org.junit.*;

public class MaxHeapTest {

	private MaxHeap heap = new MaxHeap();

	@Test
	public void test1() {
		heap.insert(10);
		heap.insert(45);
		heap.insert(19);
		heap.insert(11);
		heap.insert(96);
		System.out.println(heap);
		
		int size = heap.getSize();
		for (int i = 0; i < size; i++) {
			System.out.println("# delete : " + heap.delete());
		}
	}
	
	@Test
	public void test() {
		heap.insert(16);
		heap.insert(15);
		heap.insert(7);
		heap.insert(14);
		heap.insert(13);
		heap.insert(6);
		heap.insert(5);
		heap.insert(12);
		heap.insert(11);
		heap.insert(10);
		heap.insert(9);
		heap.insert(4);
	
		System.out.println(heap);
		heap.insert(8);
		System.out.println(heap);
		heap.delete();
		System.out.println(heap);
		heap.delete();
		System.out.println(heap);
	}
	
}
