package interviewcake;

/**
 * https://www.interviewcake.com/question/merge-sorted-arrays?utm_source=weekly_email
 *
Each order is represented by an "order id" (an integer).
We have our lists of orders sorted numerically already, in arrays. Write a function to merge our arrays of orders into one sorted array.
 */
public class MergeSortedArrays {

	/**
	 * O(m + n) time and O(m + n) space with less conditions.
	 */
	public int[] mergeArrays2(int[] firstArr, int[] secondArr) {
		int[] mergedArr = new int[firstArr.length + secondArr.length];
		
		int i = 0, j = 0, k = 0;
		while (k < mergedArr.length) {
			if (j >= secondArr.length || (i < firstArr.length && firstArr[i] < secondArr[j])) {
				mergedArr[k++] = firstArr[i++];
			} else {
				mergedArr[k++] = secondArr[j++];
			}
		}
		
		return mergedArr;
	}
	
	/**
	 * O(m + n) time and O(m + n) space
	 */
	public int[] mergeArrays(int[] firstArr, int[] secondArr) {
		int[] mergedArr = new int[firstArr.length + secondArr.length];
		
		int i = 0, j = 0, k = 0;
		while (k < mergedArr.length) {
			if (j >= secondArr.length) {
				mergedArr[k++] = firstArr[i++];
			} else if (i >= firstArr.length) {
				mergedArr[k++] = secondArr[j++];
			} else if (firstArr[i] < secondArr[j]) {
				mergedArr[k++] = firstArr[i++];
			} else {
				mergedArr[k++] = secondArr[j++];
			}
		}
		
		return mergedArr;
	}
	
}
