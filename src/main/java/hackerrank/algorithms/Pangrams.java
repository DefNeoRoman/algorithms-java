package hackerrank.algorithms;

import org.junit.Test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * https://www.hackerrank.com/challenges/pangrams
 */
public class Pangrams {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		if (isPangram(text)) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
	}

	public static boolean isPangram(String text) {
		Set<Character> alphabetSet = new HashSet<>();
		for (char c = 'a'; c < 'z'; c++) {
			alphabetSet.add(c);
		}

		for (char ch : text.toCharArray()) {
			if (Character.isSpaceChar(ch)) {
				continue;
			}
			alphabetSet.remove(Character.toLowerCase(ch));
		}

		if (alphabetSet.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@Test
	public void test() {
		String text1 = "We promptly judged antique ivory buckles for the next prize";
		String text2 = "We promptly judged antique ivory buckles for the prize";
		assertTrue(isPangram(text1));
		assertFalse(isPangram(text2));
	}

}
