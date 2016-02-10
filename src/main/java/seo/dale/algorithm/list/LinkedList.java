package seo.dale.algorithm.list;

public class LinkedList<T> {

    private T element;
    private LinkedList<T> next;

    public LinkedList(T element, LinkedList<T> next) {
        this.element = element;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public LinkedList<T> getNext() {
        return next;
    }

    public static <T> LinkedList<T> reverse_recursive(final LinkedList<T> original) {
        if (original == null) {
            throw new NullPointerException("Cannot reverse a null list");
        }

        if (original.getNext() == null) {
            return original;
        }

        final LinkedList<T> next = original.next;
        original.next = null;

        final LinkedList<T> othersReversed = reverse_recursive(next);

        next.next = original;

        return othersReversed;
    }

    public static <T> LinkedList<T> reverse_iterative(final LinkedList<T> original) {
        LinkedList<T> current = original;
        LinkedList<T> previous= null;
        LinkedList<T> next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

}
