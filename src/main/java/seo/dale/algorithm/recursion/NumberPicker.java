package seo.dale.algorithm.recursion;

import org.junit.Test;

import java.util.Stack;

/**
 * Combination
 */
public class NumberPicker {

    @Test
    public void testPick4OutOf() {
        pick4OutOf(7);
    }

    /**
     * iteration
     */
    public void pick4OutOf(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        System.out.printf("[%d, %d, %d, %d]\n", i, j, k, l);
                    }
                }
            }
        }
    }

    @Test
    public void testPick() {
        pick(7, new Stack<>(), 4);
    }

    /**
     * recursion
     */
    public void pick(int size, Stack<Integer> picked, int toPick) {
        if (toPick == 0) {
            System.out.println(picked);
        }

        int smallest = picked.isEmpty() ? 0 : picked.peek() + 1;

        for (int next = smallest; next < size; next++) {
            picked.push(next);
            System.out.printf("\tpick(%d, %s, %d);\n", size, picked, toPick - 1);
            pick(size, picked, toPick - 1);
            picked.pop();
        }

    }

}
