package CtCI.Ch04_TreesAndGraphs.Q4_12_Paths_with_Sum;

import CtCI.CtCILibrary.TreeNode;

import java.util.HashMap;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_12_Paths_with_Sum/QuestionB.java
 */
public class QuestionB {

	public static HashMap<Integer, Integer> pathCounts;

	public static int countPathsWithSum(TreeNode root, int targetSum) {
		pathCounts = new HashMap<>();
		pathCounts.put(0, 1); // There always is one path with 0
		return countPathsWithSum(root, targetSum, 0);
	}

	public static int countPathsWithSum(TreeNode root, int targetSum, int runningSum) {
		if (root == null) {
			return 0;
		}

		runningSum += root.data;

		int pathsFromRoot = pathCounts.getOrDefault(runningSum - targetSum, 0);

		pathCounts.put(runningSum, pathCounts.getOrDefault(runningSum, 0) + 1);
		int pathsOnLeft = countPathsWithSum(root.left, targetSum, runningSum);
		int pathsOnRight = countPathsWithSum(root.right, targetSum, runningSum);
		pathCounts.put(runningSum, pathCounts.getOrDefault(runningSum, 0) - 1);

		return pathsFromRoot + pathsOnLeft + pathsOnRight;
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
