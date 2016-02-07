package seo.dale.algorithm.fibonacci;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Fibonacci {

    /**
     * 1에서 n까지의 피보나치 수열을 반환하는 메서드를 작성하라.
     */
    public static List<Integer> fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be less than zero.");
        }
        if (n == 0) {
            return Collections.emptyList();
        }
        if (n == 1) {
            return Arrays.asList(0);
        }

        List<Integer> list = new ArrayList<>(n);
        list.add(0);
        list.add(1);

        while (list.size() < n) {
            int a = list.get(list.size() - 1);
            int b = list.get(list.size() - 2);
            list.add(a + b);
        }

        return list;
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, fibonacci(0).size());
        assertEquals(Arrays.asList(0), fibonacci(1));
        assertEquals(Arrays.asList(0, 1), fibonacci(2));
        assertEquals(Arrays.asList(0, 1, 1), fibonacci(3));
        assertEquals(Arrays.asList(0, 1, 1, 2), fibonacci(4));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3), fibonacci(5));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), fibonacci(6));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), fibonacci(7));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), fibonacci(8));
    }

    /**
     * 피보나치 수열의 n번째 값을 반환하는 메서드를 작성하라.
     */
    public static int fibN_iterative(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must not be less than zero.");
        }

        int a = 0, b = 1;

        if (n == 1) {
            return a;
        }

        if (n == 2) {
            return b;
        }

        int c = 0;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    @Test
    public void testFibN_iterative() {
        assertEquals(0, fibN_iterative(1));
        assertEquals(1, fibN_iterative(2));
        assertEquals(1, fibN_iterative(3));
        assertEquals(2, fibN_iterative(4));
        assertEquals(3, fibN_iterative(5));
        assertEquals(5, fibN_iterative(6));
        assertEquals(8, fibN_iterative(7));
        assertEquals(13, fibN_iterative(8));
    }

    public static int fibN_recursive(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must not be less than zero.");
        }

        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        System.out.printf("fibN_recursive(%d) + fibN_recursive(%s)\n", n - 2, n - 1);
        return fibN_recursive(n - 2) + fibN_recursive(n - 1);
    }

    private static Map<Integer, Integer> fibCache = new HashMap<>();

    public static int fibN_recursive_cache(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must not be less than zero.");
        }

        fibCache.put(1, 0);
        fibCache.put(2, 1);

        return fibN_recursive_cache_internal(n);
    }

    public static int fibN_recursive_cache_internal(int n) {
        if (fibCache.containsKey(n)) {
            return fibCache.get(n);
        }

        System.out.printf("fibN_recursive_cache_internal(%d) + fibN_recursive_cache_internal(%d)\n", n - 2, n - 1);
        int value = fibN_recursive_cache_internal(n - 2) + fibN_recursive_cache_internal(n - 1);
        fibCache.put(n, value);
        return value;
    }

    @Test
    public void testFibN_recursive() {
//        assertEquals(0, fibN_recursive(1));
//        assertEquals(1, fibN_recursive(2));
//        assertEquals(1, fibN_recursive(3));
//        assertEquals(2, fibN_recursive(4));
//        assertEquals(3, fibN_recursive(5));
//        assertEquals(5, fibN_recursive(6));
//        assertEquals(8, fibN_recursive(7));
        assertEquals(13, fibN_recursive(8));
        assertEquals(13, fibN_recursive_cache(8));
    }

}
