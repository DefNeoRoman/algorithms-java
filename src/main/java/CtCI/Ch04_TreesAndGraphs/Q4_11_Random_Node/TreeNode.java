package CtCI.Ch04_TreesAndGraphs.Q4_11_Random_Node;

import java.util.Random;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_11_Random_Node/TreeNode.java
 */
public class TreeNode {

	private Random random = new Random();

	private int data;
	private TreeNode left;
	private TreeNode right;
	private int size = 0;

	public TreeNode(int data) {
		this.data = data;
		size = 1;
	}

	public int getData() {
		return data;
	}

	public void insertInOrder(int data) {
		if (data <= this.data) {
			if (left == null) {
				left = new TreeNode(data);
			} else {
				left.insertInOrder(data);
			}
		} else {
			if (right == null) {
				right = new TreeNode(data);
			} else {
				right.insertInOrder(data);
			}
		}
		size++;
	}

	public int size() {
		return size;
	}

	public TreeNode getRandomNode() {
		int index = random.nextInt(size);
		return getIthNode(index);
	}

	public TreeNode getIthNode(int index) {
		int leftSize = left == null ? 0 : left.size;
		if (index < leftSize) {
			return left.getIthNode(index);
		} else if (index == leftSize) {
			return this;
		} else {
			return right.getIthNode(index - leftSize - 1);
		}
	}

}