package CtCI.Ch04_TreesAndGraphs.Q4_05_Validate_BST;

import CtCI.CtCILibrary.AssortedMethods;
import CtCI.CtCILibrary.TreeNode;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_05_Validate_BST/QuestionB.java
 * BST must satisfy the condition, node.left.data <= node.data <= node.right.data
 */
public class QuestionB {

	public static boolean checkBST(TreeNode node) {
		return checkBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean checkBST(TreeNode node, int min, int max) {
		if (node == null) {
			return true;
		}

		if (!(min <= node.data && node.data <= max)) {
			return false;
		}

		return checkBST(node.left, min, node.data) && checkBST(node.right, node.data, max);
	}

	/* Create a tree that may or may not be a BST */
	public static TreeNode createTestTree() {
		/* Create a random BST */
		TreeNode head = AssortedMethods.randomBST(10, -10, 10);

		/* Insert an element into the BST and potentially ruin the BST property */
		TreeNode node = head;
		do {
			int n = AssortedMethods.randomIntInRange(-10, 10);
			int rand = AssortedMethods.randomIntInRange(0, 5);
			if (rand == 0) {
				node.data = n;
			} else if (rand == 1) {
				node = node.left;
			} else if (rand == 2) {
				node = node.right;
			} else if (rand == 3 || rand == 4) {
				break;
			}
		} while (node != null);

		return head;
	}

	public static void main(String[] args) {
		/* Simple test -- create one */
		int[] array = {-100, 3, 5, 6, 10, 13, 15, 100};
		TreeNode node = TreeNode.createMinimalBST(array);
		//node.left.data = 6; // "ruin" the BST property by changing one of the elements
		node.print();
		boolean isBst = checkBST(node);
		System.out.println(isBst);

		/* More elaborate test -- creates 100 trees (some BST, some not) and compares the outputs of various methods. */
		for (int i = 0; i < 3; i++) {
			TreeNode head = createTestTree();

			// Compare results
			boolean isBst1 = checkBST(head);
			// boolean isBst2 = checkBSTAlternate(head);

			System.out.println(isBst1);
			head.print();
		}
	}

}
