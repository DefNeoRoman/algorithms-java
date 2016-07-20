package leetcode.guessNumberHigherOrLower;

/**
 * Recursive
 */
public class Solution extends GuessGame {
	public Solution(int n) {
		super(n);
	}

	public int guessNumber(int n) {
		return find(1, n);
	}

	private int find(int start, int end) {
		if (start > end) return 0;
		int mid = start + (end - start) / 2;
		int result = guess(mid);
		if (result == 0) return mid;
		else if (result == 1) return find(mid + 1, end);
		else return find(start, mid - 1);
	}
}