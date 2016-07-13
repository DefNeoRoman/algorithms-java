package leetcode.jumpGame;

/**
 * Greedy 알고리즘 활용
 * : 배열의 바로 이전 인덱스까지 도달할 수 있는 최대 인덱스가 현재 인덱스보다 작으면 현대 인덱스까지 올 방법이 없음
 */
public class Solution {

	public boolean canJump(int[] nums) {
		if (nums == null && nums.length == 0)
			return false; // meaningless

		if (nums.length == 1)
			return true; // already at the last index

		int maxReachSoFar = 0;
		for (int curr = 0; curr < nums.length; curr++) {
			if (curr > maxReachSoFar) {
				return false; // has been impossible to reach the current index so far
			}
			int maxJump = nums[curr];
			int maxReach = curr + maxJump;
			maxReachSoFar = Math.max(maxReachSoFar, maxReach);
		}
		return true; // reached the last index
	}

}