package codility.string_reducibility;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://codility.com/tasks/string_reducibility/
 * https://codility.com/tickets/tryRRSHKH-ZNB/
 * O(N^2)
 */
public class Solution2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
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

		Pattern pattern = Pattern.compile("AB|BA|CD|BC|AA|CC");
		Matcher matcher = pattern.matcher(S);

		while (matcher.find()) {
			S = S.replace(matcher.group(), rules.get(matcher.group()));
			matcher = pattern.matcher(S);
		}
		return S;
	}

}
