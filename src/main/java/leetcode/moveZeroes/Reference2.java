package leetcode.moveZeroes;

/**
 * Approach #3 (Optimal)
 * 1) All elements before the slow pointer (lastNonZeroFoundAt) are non-zeroes.
 * 2) All elements between the current and slow pointer are zeroes.
 */
public class Reference2 {
	public void moveZeroes(int[] nums) {
		int lastNonZeroFoundAt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				swap(nums, lastNonZeroFoundAt++, i);
			}
		}
	}

	private void swap(int[] nums, int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
}
