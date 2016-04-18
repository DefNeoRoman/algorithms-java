package seo.dale.algorithm.math;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;
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
        Map<Integer, Boolean> candidates = new HashMap<>(num -1);
        for (int i = 2; i <= num; i++) {
            candidates.put(i, true);
        }
        System.out.println(candidates);

        int min = 2;

        while (true) {
            for (int times = 2; min * times < num; times++) {
                int key = min * times;
                if (key <= num) {
                    candidates.put(key, false);
                }
            }
            min = findMinPrimeSoFar(min, num, candidates);
            if (min == -1) {
                break;
            }
        }

        List<Integer> primeNumbers = new ArrayList<>();
        candidates.forEach((key, value) -> {
            if (value) {
                primeNumbers.add(key);
            }
        });
        return primeNumbers;
    }

    public int findMinPrimeSoFar(int min, int num, Map<Integer, Boolean> candidates) {
        for (int key = min + 1; key <= num; key++) {
            if (candidates.get(key)) {
                return key;
            }
        }
        return -1;
    }


}
