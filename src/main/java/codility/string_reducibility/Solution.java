package codility.string_reducibility;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codility.com/tasks/string_reducibility/
 * https://codility.com/tickets/tryPBR7B9-V46/
 * O(N^2)
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("ABBCC"));
	}

	public String solution(String S) {
		Map<String, String> rules = new HashMap<>();
		rules.put("AB", "AA");
		rules.put("BA", "AA");
		rules.put("CB", "CC");
		rules.put("BC", "CC");
		rules.put("AA", "A");
		rules.put("CC", "C");

		int idx = 0;
		while (idx + 2 <= S.length()) {
			if (rules.containsKey(S.substring(idx, idx + 2))) {
				String after = rules.get(S.substring(idx, idx + 2));
				S = S.substring(0, idx) + after + S.substring(idx + 2);
				idx = 0;
			} else {
				idx++;
			}
		}
		return S;
	}

}
