package codility.bracket_string_split;

/**
 * https://codility.com/tasks/bracket_string_split/
 * https://codility.com/tickets/tryPJFVZ8-FHG/
 */
public class Solution {

	public int solution(String S) {
		int numOpenings = 0, numClosings = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == ')') {
				numClosings++;
			}
		}
		for (int i = 0; i < S.length(); i++) {
			if (numOpenings == numClosings) {
				return i;
			}
			if (S.charAt(i) == ')') {
				numOpenings++;
			} else {
				numClosings--;
			}
		}
		return S.length();
	}

}
