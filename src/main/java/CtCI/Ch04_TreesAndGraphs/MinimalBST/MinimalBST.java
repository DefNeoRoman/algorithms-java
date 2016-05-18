package CtCI.Ch04_TreesAndGraphs.MinimalBST;

import org.junit.Test;

/**
 * @author 서대영/Store기술개발팀/SKP
 */
public class MinimalBST {

	@Test
	public void test() {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		Node root = createMinimalBST(arr);
		printInOrder(root);
	}

	public static Node createMinimalBST(int arr[]) {
		return createMinimalBST(arr, 0, arr.length - 1);
	}

	private static Node createMinimalBST(int arr[], int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		Node node = new Node(arr[mid]);
		node.setLeft(createMinimalBST(arr, start, mid - 1));
		node.setRight(createMinimalBST(arr, mid + 1, end));
		return node;
	}

	public static void printInOrder(Node node) {
		if (node == null) {
			return;
		}
		printInOrder(node.getLeft());
		System.out.print(node.getData() + " ");
		printInOrder(node.getRight());
	}

}

class Node {

	private int data;
	private Node left;
	private Node right;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[" + left + "]");
		builder.append(" (" + data + ") ");
		builder.append("[" + right + "]");
		return builder.toString();
	}

}
