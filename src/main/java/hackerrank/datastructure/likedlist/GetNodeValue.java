package hackerrank.datastructure.likedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
 */
public class GetNodeValue {

    @Test
    public void test() {
        Node head = new Node(0, new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, null)))))));
        assertEquals(6, GetNode(head, 0));
        assertEquals(5, GetNode(head, 1));
        assertEquals(4, GetNode(head, 2));
    }

    int GetNode(Node head, int n) {
        Node left = head;
        Node right = head;

        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        while (right.next != null) {
            left = left.next;
            right = right.next;
        }

        return left.data;
    }

}
