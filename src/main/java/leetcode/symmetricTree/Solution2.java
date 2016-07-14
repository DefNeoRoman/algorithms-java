package leetcode.symmetricTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * use iteration with the aid of a queue.
 */
public class Solution2 {

	public boolean isSymmetric(TreeNode root) {
		if (root == null) return true;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root.left);
		queue.offer(root.right);

		while (!queue.isEmpty()) {
			TreeNode left = queue.poll();
			TreeNode right = queue.poll();

			if (left == null && right == null) continue;
			if (left == null || right == null) return false;
			if (left.val != right.val) return false;

			queue.offer(left.left);
			queue.offer(right.right);
			queue.offer(left.right);
			queue.offer(right.left);
		}
		return true;
	}

}
