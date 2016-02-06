package seo.dale.algorithm.sort.merge;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListMergeSorterTest {

    @Test
    public void testMergeSort() {
        List<Integer> values = Arrays.asList(3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48);
        List<Integer> expected = Arrays.asList(2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 44, 46, 47, 48, 50);
        List<Integer> actual = ListMergeSorter.mergeSort(values);
        assertEquals(expected, actual);
    }

    @Test
    public void testMerge() {
        List<Integer> left = Arrays.asList(3, 5, 15, 26, 36, 38, 44, 47);
        List<Integer> right = Arrays.asList(2, 4, 19, 27, 46, 48, 50);

        List<Integer> expected = Arrays.asList(2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 44, 46, 47, 48, 50);
        List<Integer> actual = ListMergeSorter.merge(left, right);

        System.out.println(actual);
        assertEquals(expected, actual);
    }

}
