package seo.dale.algorithm.list.ctci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

	private LinkedList<Character> linkedList;

	@Before
	public void setUp() throws Exception {
		linkedList = new LinkedList<>();
	}

	@Test
	public void testPrepend() throws Exception {
		linkedList.prepend('A');
		assertEquals("A", linkedList.toString());
		linkedList.prepend('B');
		assertEquals("B->A", linkedList.toString());
		linkedList.prepend('C');
		assertEquals("C->B->A", linkedList.toString());
	}

	@Test
	public void testappend() throws Exception {
		linkedList.append('A');
		assertEquals("A", linkedList.toString());
		linkedList.append('B');
		assertEquals("A->B", linkedList.toString());
		linkedList.append('C');
		assertEquals("A->B->C", linkedList.toString());
	}

	@Test
	public void testDelete() throws Exception {
		linkedList.prepend('C');
		linkedList.prepend('B');
		linkedList.prepend('A');

		linkedList.deleteWithValue('B');
		assertEquals("A->C", linkedList.toString());
		linkedList.deleteWithValue('A');
		assertEquals("C", linkedList.toString());
	}

}