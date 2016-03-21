package hackerrank.algorithms.string;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/alternating-characters
 */
public class AlternatingCharacters {

	@Test
	public void test() {
		String input = "5\n" +
				"AAAA\n" +
				"BBBBB\n" +
				"ABABABAB\n" +
				"BABABA\n" +
				"AAABBB";

		execute(new ByteArrayInputStream(input.getBytes()));
	}

	public static void main(String[] args) {
		execute(System.in);
	}

	private static void execute(InputStream inputStream) {
		Scanner scanner = new Scanner(inputStream);
		int cnt = scanner.nextInt();
		for (int i = 0; i < cnt; i++) {
			printAlternatingCharacters(scanner.next());
		}
	}

	private static void printAlternatingCharacters(String text) {
		char[] chars = text.toCharArray();

		int deletionCnt = 0;
		for (int i = 1; i < chars.length; i++) {
			if (chars[i - 1] == chars[i]) {
				deletionCnt ++;
			}
		}

		System.out.println(deletionCnt);
	}

}
