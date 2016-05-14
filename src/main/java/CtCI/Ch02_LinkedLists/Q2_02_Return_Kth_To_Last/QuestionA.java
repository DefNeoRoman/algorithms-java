package CtCI.Ch02_LinkedLists.Q2_02_Return_Kth_To_Last;

import seo.dale.algorithm.sort.Introduction.library.AssortedMethods;
import seo.dale.algorithm.sort.Introduction.library.LinkedListNode;

public class QuestionA {

	private static int level = 0;

	private static String indent() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < level; i++) {
			builder.append(". ");
		}
		return builder.toString();
	}

	private static void log(String msg) {
		System.out.print(indent() + msg);
	}

	public static int printKthToLast(LinkedListNode head, int k) {
		String data = head != null ? String.valueOf(head.data) : "null";
		log("printKthToLast({" + data + "}, " + k + ")\n");

		if (head == null) {
			log("=> return 0\n");
			return 0;
		}

		level++;
		int index = printKthToLast(head.next, k) + 1;
		level--;

		log("# index, kth : " + index + ", " + k + "\n");

		if (index == k) {
			System.out.println("===============================================================");
			System.out.println(indent() + "#####" + k + "th to last node is " + head.data);
			System.out.println("===============================================================");
		}
		log("=> return " + index + "\n");
		return index;
	}
	
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 50, 6};
		LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);

		printKthToLast(head, 2);
	}

}
