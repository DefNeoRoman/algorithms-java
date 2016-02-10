package seo.dale.algorithm.stack;

import java.util.LinkedList;
import java.util.List;

public class GenericStack<E> {

    private final List<E> list;

    public GenericStack() {
        list = new LinkedList<E>();
    }

    public void push(final E element) {
        list.add(0, element);
    }

    public E pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

}
