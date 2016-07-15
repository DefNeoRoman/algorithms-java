package leetcode.jumpGame;

/**
 * Iterative bottom-up
 * : Keep moving the leftmost GOOD index for the right end to the left end
 */
public class Reference4 {

	public boolean canJump(int[] nums) {
		int leftmostPos = nums.length - 1; // the initial leftmost GOOD index
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i + nums[i] >= leftmostPos) {
				leftmostPos = i; // update the leftmost GOOD index
			}
		}
		return leftmostPos == 0;
	}

}