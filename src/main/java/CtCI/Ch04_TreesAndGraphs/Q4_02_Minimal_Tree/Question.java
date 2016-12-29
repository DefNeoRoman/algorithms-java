package CtCI.Ch04_TreesAndGraphs.Q4_02_Minimal_Tree;

import CtCI.CtCILibrary.TreeNode;
import org.junit.Test;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_02_Minimal_Tree/Question.java
 */
public class Question {

	public static TreeNode createMinimalBST(int[] array) {
		return helper(array, 0, array.length - 1);
	}

	public static TreeNode helper(int[] array, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = start + (end - start) / 2;
		TreeNode node = new TreeNode(array[mid]);
		node.left = helper(array, start, mid - 1);
		node.right = helper(array, mid + 1, end);
		return node;
	}

	@Test
	public void test1() {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// We needed this code for other files, so check out the code in the library
		TreeNode root = TreeNode.createMinimalBST(array);
		System.out.println("Root? " + root.data);
		System.out.println("Created BST? " + root.isBST());
		System.out.println("Height: " + root.height());
	}

	@Test
	public void test2() {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// We needed this code for other files, so check out the code in the library
		TreeNode root = createMinimalBST(array);
		System.out.println("Root? " + root.data);
		System.out.println("Created BST? " + root.isBST());
		System.out.println("Height: " + root.height());
	}

}
