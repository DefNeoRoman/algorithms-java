package interviewcake.kthToLastNodeInSinglyLinkedList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthToLastNodeInSinglyLinkedListTest {

	KthToLastNodeInSinglyLinkedList svc = new KthToLastNodeInSinglyLinkedList();
	
	@Test
	public void test() {
		KthToLastNodeInSinglyLinkedList.Node a = svc.new Node("Angel Food");
		KthToLastNodeInSinglyLinkedList.Node b = svc.new Node("Bundt");
		KthToLastNodeInSinglyLinkedList.Node c = svc.new Node("Cheese");
		KthToLastNodeInSinglyLinkedList.Node d = svc.new Node("Devil's Food");
		KthToLastNodeInSinglyLinkedList.Node e = svc.new Node("Eccles");
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		try {
			svc.kthToLastNode(0, a);
		} catch (Exception ex) {
			assertEquals(ex.getMessage(), "Order must be greater than 0");
		}
		assertEquals(e, svc.kthToLastNode(1, a));
		assertEquals(d, svc.kthToLastNode(2, a));
		assertEquals(c, svc.kthToLastNode(3, a));
		assertEquals(b, svc.kthToLastNode(4, a));
		assertEquals(a, svc.kthToLastNode(5, a));
		assertEquals(null, svc.kthToLastNode(6, a));
		
		try {
			svc.kthToLastNode2(0, a);
		} catch (Exception ex) {
			assertEquals(ex.getMessage(), "Order must be greater than 0");
		}
		assertEquals(e, svc.kthToLastNode2(1, a));
		assertEquals(d, svc.kthToLastNode2(2, a));
		assertEquals(c, svc.kthToLastNode2(3, a));
		assertEquals(b, svc.kthToLastNode2(4, a));
		assertEquals(a, svc.kthToLastNode2(5, a));
		try {
			svc.kthToLastNode2(6, a);
		} catch (Exception ex) {
			assertEquals(ex.getMessage(), "Order must be less than the lengh.");
		}
		
		try {
			svc.kthToLastNode3(0, a);
		} catch (Exception ex) {
			assertEquals(ex.getMessage(), "Order must be greater than 0");
		}
		assertEquals(e, svc.kthToLastNode3(1, a));
		assertEquals(d, svc.kthToLastNode3(2, a));
		assertEquals(c, svc.kthToLastNode3(3, a));
		assertEquals(b, svc.kthToLastNode3(4, a));
		assertEquals(a, svc.kthToLastNode3(5, a));
		try {
			svc.kthToLastNode3(6, a);
		} catch (Exception ex) {
			assertEquals(ex.getMessage(), "Order must be less than the lengh.");
		}
	}

}
