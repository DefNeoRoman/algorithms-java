package CtCI.Ch04_TreesAndGraphs.Q4_08_First_Common_Ancestor;

import CtCI.CtCILibrary.TreeNode;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%204/Question4_7/Question.java
 */
public class CommonAncestor2 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		TreeNode n1 = root.find(1);
		TreeNode n7 = root.find(7);
		TreeNode ancestor = commonAncestor(root, n1, n7);
		System.out.println(ancestor.data);
	}

	/**
	 * When tree nodes don't have the reference to their parents,
	 * if p and q is on the different side, the node is the command ancestor.
	 * Whereas, p and q is on the same side, search that side for the command ancestor.
	 *
	 */
	public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return null;
		}
		if (root == p || root == q) {
			return root;
		}
		boolean leftContainsP = contains(root.left, p);
		boolean leftContainsQ = contains(root.left, q);

		if (leftContainsP != leftContainsQ) {
			return root;
		}
		TreeNode childSide = leftContainsP ? root.left : root.right;
		return commonAncestor(childSide, p, q);
	}

	private static boolean contains(TreeNode node, TreeNode a) {
		if (node == null) {
			return false;
		}
		if (node == a) {
			return true;
		}
		return contains(node.left, a) || contains(node.right, a);
	}


}
