package interviewcake.largestStack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxStackTest {

    @Test
    public void test() {
        MaxStack maxStack = new MaxStack();
        maxStack.push(3);
        maxStack.push(10);
        maxStack.push(10);
        maxStack.push(5);
        maxStack.push(9);
        assertEquals(10, maxStack.getMaxStack());

        maxStack.pop();
        assertEquals(10, maxStack.getMaxStack());

        maxStack.pop();
        assertEquals(10, maxStack.getMaxStack());

        maxStack.pop();
        assertEquals(10, maxStack.getMaxStack());

        maxStack.pop();
        assertEquals(3, maxStack.getMaxStack());
    }

}