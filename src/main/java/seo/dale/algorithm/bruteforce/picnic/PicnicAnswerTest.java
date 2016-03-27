package seo.dale.algorithm.bruteforce.picnic;

import org.junit.Test;

import static org.junit.Assert.*;

public class PicnicAnswerTest {

    @Test
    public void test() {
        int[] input = {0, 1, 1, 2, 2, 3, 3, 0, 0, 2, 1, 3};
        boolean[][] friends = new boolean[4][4];

        for (int i = 0; i < input.length - 1; i += 2) {
            friends[input[i]][input[i + 1]] = true;
        }

        boolean[] taken = {false, false, false, false};
        assertEquals(3, new PicnicAnswer(4, friends).countPairings(taken));
    }

}