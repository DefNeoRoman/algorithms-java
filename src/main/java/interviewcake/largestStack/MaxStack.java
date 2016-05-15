package interviewcake.largestStack;

import java.util.Stack;

/**
 * https://www.interviewcake.com/question/java/largest-stack?utm_source=weekly_email
 */
public class MaxStack {

    private Stack<Integer> stack;
    private Stack<Integer> maxStack;

    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int item) {
        stack.push(item);
        if (maxStack.isEmpty() || item >= maxStack.peek()) {
            maxStack.push(item);
        }
        System.out.println("push " + item + " with " + maxStack);
    }

    public int pop() {
        int item = stack.pop();
        if (item == maxStack.peek()) {
            maxStack.pop();
        }
        System.out.println("pop " + item + " with " + maxStack);
        return item;
    }

    public int getMaxStack() {
        return maxStack.peek();
    }

}
