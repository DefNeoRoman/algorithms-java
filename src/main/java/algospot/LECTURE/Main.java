/**
 * https://www.algospot.com/judge/problem/read/LECTURE
 */
package algospot.LECTURE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		while (count-- > 0) {
			System.out.println(sort(scanner.next()));
		}
		scanner.close();
	}

	public static String sort(String text) {
		List<String> tokens = new ArrayList<>();

		int i = 2;
		while (i <= text.length()) {
			String sub = text.substring(i - 2, i);
			tokens.add(sub);
			i += 2;
		}

		Collections.sort(tokens);

		StringBuilder builder = new StringBuilder();
		tokens.forEach(builder::append);
		return builder.toString();
	}

}
