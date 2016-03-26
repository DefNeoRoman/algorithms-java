package seo.dale.algorithm.bruteforce.boardcover;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardCoverTest {

    private BoardCover boardCover;

    @Test
    public void test() {
        int height = 3;
        int width = 7;
        boolean[][] matrix = {
                {true, false, false, false, false, false, true},
                {true, false, false, false, false, false, true},
                {true, true, false, false, true, true, true}
        };
        BoardCover boardCover = new BoardCover(height, width, matrix);
        assertEquals(2, boardCover.count());
    }

}