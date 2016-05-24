package interviewcake.queueTwoStacks;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class QueueTwoStacksTest {

    @Test
    public void test() {
        QueueTwoStacks<String> queueTwoStacks = new QueueTwoStacks<>();

        System.out.println(queueTwoStacks);

        queueTwoStacks.enqueue("A");
        queueTwoStacks.enqueue("B");
        queueTwoStacks.enqueue("C");

        System.out.println(queueTwoStacks);

        assertEquals("A", queueTwoStacks.dequeue());
        assertEquals("B", queueTwoStacks.dequeue());

        System.out.println(queueTwoStacks);

        queueTwoStacks.enqueue("D");
        queueTwoStacks.enqueue("E");

        System.out.println(queueTwoStacks);

        assertEquals("C", queueTwoStacks.dequeue());
        assertEquals("D", queueTwoStacks.dequeue());
        assertEquals("E", queueTwoStacks.dequeue());

        System.out.println(queueTwoStacks);
    }

}