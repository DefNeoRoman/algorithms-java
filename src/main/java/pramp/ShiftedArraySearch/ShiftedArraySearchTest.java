package pramp.ShiftedArraySearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShiftedArraySearchTest {

    private ShiftedArraySearch sas = new ShiftedArraySearch();

    @Test
    public void test() {
        int[] arr = {2, 4, 5, 9, 12, 17};
        assertEquals(0, sas.find(2, arr));
        assertEquals(2, sas.find(5, arr));
        assertEquals(4, sas.find(12, arr));
        assertEquals(5, sas.find(17, arr));
        assertEquals(-1, sas.find(1, arr));
        assertEquals(-1, sas.find(18, arr));
    }

    @Test
    public void testShifted() {
        int[] arr = {9, 12, 17, 2, 4, 5};
        assertEquals(0, sas.find(2, arr));
        assertEquals(2, sas.find(5, arr));
        assertEquals(4, sas.find(12, arr));
        assertEquals(5, sas.find(17, arr));
        assertEquals(-1, sas.find(1, arr));
        assertEquals(-1, sas.find(18, arr));
    }

    @Test
    public void testShifted2() {
        int[] arr = {17, 2, 4, 5, 9, 12};
        assertEquals(0, sas.find(2, arr));
        assertEquals(2, sas.find(5, arr));
        assertEquals(4, sas.find(12, arr));
        assertEquals(5, sas.find(17, arr));
        assertEquals(-1, sas.find(1, arr));
        assertEquals(-1, sas.find(18, arr));
    }

    @Test
    public void testShifted3() {
        int[] arr = {4, 5, 9, 12, 17, 2};
        assertEquals(0, sas.find(2, arr));
        assertEquals(2, sas.find(5, arr));
        assertEquals(4, sas.find(12, arr));
        assertEquals(5, sas.find(17, arr));
        assertEquals(-1, sas.find(1, arr));
        assertEquals(-1, sas.find(18, arr));
    }

}
