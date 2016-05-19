package seo.dale.algorithm.list.singly2;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SinglyLinkedListTest {

	private SinglyLinkedList<String> singlyLinkedList;

	@Before
	public void setUp() {
		singlyLinkedList = new SinglyLinkedList<>();
		for (int i = 0; i < 5; i++) {
			singlyLinkedList.add(Integer.toString(i));
		}
	}

	@Test
	public void test() {
		System.out.println("Print: " + singlyLinkedList);
		System.out.println(".size() : " + singlyLinkedList.size());
		System.out.println(".get(3) : " + singlyLinkedList.get(3));
		System.out.println(".remove(2) : " + singlyLinkedList.remove(3));
		System.out.println(".get(3) : " + singlyLinkedList.get(3));
		System.out.println(".size() : " + singlyLinkedList.size());
		System.out.println("Print: " + singlyLinkedList);
	}

	@Test
	public void testGet() {
		assertNull(singlyLinkedList.get(-1));
		assertNull(singlyLinkedList.get(5));

		assertEquals("1", singlyLinkedList.get(1));
		assertEquals("3", singlyLinkedList.get(3));
	}

	@Test
	public void testRemove() {
		assertFalse(singlyLinkedList.remove(-1));
		assertFalse(singlyLinkedList.remove(5));

		System.out.println(singlyLinkedList);
		assertTrue(singlyLinkedList.remove(1));
		System.out.println(singlyLinkedList);
		assertTrue(singlyLinkedList.remove(2));
		System.out.println(singlyLinkedList);
		assertTrue(singlyLinkedList.remove(0));
		System.out.println(singlyLinkedList);
	}

}
