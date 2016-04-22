package interviewcake;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://www.interviewcake.com/question/java/reverse-words?utm_source=weekly_email
 */
public class ReverseWords2 {

	@Test
	public void test() {
		String message = "find you will pain only go you recordings security the into if";
		String reversedLetters = reverseLetters(message);
		assertEquals("fi otni eht ytiruces sgnidrocer uoy og ylno niap lliw uoy dnif", reversedLetters);
		reverseWords(message);
		String reversedWords = reverseWords(message);
		assertEquals("if into the security recordings you go only pain will you find", reversedWords);
		String reversedWords2 = reverseWords2(message);
		assertEquals("if into the security recordings you go only pain will you find", reversedWords2);
	}

	// character-level reversal.
	public String reverseWords2(String message) {
		char[] letters = message.toCharArray();
		// reverse the entire message first
		reverseRange(letters, 0, letters.length);

		// reverse again each word
		int front = 0;
		for (int back = 0; back <= letters.length; back++) {
			if (back == letters.length || letters[back] == ' ') {
				reverseRange(letters, front, back);
				front = back + 1;
			}
		}

		return String.valueOf(letters);
	}

	private void reverseRange(char[] letters, int front, int back) {
		back--;
		while (front < back) {
			swap(letters, front++, back--);
		}
	}

	// string-level reversal.
	public String reverseWords(String message) {
		String[] words = message.split(" ");
		int length = words.length;
		for (int i = 0; i < length / 2; i++) {
			swap(words, i, length - 1 - i);
		}
		return String.join(" ", words);
	}

	private void swap(String[] words, int a, int b) {
		String tmp = words[a];
		words[a] = words[b];
		words[b] = tmp;
	}

	public String reverseLetters(String message) {
		char[] letters = message.toCharArray();
		int length = letters.length;
		for (int i = 0; i < length / 2; i++) {
			swap(letters, i, length - 1 - i);
		}
		return String.valueOf(letters);
	}

	private void swap(char[] chars, int a, int b) {
		char tmp = chars[a];
		chars[a] = chars[b];
		chars[b] = tmp;
	}

}
