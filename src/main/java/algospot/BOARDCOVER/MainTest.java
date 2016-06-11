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

        assertEquals(2, Main.fill(3, 7, lines));
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

}