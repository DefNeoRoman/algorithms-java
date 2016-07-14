package leetcode.symmetricTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * use iteration with the aid of a queue.
 */
@SuppressWarnings("Duplicates")
public class Solution3 {

	public boolean isSymmetric(TreeNode root) {
		if (root == null) return true;

		Queue<TreeNode> leftQueue = new LinkedList<>();
		Queue<TreeNode> rightQueue = new LinkedList<>();

		leftQueue.offer(root.left);
		rightQueue.offer(root.right);

		while (!leftQueue.isEmpty()) {
			TreeNode left = leftQueue.poll();
			TreeNode right = rightQueue.poll();

			if (left == null && right == null) continue;
			if (left == null || right == null) return false;
			if (left.val != right.val) return false;

			leftQueue.offer(left.left);
			leftQueue.offer(left.right);

			rightQueue.offer(right.right);
			rightQueue.offer(right.left);
		}

		return true;
	}

}
