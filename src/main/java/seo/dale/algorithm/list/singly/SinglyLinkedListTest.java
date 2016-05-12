package seo.dale.algorithm.list.singly;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

	private SinglyLinkedList<Character> singlyLinkedList;

	@Before
	public void setUp() throws Exception {
		singlyLinkedList = new SinglyLinkedList<>();
	}

	@Test
	public void testPrepend() throws Exception {
		singlyLinkedList.prepend('A');
		assertEquals("A", singlyLinkedList.toString());
		singlyLinkedList.prepend('B');
		assertEquals("B->A", singlyLinkedList.toString());
		singlyLinkedList.prepend('C');
		assertEquals("C->B->A", singlyLinkedList.toString());
	}

	@Test
	public void testPostpend() throws Exception {
		singlyLinkedList.postpend('A');
		assertEquals("A", singlyLinkedList.toString());
		singlyLinkedList.postpend('B');
		assertEquals("A->B", singlyLinkedList.toString());
		singlyLinkedList.postpend('C');
		assertEquals("A->B->C", singlyLinkedList.toString());
	}

	@Test
	public void testInsert() throws Exception {
		singlyLinkedList.prepend('A');
		singlyLinkedList.prepend('C');
		singlyLinkedList.prepend('E');

		singlyLinkedList.insert(1, 'B');
		assertEquals("A->B->C->E", singlyLinkedList.toString());
		singlyLinkedList.insert(3, 'D');
		assertEquals("A->B->C->D->E", singlyLinkedList.toString());
	}
	@Test
	public void testDelete() throws Exception {
		singlyLinkedList.prepend('C');
		singlyLinkedList.prepend('B');
		singlyLinkedList.prepend('A');

		singlyLinkedList.delete(1);
		assertEquals("A->C", singlyLinkedList.toString());
		singlyLinkedList.delete(0);
		assertEquals("C", singlyLinkedList.toString());
	}

	@Test
	public void testSize() throws Exception {
		singlyLinkedList.print();
		int size = singlyLinkedList.size();
		System.out.println("size : " + size);
		assertEquals(0, size);
	}

}