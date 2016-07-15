package leetcode.jumpGame;

import java.util.Arrays;

/**
 * Iterative bottom-up
 */
public class Reference3 {

	enum Flag {
		GOOD, BAD, UNKNOWN
	}

	private Flag[] memo;

	public boolean canJump(int[] nums) {
		memo = new Flag[nums.length];
		Arrays.fill(memo, Flag.UNKNOWN);
		memo[nums.length - 1] = Flag.GOOD;

		for (int i = nums.length - 2; i >= 0; i--) {
			int furthestJump = Math.min(i + nums[i], nums.length - 1);
			for (int j = i + 1; j <= furthestJump; j++) {
				if (memo[j] == Flag.GOOD) {
					memo[i] = Flag.GOOD;
					break;
				}
			}
		}

		return memo[0] == Flag.GOOD;
	}

}