package seo.dale.algorithm.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testReverseRecursive() throws Exception {
        final LinkedList<String> three = new LinkedList<>("3", null);
        final LinkedList<String> two = new LinkedList<>("2", three);
        final LinkedList<String> one = new LinkedList<>("1", two);

        final LinkedList<String> reversed = LinkedList.reverse_recursive(one);

        assertEquals("3", reversed.getElement());
        assertEquals("2", reversed.getNext().getElement());
        assertEquals("1", reversed.getNext().getNext().getElement());
    }

    @Test
    public void testReverseIterative() throws Exception {
        final LinkedList<String> three = new LinkedList<>("3", null);
        final LinkedList<String> two = new LinkedList<>("2", three);
        final LinkedList<String> one = new LinkedList<>("1", two);

        final LinkedList<String> reversed = LinkedList.reverse_iterative(one);

        assertEquals("3", reversed.getElement());
        assertEquals("2", reversed.getNext().getElement());
        assertEquals("1", reversed.getNext().getNext().getElement());
    }
}