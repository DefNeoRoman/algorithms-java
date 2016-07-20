package leetcode.guessNumberHigherOrLower;

/**
 * Iterative
 */
public class Solution2 extends GuessGame {
	public Solution2(int n) {
		super(n);
	}

	public int guessNumber(int n) {
		int start = 1, end = n;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int result = guess(mid);
			if (result == 0) return mid;
			else if (result == 1) start = mid + 1;
			else end = mid - 1;
		}
		return 0;
	}

}