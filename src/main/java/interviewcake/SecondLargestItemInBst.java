package interviewcake;

import org.junit.Test;

/**
 * https://www.interviewcake.com/question/java/second-largest-item-in-bst?utm_source=weekly_email
 * @author 서대영/Store기술개발팀/SKP
 */
public class SecondLargestItemInBst {

	@Test
	public void test() {
		BinaryTreeNode root8 = new BinaryTreeNode(8);
		BinaryTreeNode node3 = root8.insertLeft(3);
		node3.insertLeft(1);
		BinaryTreeNode node6 = node3.insertRight(6);
		node6.insertLeft(4);
		node6.insertRight(7);
		BinaryTreeNode node10 = root8.insertRight(10);
		BinaryTreeNode node14 = node10.insertRight(14);
		node14.insertLeft(13);

		print(root8);
	}

	public void print(BinaryTreeNode node) {
		if (node == null) {
			return;
		}
		print(node.right);
		System.out.println(node.value);
		print(node.left);
	}

}

class BinaryTreeNode {

	public int value;
	public BinaryTreeNode left;
	public BinaryTreeNode right;

	public BinaryTreeNode(int value) {
		this.value = value;
	}

	public BinaryTreeNode(int value, int left, int right) {
		this(value);
		insertLeft(left);
		insertRight(right);
	}

	public BinaryTreeNode insertLeft(int leftValue) {
		this.left = new BinaryTreeNode(leftValue);
		return this.left;
	}

	public BinaryTreeNode insertRight(int rightValue) {
		this.right = new BinaryTreeNode(rightValue);
		return this.right;
	}
}
