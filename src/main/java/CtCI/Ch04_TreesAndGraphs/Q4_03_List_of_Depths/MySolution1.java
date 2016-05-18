package CtCI.Ch04_TreesAndGraphs.Q4_03_List_of_Depths;

import org.junit.Test;
import seo.dale.algorithm.sort.Introduction.library.AssortedMethods;
import seo.dale.algorithm.sort.Introduction.library.TreeNode;

import java.util.*;

public class MySolution1 {

	@Test
	public void testCreateLevelLinkedList() {
		int[] nodes_flattened = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = AssortedMethods.createTreeFromArray(nodes_flattened);
		List<LinkedList<TreeNode>> list = createLevelLinkedList(root);
		printResult(list);
	}

	public static List<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
		List<LinkedList<TreeNode>> list = new ArrayList<>();
		return list;
	}

	public static void printResult(List<LinkedList<TreeNode>> result){
		int depth = 0;
		for(LinkedList<TreeNode> entry : result) {
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
	public void testCreateTreeFromArray1() {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		TreeNode node = createTreeFromArray1(arr);
		node.print();
	}

	public static TreeNode createTreeFromArray1(int[] array) {
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
