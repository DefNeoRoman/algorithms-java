package CtCI.Ch04_TreesAndGraphs.Q4_07_Common_Ancestor;

import CtCI.CtCILibrary.TreeNode;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%204/Question4_7/Question.java
 */
public class CommonAncestor {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		TreeNode n1 = root.find(1);
		TreeNode n7 = root.find(7);
		TreeNode ancestor = commonAncestor(root, n1, n7);
		System.out.println(ancestor.data);
	}

	/**
	 * If tree nodes have the reference to their parents,
	 * visit one's parents upwards until you can find a parent which is also a parent of the other.
	 */
	public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		while (p != null) {
			if (isParentAndChild(p, q)){
				return p;
			}
			p = p.parent;
		}
		return root;
	}

	private static boolean isParentAndChild(TreeNode p, TreeNode q) {
		while (q != null) {
			if (p == q) {
				return true;
			}
			q = q.parent;
		}
		return false;
	}

}
