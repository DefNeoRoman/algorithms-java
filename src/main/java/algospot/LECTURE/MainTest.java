package algospot.LECTURE;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MainTest {

	@Test
	public void test() {
		String input = "4\n" +
				"abbaaccb\n" +
				"dddcccbbbaaa\n" +
				"geegeegeegeebabybabybaby\n" +
				"oh";
		Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
		int numOfTests = scanner.nextInt();
		for (int i = 0; i < numOfTests; i++) {
			String text = scanner.next();
			String sorted = Main.sort(text);
			System.out.println(text + " -> " + sorted);
		}
	}

}