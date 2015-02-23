package seo.dale.algorithm.tree;

public class BinaryTreeTraverser {
	
	// 이진트리의 배열저장, 0은 empty를 나타냄.
	private char[] tree;
	int length;
	
	public BinaryTreeTraverser(char[] tree) {
		this.tree = tree;
		length = tree.length;
	}
	
	/**
	 * 전위 순희 :  Root -> Left -> Right
	 */
	public void preOrder(int root) {
		System.out.print((tree[root]) + " ");
		
		int leftChild = 2 * root;
		if (exists(leftChild)) {
			preOrder(leftChild);
		}
		
		int rightChild = leftChild + 1;
		if (exists(rightChild)) {
			preOrder(rightChild);
		}
	}	

	/**
	 * 중위 순희 :  Left -> Root -> Right
	 */
	public void inOrder(int root) {
		int leftChild = 2 * root;
		if (exists(leftChild)) {
			inOrder(leftChild);
		}

		System.out.print((tree[root]) + " ");
		
		int rightChild = leftChild + 1;
		if (exists(rightChild)) {
			inOrder(rightChild);
		}
	}
	
	/**
	 * 후위 순위 : Left -> Right -> Root
	 */
	public void postOrder(int root) {
		int leftChild = 2 * root;
		if (exists(leftChild)) {
			postOrder(leftChild);
		}
		
		int rightChild = leftChild + 1;
		if (exists(rightChild)) {
			postOrder(rightChild);
		}
		
		System.out.print((tree[root]) + " ");
	}	
	
	private boolean exists(int node) {
		return node < length && tree[node] != 0;
	}

}
