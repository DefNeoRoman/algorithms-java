package algospot.BOARDCOVER;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test() {
        boolean[] lines = new boolean[21];
        int[] indexes = {0, 6, 7, 13, 14, 15, 18, 19, 20};
        for (int index : indexes) {
            lines[index] = true;
        }

        assertEquals(2, Main.countCovers(7, lines));
    }

    @Test
    public void test2() {
        boolean[] lines = new boolean[80];
        int[] indexes = {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 19,
                20, 29,
                30, 39,
                40, 49,
                50, 59,
                60, 69,
                70, 71, 72, 73, 74, 75, 76, 77, 78, 79
        };
        for (int index : indexes) {
            lines[index] = true;
        }

        assertEquals(1514, Main.countCovers(10, lines));
    }

    @Test
    public void testFindNextEmptySpot() throws Exception {
        boolean[] lines = new boolean[21];
        assertEquals(0, Main.findNextFalse(lines));

        for (int i = 0; i < 21; i++) {
            lines[i] = true;
        }
        assertEquals(-1, Main.findNextFalse(lines));

        for (int i = 5; i < 9; i++) {
            lines[i] = false;
        }
        lines[9] = false;

        assertEquals(5, Main.findNextFalse(lines));
    }

    @Test
    public void testAreAllVisited() {
        boolean[] lines = new boolean[21];
        assertFalse(Main.areAllVisited(lines));

        for (int i = 0; i < 21; i++) {
            lines[i] = true;
        }
        assertTrue(Main.areAllVisited(lines));

        lines[15] = false;
        assertFalse(Main.areAllVisited(lines));
    }

    @Test
    public void testPrint() throws Exception {
        boolean[] spots = new boolean[21];
        Main.print(7, spots);

        for (int i = 0; i < 21; i++) {
            spots[i] = true;
        }
        Main.print(7, spots);

        spots[15] = false;
        Main.print(7, spots);
    }
}