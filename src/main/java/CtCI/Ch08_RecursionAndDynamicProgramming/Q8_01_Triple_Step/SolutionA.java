package CtCI.Ch08_RecursionAndDynamicProgramming.Q8_01_Triple_Step;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionA {

    @Test
    public void test() {
//        assertEquals(7, countWays(4));
//        assertEquals(274, countWays(10));
//        assertEquals(121415, countWays(20));
        assertEquals(53798080, countWays(30));
    }

    public static int countWays(int n) {
        int[] mem = new int[n + 1];
        return countWays(n, mem);
    }

    public static int countWays(int n, int[] mem) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (mem[n] == 0) {
            System.out.printf("countWays(%s) = countWays(%s) + countWays(%s) + countWays(%s)%n", n, n - 1, n - 2, n - 3);
            mem[n] = countWays(n - 1, mem) + countWays(n - 2, mem) + countWays(n - 3, mem);
        }
        return  mem[n];
    }

}
