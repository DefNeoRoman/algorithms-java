/**
 * https://leetcode.com/problems/jump-game/
 */
package leetcode.jumpGame;

public class Failure {

	public boolean canJump(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return true;
		}
		return canJumpAt(nums, 0);
	}

	private boolean canJumpAt(int[] nums, int index) {
		if (index + nums[index] >= nums.length - 1)
			return true;

		if (nums[index] <= 0)
			return false;

		for (int jump = nums[index]; jump > 0; jump--) {
			if (canJumpAt(nums, index + jump)) {
				return true;
			}
		}

		nums[index] = -1;
		return false;
	}

}
