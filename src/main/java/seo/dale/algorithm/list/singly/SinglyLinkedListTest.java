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
	public void testAddAtTheBeginning() throws Exception {
		singlyLinkedList.addAtTheBeginning('A');
		assertEquals("A", singlyLinkedList.toString());
		singlyLinkedList.addAtTheBeginning('B');
		assertEquals("B->A", singlyLinkedList.toString());
		singlyLinkedList.addAtTheBeginning('C');
		assertEquals("C->B->A", singlyLinkedList.toString());
	}

	@Test
	public void testAddAtTheEnd() throws Exception {
		singlyLinkedList.addAtTheEnd('A');
		assertEquals("A", singlyLinkedList.toString());
		singlyLinkedList.addAtTheEnd('B');
		assertEquals("A->B", singlyLinkedList.toString());
		singlyLinkedList.addAtTheEnd('C');
		assertEquals("A->B->C", singlyLinkedList.toString());
	}

	@Test
	public void testInsertAt() throws Exception {
		singlyLinkedList.addAtTheBeginning('A');
		singlyLinkedList.addAtTheBeginning('C');
		singlyLinkedList.addAtTheBeginning('E');

		singlyLinkedList.insertAt(1, 'B');
		assertEquals("A->B->C->E", singlyLinkedList.toString());
		singlyLinkedList.insertAt(3, 'D');
		assertEquals("A->B->C->D->E", singlyLinkedList.toString());
	}

	@Test
	public void testSize() throws Exception {
		singlyLinkedList.print();
		int size = singlyLinkedList.size();
		System.out.println("size : " + size);
		assertEquals(0, size);
	}

}