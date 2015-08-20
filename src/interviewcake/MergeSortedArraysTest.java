package interviewcake;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSortedArraysTest {

	MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();;
	
	@Test
	public void test() {
		int[] newArray = {3, 4, 6, 10, 11, 15};
		int[] sortedArray = {1, 5, 8, 12, 14, 19};

		int[] result = mergeSortedArrays.mergeArrays(newArray, sortedArray);
		assertArrayEquals(new int[]{1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19}, result);
	
	}

}
