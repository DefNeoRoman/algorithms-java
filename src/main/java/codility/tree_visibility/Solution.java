package codility.tree_visibility;

/**
 * https://codility.com/tasks/tree_visibility/
 * https://codility.com/tickets/tryDR7AH7-UKU/
 */
public class Solution {
	public int solution(Tree T) {
		return countVisibleNodes(T, Integer.MIN_VALUE);
	}

	private int countVisibleNodes(Tree node, int max) {
		if (node == null) {
			return 0;
		}
		int count = 0;
		if (node.x >= max) {
			count++;
			max = node.x;
		}
		count += countVisibleNodes(node.l, max) + countVisibleNodes(node.r, max);
		return count;
	}
}

class Tree {
	public int x;
	public Tree l;
	public Tree r;
}
