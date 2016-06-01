/**
 * https://www.algospot.com/judge/problem/read/ENCRYPT
 */
package algospot.basic.ENCRYPT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int count = scanner.nextInt();
			for (int i = 0; i < count; i++) {
				encrypt(scanner.next());
			}
		}
	}

	private static void encrypt(String word) {
		Queue<Character> queue = new LinkedList<>();	
		for (int i = 0; i < word.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(word.charAt(i));
			} else {
				queue.add(word.charAt(i));
			}
		}
		while (!queue.isEmpty()) {
			System.out.print(queue.remove());
		}
		System.out.println();
	}
	
}