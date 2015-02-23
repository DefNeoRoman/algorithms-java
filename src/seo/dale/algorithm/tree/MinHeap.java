package seo.dale.algorithm.tree;

/**
 * complete binary tree를 먼저 구현해보고 이걸 구현하기
 * 
 */
public class MinHeap {
	
	private static Node root;
	private static Node last;
	
	public static void insert(int data) {
		if (root == null) {
			root = new Node(data);
			return;
		}
		insert(data, root);
	}
	
	private static void insert(int data, Node node) {
		// if (data node.getData())
	}
	
	public static void extractMin(int data) {
		
	}

}

class Node {
	
	int data;
	
	Node left;
	Node right;

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
	
}
