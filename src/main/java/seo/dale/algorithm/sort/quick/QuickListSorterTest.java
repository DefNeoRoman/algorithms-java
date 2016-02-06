package seo.dale.algorithm.sort.quick;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class QuickListSorterTest {

	@Test
	public void test() {
		List<Integer> list = Arrays.asList(20, 88, 0, 44, 99, 11, 33, 55, 22, 77, 66);
		List<Integer> sortedList = QuickListSorter.sort(list);
		List<Integer> expectedSortedList = Arrays.asList(0, 11, 20, 22, 33, 44, 55, 66, 77, 88, 99);
		System.out.println(list);
		System.out.println(expectedSortedList);
		assertArrayEquals(expectedSortedList.toArray(), sortedList.toArray());
	}

}
