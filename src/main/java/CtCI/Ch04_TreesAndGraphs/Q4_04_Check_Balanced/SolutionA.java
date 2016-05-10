package CtCI.Ch04_TreesAndGraphs.Q4_04_Check_Balanced;

import CtCI.CtCILibrary.AssortedMethods;
import CtCI.CtCILibrary.TreeNode;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * 교제의 height 대신에 depth 를 사용하여 구현 (내 알고리즘이 더 효율적인 것 같음)
 * O(n) Time
 * @author 서대영/Store기술개발팀/SKP
 */
public class SolutionA {

	@Test
	public void testIsBalanced() {
		// Create balanced tree
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode balancedTree = TreeNode.createMinimalBST(array);
		balancedTree.print();
		boolean balanced = isBalanced(balancedTree);
		System.out.println("Is balanced? " + balanced);
		assertTrue(balanced);
	}


	@Test
	public void testIsNotBalanced() {
		// Could be balanced, actually, but it's very unlikely...
		TreeNode unbalancedTree = new TreeNode(10);
		for (int i = 0; i < 10; i++) {
			unbalancedTree.insertInOrder(AssortedMethods.randomIntInRange(0, 100));
		}
		unbalancedTree.print();
		boolean balanced = isBalanced(unbalancedTree);
		System.out.println("Is balanced? " + balanced);
		assertFalse(balanced);
	}

	private static int minDepth = Integer.MAX_VALUE;
	private static int maxDepth = Integer.MIN_VALUE;

	public static boolean isBalanced(TreeNode root) {
		updateDepth(root, 0);
		return maxDepth - minDepth <= 1;
	}

	public static void updateDepth(TreeNode node, int current) {
		if (node == null) {
			return;
		}

		System.out.printf("- updateDepth(node.data -> %s, current -> %s);\n", node.data, current);

		if (isLeaf(node)) {
			minDepth = Math.min(current, minDepth);
			maxDepth = Math.max(current, maxDepth);
			System.out.printf("\t- Updated => current : %s, min : %s, max : %s\n", current, minDepth, maxDepth);
		} else {
			updateDepth(node.left, current + 1);
			updateDepth(node.right, current + 1);
		}
	}

	public static boolean isLeaf(TreeNode root) {
		return root.left == null & root.right == null;
	}

}
