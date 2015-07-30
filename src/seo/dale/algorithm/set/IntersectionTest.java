package seo.dale.algorithm.set;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class IntersectionTest {

	@Test
	public void test2() {
		int[] firstArr = {1, 2, 2, 3};
		int[] secondArr = {2, 2, 3, 4};
		
		int[] expected = {2, 2, 3};
		int[] actual = Intersection.findIntersection2(firstArr, secondArr);
		System.out.println(Arrays.toString(actual));
		
		assertTrue(Arrays.equals(expected, actual));
	}
	
	@Test
	public void test3() {
		int[] firstArr = {12, -9, 6, -3, 0, 3, -6, 9, -12};
		int[] secondArr = {12, 8, 6, 4, 2};
		
		int[] expected2 = {6, 12};
		int[] actual2 = Intersection.findIntersection2(firstArr, secondArr);
		System.out.println(Arrays.toString(actual2));
		assertTrue(Arrays.equals(expected2, actual2));
		
		Integer[] expected3 = {6, 12};
		Integer[] actual3 = Intersection.findIntersection3(firstArr, secondArr);
		System.out.println(Arrays.toString(actual3));
		assertTrue(Arrays.equals(expected3, actual3));
	}

}
