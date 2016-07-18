package leetcode.moveZeroes;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class Solution {
	public void moveZeroes(int[] nums) {
		int size = nums.length;
		for (int i = 0; i < size;) {
			if (nums[i] == 0) {
				for (int j = i; j < size - 1; j++) {
					swap(nums, j, j + 1);
				}
				size--;
			} else {
				i++;
			}
		}
	}

	private void swap(int[] nums, int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
}
