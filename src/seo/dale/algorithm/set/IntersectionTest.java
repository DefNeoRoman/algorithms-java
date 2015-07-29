package seo.dale.algorithm.set;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class IntersectionTest {

	@Test
	public void test() {
		int[] firstArr = {12, -9, 6, -3, 0, 3, -6, 9, -12};
		int[] secondArr = {12, 8, 6, 4, 2};
		
		int[] expected = {6, 12};
		int[] actual = Intersection.findIntersection(firstArr, secondArr);
		System.out.println(Arrays.toString(actual));
		
		assertTrue(Arrays.equals(expected, actual));
	}

}
