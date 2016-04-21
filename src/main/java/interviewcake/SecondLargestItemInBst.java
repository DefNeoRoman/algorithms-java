package interviewcake;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

		BinaryTreeNode largest = findLargest(root8);
		assertEquals(14, largest.value);

		BinaryTreeNode secondLargest = findSecondLargest(root8);
		assertEquals(13, secondLargest.value);

		BinaryTreeNode secondLargest2 = findSecondLargest2(root8);
		assertEquals(13, secondLargest2.value);
	}

	@Test
	public void test2() {
		BinaryTreeNode root5 = new BinaryTreeNode(5);

		BinaryTreeNode node3 = root5.insertLeft(3);
		BinaryTreeNode node8 = root5.insertRight(8);

		node3.insertLeft(1);
		node3.insertRight(4);

		node8.insertLeft(7);
		BinaryTreeNode node12 = node8.insertRight(12);

		BinaryTreeNode node10 = node12.insertLeft(10);
		node10.insertLeft(9);
		node10.insertRight(11);

		print(root5);

		BinaryTreeNode largest = findLargest(root5);
		assertEquals(12, largest.value);

		BinaryTreeNode secondLargest = findSecondLargest(root5);
		assertEquals(11, secondLargest.value);

		BinaryTreeNode secondLargest2 = findSecondLargest2(root5);
		assertEquals(11, secondLargest2.value);
	}

	/**
	 * parent 를 유지하는 방법
	 */
	public BinaryTreeNode findSecondLargest(BinaryTreeNode node) {
		if (node == null || node.left == null || node.right == null) {
			throw new IllegalArgumentException("Tree must have at least 2 nodes");
		}

		BinaryTreeNode parent = null;
		while (node.right != null) {
			parent = node;
			node = node.right;
		}

		if (node.left != null) {
			return findLargest(node.left);
		} else {
			return parent;
		}
	}

	/**
	 * 자식의 자식까지 체크하는 방법
	 */
	public BinaryTreeNode findSecondLargest2(BinaryTreeNode node) {
		if (node == null) {
			throw new IllegalArgumentException("Tree must have at least 1 node");
		}

		while (true) {
			if (node.right == null) {
				if (node.left == null) {
					throw new IllegalArgumentException("Tree must have at least 2 nodes");
				} else {
					return findLargest(node.left);
				}
			} else {
				if (node.right.left == null && node.right.right == null) {
					return node;
				} else {
					node = node.right;
				}
			}
		}
	}

	// The rightmost node has the largest value.
	public BinaryTreeNode findLargest(BinaryTreeNode node) {
		if (node == null) {
			throw new IllegalArgumentException("Tree must have at least 1 node");
		}

		while (node.right != null) {
			node = node.right;
		}

		return node;
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
