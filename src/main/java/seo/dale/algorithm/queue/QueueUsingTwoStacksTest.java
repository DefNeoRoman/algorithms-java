package seo.dale.algorithm.queue;

import java.util.Scanner;

import org.junit.Test;

public class QueueUsingTwoStacksTest {

	private QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

	@Test
	public void test() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.print("Input number: ");
			
			int input = in.nextInt();
			
			if (input < 0) {
				System.out.println(">> The program is over.");
				System.exit(0);
			}
			
			if (input == 0) {
				int num = queue.dequeue();
				System.out.println("> " + num + " is dequeued.");
			} else {
				queue.enqueue(input);
				System.out.println("> " + input + " is enqueued.");
			}
		}
		
	}
}
