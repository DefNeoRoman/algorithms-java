package codility.bugfixing_binary_period;

import org.junit.Test;

import java.util.Arrays;

/**
 * https://codility.com/tasks/bugfixing_binary_period/
 * https://codility.com/c/run/tryRVKMTQ-HUF
 * https://codility.com/tickets/tryRVKMTQ-HUF/
 *
 */
public class Solution {

	@Test
	public void test() {
		System.out.println(new Solution().solution(955));
	}

	int solution(int n) {
		int[] d = new int[10];
		int l = 0;
		int p;
		while (n > 0) {
			d[l] = n % 2;
			n /= 2;
			l++;
		}
		System.out.println(Arrays.toString(d));
		for (p = 1; p < 1 + (l / 2); ++p) {
			int i;
			boolean ok = true;
			for (i = 0; i < l - p; ++i) {
				if (d[i] != d[i + p]) {
					ok = false;
					break;
				}
			}
			if (ok) {
				return p;
			}
		}
		return -1;
	}

}
