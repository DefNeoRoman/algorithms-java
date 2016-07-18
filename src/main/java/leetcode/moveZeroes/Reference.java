package leetcode.moveZeroes;

/**
 * Approach #2 (Space Optimal, Operation Sub-Optimal)
 * Bring all the non 0 elements to the front of array keeping their relative order same.
 */
public class Reference {
	public void moveZeroes(int[] nums) {
		int lastNonZeroFoundAt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[lastNonZeroFoundAt++] = nums[i];
			}
		}
		while (lastNonZeroFoundAt < nums.length) {
			nums[lastNonZeroFoundAt++] = 0;
		}
	}
}
