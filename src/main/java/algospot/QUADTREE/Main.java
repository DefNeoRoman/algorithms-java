/**
 * https://www.algospot.com/judge/problem/read/QUADTREE
 * TODO 다른 사람들에 비해 소스가 너무 길고 느린 것 같음. 꼭 트리 구조를 쓰지 않고 문자열이나 배열 처리로 풀어내면 빨리 질 것 같음
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
			System.out.println();
		}
		scanner.close();
	}
}

class QuadTree {

	String text;
	int current;

	public QuadTree(String text) {
		this.text = text;
		current = 0;
	}

	public void upsideDown() {
//		Node root = new Node(0, text.charAt(0));
//		buildTreeAt(root);
		Node root = buildTreeForX();
		traverseUpsideDown(root);
	}

	private Node buildTreeForX() {
		Node node = new Node(current, text.charAt(current));
		current = current + 1;
		while (!node.isFull() && current < text.length()) {
			Node child;
			char ch = text.charAt(current);
			if (ch == 'x') {
				child = buildTreeForX();
			}
			// 'w' or 'b'
			else {
				child = new Node(current, ch);
				current += 1;
			}
			node.addChild(child);
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
