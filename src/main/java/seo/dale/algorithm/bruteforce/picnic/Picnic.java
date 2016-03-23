package seo.dale.algorithm.bruteforce.picnic;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Picnic {

    @Test
    public void test() {
        // assertEquals(1, countPairs(2, new int[][]{{2, 1}}));
        assertEquals(3, countPairs(4, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}, {0, 2}, {1, 3}}));
        // assertEquals(4, countPairs(6, new int[][]{{0, 1}, {0, 2}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}, {3, 5}, {4, 5}}));
    }


    public static int countPairs(int numOfStudents, int[][] friendArray) {
        return countPairsFrom(numOfStudents, friendArray, 0);
    }

    public static int countPairsFrom(int numOfStudents, int[][] friendArray, int start) {
        if (numOfStudents < 2) {
            return 0;
        }

        if (start >= friendArray.length -1) {
            return 0;
        }

        int[] one = friendArray[start];

        for (int i = start + 1; i < friendArray.length; i++) {
            int[] other = friendArray[i];

            if(!isDuplicated(one, other)) {

            }
        }

         countPairsFrom(numOfStudents - 2, friendArray, start + 1);

        return -1;
    }

    public static boolean isDuplicated(int[] one, int[] other) {
        for (int i : one) {
            for (int j : other) {
                if (i == j) {
                    return true;
                }
            }
        }
        return false;
    }

}
