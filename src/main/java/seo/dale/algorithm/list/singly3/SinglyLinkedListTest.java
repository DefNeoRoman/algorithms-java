package seo.dale.algorithm.list.singly3;

import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void test() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.add(3);
        list.add(32);
        list.add(54);
        list.add(89);
        list.addAfter(76, 54);
        System.out.println(list);
    }

}