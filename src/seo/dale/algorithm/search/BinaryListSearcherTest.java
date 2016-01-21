package seo.dale.algorithm.search;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinaryListSearcherTest {

    private List<Integer> a = Arrays.asList(1, 3, 4, 5, 10, 13, 14, 15, 22);

    @Test
    public void testBinarySearch() {
        assertTrue(BinaryListSearcher.binarySearch(a, 3));
        assertTrue(BinaryListSearcher.binarySearch(a, 5));
        assertTrue(BinaryListSearcher.binarySearch(a, 14));
        assertFalse(BinaryListSearcher.binarySearch(a, 2));
        assertFalse(BinaryListSearcher.binarySearch(a, -1));
        assertFalse( BinaryListSearcher.binarySearch(a, 100));
    }

}
