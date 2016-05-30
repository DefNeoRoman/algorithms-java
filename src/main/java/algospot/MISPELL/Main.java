/**
 * https://www.algospot.com/judge/problem/read/MISPELL
 */
package algospot.MISPELL;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Main {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int count = scanner.nextInt();
			for (int i = 0; i < count; i++) {
				int index = scanner.nextInt();
				String word = scanner.next();
				
				String removed = removeAt(word, index);
				System.out.println(i + 1 + " "+ removed);
			}
		}
	}

	private static String removeAt(String word, int index) {
		String before = word.substring(0, index - 1);
		String after = word.substring(index);
		return before + after;
	}
	
	@Test
	public void test() {
		assertEquals("MISPELL", removeAt("MISSPELL", 4));
		assertEquals("ROGRAMMING", removeAt("PROGRAMMING", 1));
		assertEquals("CONTES", removeAt("CONTEST", 7));
		assertEquals("BALOON", removeAt("BALLOON", 3));
	}
	
}
