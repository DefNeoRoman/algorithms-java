/**
 * https://discuss.leetcode.com/topic/19931/6-line-java-solution-in-o-n/2
 */
package leetcode.jumpGame;

public class Reference2 {

	public boolean canJump(int[] nums) {
		int n = nums.length;
		if (n==0) return false;
		int max_reach = 0;
		boolean ret = false;
		for (int i=0;i<=max_reach;i++) {
			if (max_reach >= n-1) {
				ret = true;
				break;
			}
			int reach = i+nums[i];
			if (reach > max_reach) max_reach = reach;

		}
		return ret;
	}

}
