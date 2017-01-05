package CtCI.Ch04_TreesAndGraphs.Q4_09_BST_Sequences;

import CtCI.CtCILibrary.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question {

	public static void weaveLists(LinkedList<Integer> first, LinkedList<Integer> second, LinkedList<Integer> prefix, List<LinkedList<Integer>> results) {
		/* One list is empty. Add the remainder to [a cloned] prefix and
		 * store result. */
		if (first.size() == 0 || second.size() == 0) {
			LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
			result.addAll(first);
			result.addAll(second);
			results.add(result);
			return;
		}

		/* Recurse with head of first added to the prefix. Removing the
		 * head will damage first, so we’ll need to put it back where we
		 * found it afterwards. */
		int headFirst = first.removeFirst();
		prefix.addLast(headFirst);
		weaveLists(first, second, prefix, results);
		prefix.removeLast();
		first.addFirst(headFirst);

		/* Do the same thing with second, damaging and then restoring
		 * the list.*/
		int headSecond = second.removeFirst();
		prefix.addLast(headSecond);
		weaveLists(first, second, prefix, results);
		prefix.removeLast();
		second.addFirst(headSecond);
	}

	public static ArrayList<LinkedList<Integer>> allSequences(TreeNode node) {
		ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();

		if (node == null) {
			result.add(new LinkedList<Integer>());
			return result;
		}

		LinkedList<Integer> prefix = new LinkedList<Integer>();
		prefix.add(node.data);

		/* Recurse on left and right subtrees. */
		ArrayList<LinkedList<Integer>> leftSeq = allSequences(node.left);
		ArrayList<LinkedList<Integer>> rightSeq = allSequences(node.right);

		/* Weave together each list from the left and right sides. */
		for (LinkedList<Integer> left : leftSeq) {
			for (LinkedList<Integer> right : rightSeq) {
				ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
				weaveLists(left, right, prefix, weaved);
				result.addAll(weaved);
			}
		}
		return result;
	}

	public static void main(String[] args) {
//		TreeNode node = new TreeNode(100);
//		int[] array = {100, 50, 20, 75, 150, 120, 170};
		TreeNode node = new TreeNode(2);
		int[] array = {1, 3};
		for (int a : array) {
			node.insertInOrder(a);
		}
		ArrayList<LinkedList<Integer>> allSeq = allSequences(node);
		for (LinkedList<Integer> list : allSeq) {
			System.out.println(list);
		}
		System.out.println(allSeq.size());
	}

}
