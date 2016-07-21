package leetcode.findKPairsWithSmallestSums;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void testKSmallestPairs() {
		int[] nums1 = {1,7,11};
		int[] nums2 = {2,4,6};
		int k = 3;
		printListOfArray(nums1, nums2, k);
	}

	@Test
	public void testKSmallestPairs2() {
		int[] nums1 = {1,1,2};
		int[] nums2 = {1,2,3};
		int k = 2;
		printListOfArray(nums1, nums2, k);
	}

	@Test
	public void testKSmallestPairs3() {
		int[] nums1 = {1,2};
		int[] nums2 = {3};
		int k = 3;
		printListOfArray(nums1, nums2, k);
	}

	private void printListOfArray(int[] nums1, int[] nums2, int k) {
		List<int[]> list = solution.kSmallestPairs(nums1, nums2, k);
		for (int[] arr : list) {
			System.out.println(Arrays.toString(arr));
		}
	}

}