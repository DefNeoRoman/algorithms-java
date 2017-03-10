package codility.arr_list_len;

/**
 * https://codility.com/tasks/arr_list_len/
 * https://codility.com/tickets/tryAY6CYE-VHZ/
 */
public class Solution {

	public int solution(int[] A) {
		int length = 1;
		int i = A[0];
		while (i > -1) {
			i = A[i];
			length++;
		}
		return length;
	}

}
