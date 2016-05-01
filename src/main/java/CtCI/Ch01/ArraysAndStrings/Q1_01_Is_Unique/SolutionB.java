package CtCI.Ch01.ArraysAndStrings.Q1_01_Is_Unique;

/**
 * 비트 마스킹을 이용해서 구현
 * int를 사용하기 위해 문자열이 소문자 a~z로만 구성된다고 가정
 * @author 서대영/Store기술개발팀/SKP
 */
public class SolutionB {

	public static boolean hasUniqueChars(String str) {
		if (str.length() > 26) {
			return false;
		}

		int bitChecker = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int bitMask = 1 << (ch - 'a');
			System.out.println("bitChecker :           " + Integer.toBinaryString(bitChecker));
			System.out.println("bitMask :              " + Integer.toBinaryString(bitMask));
			System.out.println("bitChecker & bitMask : " + Integer.toBinaryString(bitChecker & bitMask));
			System.out.println("----------------------------------------------------------------------");
			if ((bitChecker & bitMask) > 0) {
				return false;
			}
			bitChecker |= bitMask;
		}

		return true;
	}
}
