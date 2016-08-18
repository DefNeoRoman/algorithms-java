package seo.dale.algorithm.list.singly5;

import org.junit.Test;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class ListNodeTest {

	@Test
	public void testToString() {
		ListNode<String> nodeA = new ListNode<>("A");
		ListNode<String> nodeB = new ListNode<>("B", nodeA);
		ListNode<String> nodeC = new ListNode<>("C", nodeB);
		ListNode<String> nodeD = new ListNode<>("D", nodeC);
		ListNode<String> nodeE = new ListNode<>("E", nodeD);
		System.out.println(nodeA);
	}

}