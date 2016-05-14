package CtCI.Ch02_LinkedLists.Q2_02_Return_Kth_To_Last;

/**
 * @author 서대영/Store기술개발팀/SKP
 */
public class Node {

	private int data;
	private Node next;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		// return String.valueOf(data);
		StringBuilder builder = new StringBuilder();
		Node node = this;
		while (node != null) {
			builder.append(node.data);
			builder.append("->");
			node = node.getNext();
		}
		if (builder.length() > 2) {
			builder.setLength(builder.length() - 2);
		}
		return builder.toString();
	}

}
