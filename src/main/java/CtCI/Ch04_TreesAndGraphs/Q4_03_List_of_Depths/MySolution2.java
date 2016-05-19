package CtCI.Ch04_TreesAndGraphs.Q4_03_List_of_Depths;

import org.junit.Test;
import seo.dale.algorithm.sort.Introduction.library.AssortedMethods;
import seo.dale.algorithm.sort.Introduction.library.TreeNode;

import java.util.*;

/**
 * DFS 탐색을 이용해 Recursive하게 구현
 * Complexity : O(n) time & O(n) + O(log(n)) space
 */
public class MySolution2 {

	@Test
	public void testCreateLevelLinkedList() {
		int[] nodes_flattened = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = AssortedMethods.createTreeFromArray(nodes_flattened);
		List<List<TreeNode>> list = createLevelLinkedList(root);
		printResult(list);
	}

	public static List<List<TreeNode>> createLevelLinkedList(TreeNode root) {
		List<List<TreeNode>> list = new LinkedList<>();
		createLevelLinkedList(root, list, 0);
		return list;
	}

	public static void createLevelLinkedList(TreeNode node, List<List<TreeNode>> list, int level) {
		if (node == null) {
			return;
		}

		System.out.println(indent(level) + "Deal with [" + node.data + "]");

		if (list.size() == level) {
			list.add(new LinkedList<>());
		}

		List<TreeNode> row = list.get(level);
		row.add(node);

		log(list);

		createLevelLinkedList(node.left, list, level + 1);
		createLevelLinkedList(node.right, list, level + 1);
	}

	private static String indent(int level) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < level; i++) {
			builder.append(". ");
		}
		return builder.toString();
	}

	private static void log(List<List<TreeNode>> lists) {
		for (List<TreeNode> list : lists) {
			for (TreeNode node : list) {
				System.out.print(node.data + " ");
			}
			System.out.println();
		}
		System.out.println("================================================");
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
