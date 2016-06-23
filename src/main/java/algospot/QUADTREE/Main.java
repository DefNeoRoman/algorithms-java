/**
 * https://www.algospot.com/judge/problem/read/QUADTREE
 */
package algospot.QUADTREE;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		while (cnt-- > 0) {
			QuadTree quadTree = new QuadTree(scanner.next());
			quadTree.upsideDown();
		}
		scanner.close();
	}
}

class QuadTree {

	String text;

	public QuadTree(String text) {
		this.text = text;
	}

	public void upsideDown() {
		Node root = buildTreeAt(0);
		traverseUpsideDown(root);
	}

	public Node buildTreeAt(int index) {
		Node node = new Node(index, text.charAt(index));

		index++;

		while (index < text.length()) {
			Node nodeToAdd;
			char ch = text.charAt(index);
			if (ch == 'x') {
				nodeToAdd = buildTreeAt(index);
			}
			// 'w' or 'b'
			else {
				nodeToAdd = new Node(index, ch);
			}
			node.addChild(nodeToAdd);
			index = nodeToAdd.index + 1;
		}

		return node;
	}

	public void traverseUpsideDown(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data);

		Node[] children = node.children;

		// Down first
		traverseUpsideDown(children[2]);
		traverseUpsideDown(children[3]);
		// Up later
		traverseUpsideDown(children[0]);
		traverseUpsideDown(children[1]);

		for (Node child : node.children) {
			traverseUpsideDown(child);
		}
	}

}

class Node {

	int index;
	char data;

	int count;
	Node[] children;

	public Node(int index, char data) {
		this.index = index;
		this.data = data;
		this.children = new Node[4];
	}

	public void addChild(Node node) {
		if (isFull()) {
			throw new IllegalStateException("Node is full");
		}
		children[count++] = node;
	}

	public boolean isFull() {
		return count > 3;
	}

	@Override
	public String toString() {
		return String.valueOf(data);
	}
}
