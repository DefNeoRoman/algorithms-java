package seo.dale.algorithm.math;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 */
public class Prime2 {

    @Test
    public void test() {
        assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29), findAllPrimeNumbersUpTo(30));
    }

    public List<Integer> findAllPrimeNumbersUpTo(int num) {
        boolean[] primes = new boolean[num + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        int min = 1;
        while ((min = findMinPrimeSoFar(min, primes)) != -1) {
            int times = 2;
            int candidate;
            while ((candidate = min * times) <= num) {
                primes[candidate] = false;
                times++;
            }
        }

        return makePrimeNumberList(primes);
    }

    public int findMinPrimeSoFar(int min, boolean[] primes) {
        for (int i = min + 1; i < primes.length; i++) {
            if (primes[i]) {
                return i;
            }
        }
        return -1;
    }

    public List<Integer> makePrimeNumberList(boolean[] arr) {
        List<Integer> list = new ArrayList<>();
        double until = Math.ceil(Math.sqrt(arr.length - 1));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                list.add(i);
            }
        }
        return list;
    }

}
