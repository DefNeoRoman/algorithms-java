package CtCI.Ch04_TreesAndGraphs.Q4_06_Successor;

import CtCI.CtCILibrary.TreeNode;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_06_Successor/Question.java
 */
public class QuestionA {

	public static TreeNode inorderSucc(TreeNode n) {
		if (n == null) return null;

		if (n.right != null) {
			TreeNode tmp = n.right;
			while (tmp.left != null) {
				tmp = tmp.left;
			}
			return tmp;
		} else {
			if (n.parent.left == n) {
				return n.parent;
			} else {
				return n.parent.parent;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		for (int i = 0; i < array.length; i++) {
			TreeNode node = root.find(array[i]);
			TreeNode next = inorderSucc(node);
			if (next != null) {
				System.out.println(node.data + "->" + next.data);
			} else {
				System.out.println(node.data + "->" + null);
			}
		}
	}

}
