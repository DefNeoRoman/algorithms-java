package CtCI.Ch04_TreesAndGraphs.Q4_12_Paths_with_Sum;

import CtCI.CtCILibrary.TreeNode;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_12_Paths_with_Sum/QuestionA.java
 */
public class QuestionA {

	public static int countPathsWithSum(TreeNode root, int targetSum) {
		if (root == null) {
			return 0;
		}

		int pathsFromRoot = helpCount(root, targetSum);
		int pathsOnLeft = countPathsWithSum(root.left, targetSum);
		int pathsOnRight = countPathsWithSum(root.right, targetSum);
		return pathsFromRoot + pathsOnLeft + pathsOnRight;
	}

	public static int helpCount(TreeNode root, int targetSum) {
		if (root == null) {
			return 0;
		}

		int remainder = targetSum - root.data;
		int paths = remainder == 0 ? 1 : 0;
		return paths + helpCount(root.left, remainder) + helpCount(root.right, remainder);
	}

	public static void main(String [] args) {
		TreeNode root = new TreeNode(10);

		root.left = new TreeNode(5);
		root.right = new TreeNode(-3);

		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(2);
		root.right.right = new TreeNode(11);

		root.left.left.left = new TreeNode(3);
		root.left.left.right = new TreeNode(-2);
		root.left.right.right = new TreeNode(1);

		System.out.println(countPathsWithSum(root, 8)); // 3
	}

}

