package interviewcake.LinkedListCycles;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * https://www.interviewcake.com/question/java/linked-list-cycles?utm_source=weekly_email
 */
public class Main {

    @Test
    public void testTrue() {
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        // assertTrue(containsCycle(node1));
        assertTrue(containsCycle2(node1));
    }

    @Test
    public void testFalse() {
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);
        LinkedListNode node4 = new LinkedListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // assertFalse(containsCycle(node1));
        assertFalse(containsCycle2(node1));
    }

    /**
     * O(1) space complexity, O(n) time complexity
     */
    public static boolean containsCycle2(LinkedListNode root) {
        LinkedListNode slowNode = root;
        LinkedListNode fastNode = root;
        while (fastNode!= null & slowNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            System.out.println("- fastNode.value : " + fastNode);
            System.out.println("- slowNode.value : " + slowNode);

            if (fastNode == slowNode) {
                return true;
            }
        }
        return false;
    }

    /**
     * O(n) space complexity, O(n) time complexity
     */
    public static boolean containsCycle(LinkedListNode root) {
        Set<LinkedListNode> set = new HashSet<>();
        LinkedListNode node = root;
        while (node != null) {
            if (set.contains(node)) {
                System.out.println("found " + node.value);
                return true;
            } else {
                set.add(node);
                System.out.println("add " + node.value);
            }
            node = node.next;
        }
        return false;
    }


    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return Integer.toString(value);
        }

    }

}
