package plalab.algorithm.lab5;

public class BST {

	public Node root;
	
	public void insert(int n) {	
		if (root == null) {
			root = new Node(n);
			return;
		}
		
		insertNode(n, root);
	}
	
	private void insertNode(int n, Node node) {
		if (n < node.data) {
			if (node.left == null) {
				node.left = new Node(n);
			} else {
				insertNode(n, node.left);
			}
			
		} else {
			if (node.right == null) {
				node.right = new Node(n);
			} else {
				insertNode(n, node.right);
			}
		}
	}
	
	
	public Node search(int n) {
		return searchNode(n, root);
	}
	
	public Node searchNode(int n, Node node) {
		if (node == null) {
			return null;
		}
		
		if (n ==  node.data) {
			return node;
		}
		
		if (n < node.data) {
			return searchNode(n, node.left);
		} else {
			return searchNode(n, node.right);
		}
	}
	
	public void inorderPrint() {
		printNode(root);
	}
	
	private void printNode(Node node) {
		if (node == null) {
			return;
		}
		
		printNode(node.left);
		System.out.print("[" + node.data + "]");
		printNode(node.right);
	}
	
}

class Node {
	
	public Node(int data) {
		this.data = data;
	}
	
	public Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public int data;
	public Node left, right;
	
}
