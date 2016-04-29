package CtCI.Ch01.ArraysAndStrings.Q01_Is_Unique;

/**
 * 비트 벡터를 사용하면 필요한 공간을 1/8로 줄일 수 있다.
 * 아래의 코드에서는 문자열이 소문자 a부터 z까지로만 구성된다고 가정하였다.
 * 그렇게 하면 하나의 int 변수만 사용할 수 있다.
 */
public class QuestionB {

	/* Assumes only letters a through z. */
	public static boolean isUniqueChars(String str) {
		if (str.length() > 26) { // Only 26 characters
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

}
