package seo.dale.algorithm.array;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class ArrayRotaterTest {

	@Test
	public void test() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		ArrayRotater.right_rotate(arr, 2, 6);
		int[] expected = {1, 2, 7, 3, 4, 5, 6, 8};
		System.out.println("# expected : " + Arrays.toString(expected));
		System.out.println("# actual : " + Arrays.toString(arr));
		assertTrue(Arrays.equals(expected, arr));
	}

}
