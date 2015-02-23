package seo.dale.algorithm.queue;

import java.util.Scanner;

import org.junit.Test;

public class SinglyLinkedListTest {
	
	private SinglyLinkedList queue = new SinglyLinkedList();

	@Test
	public void test() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.print("Input number: ");
			
			int input = in.nextInt();
			
			if (input < 0) {
				queue.print();
				System.out.println(">> The program is over.");
				System.exit(0);
			}
			
			if (input == 0) {
				int num = queue.delete();
				System.out.println("> " + num + " is deleted.");
			} else {
				queue.insert(input);
				System.out.println("> " + input + " is inserted.");
			}
		}
		
	}

}
