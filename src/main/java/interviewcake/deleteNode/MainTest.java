package interviewcake.deleteNode;

import org.junit.Test;

/**
 * https://www.interviewcake.com/question/java/delete-node?utm_source=weekly_email
 */
public class MainTest {

    public static class LinkedListNode {

        public String value;
        public LinkedListNode next;

        public LinkedListNode(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            if (next == null) {
                return value + " -> null";
            }
            return value + " -> " + next.toString();
        }
    }

    @Test
    public void test() {
        LinkedListNode a = new LinkedListNode("A");
        LinkedListNode b = new LinkedListNode("B");
        LinkedListNode c = new LinkedListNode("C");

        a.next = b;
        b.next = c;

        System.out.println(a);

        deleteNode(b);

        System.out.println(a);

        deleteNode(b);

        System.out.println(a);
    }

    private static void deleteNode(LinkedListNode current) {
        LinkedListNode nextNode = current.next;

        if (nextNode == null) {
            current.value = null;
            current.next = null;
            return;
        }

        current.value = nextNode.value;
        current.next = nextNode.next;
    }


}
