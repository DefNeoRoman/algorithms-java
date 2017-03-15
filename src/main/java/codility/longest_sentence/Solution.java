package codility.longest_sentence;

/**
 * https://codility.com/tasks/longest_sentence/
 * https://codility.com/tickets/tryNQHKY9-Q8V/
 */
public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("We test coders. Give us a try?")); // 4
		System.out.println(sol.solution("Forget  CVs..Save time . x x")); // 2
		System.out.println(sol.solution(" ?  !   ")); // 0
	}

	public int solution(String S) {
		String[] sentences = S.split("[\\.?!]+");
		int maxNumWords = 0;
		for (String sentence : sentences) {
			String[] words = sentence.trim().split("\\s+");
			if (!words[0].equals("")) {
				maxNumWords = Math.max(words.length, maxNumWords);
			}
		}
		return maxNumWords;
	}

}
