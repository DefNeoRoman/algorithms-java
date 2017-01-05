package CtCI.Ch04_TreesAndGraphs.Q4_09_BST_Sequences;

import CtCI.CtCILibrary.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_09_BST_Sequences/Question.java
 * 재귀로 푼다는 거까지는 생각해냈으나, weaveList 할 때 또 재귀를 해야되는데서 너무 어려워서 일단 포기
 */
public class QuestionA {

	public static List<List<Integer>> allSequences(TreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}

		List<List<Integer>> sequences = new ArrayList<>();

		if (root.left == null && root.right == null) {
			List<Integer> seq = new LinkedList<>();
			seq.add(root.data);
			sequences.add(seq);
		} else {
			List<List<Integer>> leftSequences = allSequences(root.left);
			List<List<Integer>> rightSequences = allSequences(root.right);

			for (List<Integer> seq : allSequences(root.left)) {
				seq.add(0, root.data);
				sequences.add(seq);
			}

			for (List<Integer> seq : allSequences(root.right)) {
				seq.add(0, root.data);
				sequences.add(seq);
			}
		}

		return sequences;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(2);
		int[] array = {1, 3};
		for (int a : array) {
			node.insertInOrder(a);
		}
		List<List<Integer>> allSeq = allSequences(node);
		for (List<Integer> list : allSeq) {
			System.out.println(list);
		}
		System.out.println(allSeq.size());
	}

}
