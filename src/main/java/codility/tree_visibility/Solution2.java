package codility.tree_visibility;

/**
 * https://codility.com/tasks/tree_visibility/
 * https://codility.com/tickets/try6YDBZC-6TK/
 * Using a member variable
 */
public class Solution2 {

	private int count = 0;

	public int solution(Tree T) {
		checkVisible(T, Integer.MIN_VALUE);
		return count;
	}

	private void checkVisible(Tree T, int max) {
		if (T == null) {
			return;
		}
		if (T.x >= max) {
			count++;
			max = T.x;
		}
		checkVisible(T.l, max);
		checkVisible(T.r, max);
	}

}