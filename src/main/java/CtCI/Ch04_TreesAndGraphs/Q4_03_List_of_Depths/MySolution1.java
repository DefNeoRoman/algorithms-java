package CtCI.Ch04_TreesAndGraphs.Q4_03_List_of_Depths;

import org.junit.Test;
import seo.dale.algorithm.sort.Introduction.library.AssortedMethods;
import seo.dale.algorithm.sort.Introduction.library.TreeNode;

import java.util.*;

/**
 * BFS 탐색을 이용해 Iterative하게 구현
 * Complexity : O(n) time & O(n) space
 */
public class MySolution1 {

	@Test
	public void testCreateLevelLinkedList() {
		int[] nodes_flattened = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = AssortedMethods.createTreeFromArray(nodes_flattened);
		List<List<TreeNode>> list = createLevelLinkedList(root);
		printResult(list);
	}

	public static List<List<TreeNode>> createLevelLinkedList(TreeNode root) {
		if (root == null) {
			return null;
		}

		List<List<TreeNode>> list = new LinkedList<>();

		List<TreeNode> currents = new LinkedList<>();
		currents.add(root);
		logCurrents(currents);
		list.add(currents);

		while (!currents.isEmpty()) {
			List<TreeNode> parents = currents;
			currents = new LinkedList<>();
			for (TreeNode aParent : parents) {
				if (aParent.left != null) {
					currents.add(aParent.left);
				}
				if (aParent.right != null) {
					currents.add(aParent.right);
				}
			}
			logCurrents(currents);
			list.add(currents);
		}


		return list;
	}

	private static void logCurrents(List<TreeNode> currents) {
		for (TreeNode aCurrent : currents) {
			System.out.print(aCurrent.data + " ");
		}
		System.out.println();
	}

	public static void printResult(List<List<TreeNode>> result){
		int depth = 0;
		for(List<TreeNode> entry : result) {
			Iterator<TreeNode> i = entry.listIterator();
			System.out.print("Link list at depth " + depth + ":");
			while(i.hasNext()){
				System.out.print(" " + ((TreeNode)i.next()).data);
			}
			System.out.println();
			depth++;
		}
	}

	@Test
	public void testCreateTreeFromArray() {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		TreeNode node = createTreeFromArray(arr);
		node.print();
	}

	public static TreeNode createTreeFromArray(int[] array) {
		if (array.length < 0) {
			return null;
		}

		TreeNode root = new TreeNode(array[0]);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		int idx = 1;
		while (idx < array.length) {
			TreeNode node = queue.element();
			if (node.left == null) {
				node.left = new TreeNode(array[idx++]);
				queue.add(node.left);
			} else if (node.right == null) {
				node.right = new TreeNode(array[idx++]);
				queue.add(node.right);
			} else {
				queue.remove();
			}
		}

		return root;
	}

}
