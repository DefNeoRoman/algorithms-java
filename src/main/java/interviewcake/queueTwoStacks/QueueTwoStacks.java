package interviewcake.queueTwoStacks;

import java.util.Stack;

/**
 * https://www.interviewcake.com/question/java/queue-two-stacks?utm_source=weekly_email
 */
public class QueueTwoStacks<T> {

    private Stack<T> inStack = new Stack<>();

    private Stack<T> outStack = new Stack<>();

    public void enqueue(T data) {
        inStack.push(data);
    }

    public T dequeue() {
        if (outStack.isEmpty()) {
            copyOutToIn();
        }
        return outStack.pop();
    }

    private void copyOutToIn() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }

    @Override
    public String toString() {
        return "QueueTwoStacks{" +
                "inStack=" + inStack +
                ", outStack=" + outStack +
                '}';
    }
}