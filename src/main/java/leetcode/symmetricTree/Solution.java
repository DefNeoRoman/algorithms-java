package leetcode.symmetricTree;

/**
 * recursive
 */
public class Solution {

	public boolean isSymmetric(TreeNode root) {
		if (root == null) return true;

		return isSymmetric(root.left, root.right);
	}
	
	private boolean isSymmetric(TreeNode left, TreeNode right) {
		if (left == null || right == null) {
			return left == right; // 둘 다 null 일 때는 더 이상 자식이 없으므로 true, 둘 중에 하나라도 null 이 아니면 균형이 깨졌으므로 false
		}

		if (left.val != right.val) {
			return false;
		}

		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	}

}

