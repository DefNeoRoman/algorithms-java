package seo.dale.algorithm.dynamic;

/**
 * 포기
 */
public class SubSetSum {
	
	public boolean isPossilbe(int[] arr, int num) {
		return isPossible(arr, num, arr.length);
	}
	
	private boolean isPossible(int[] arr, int num, int range) {
		if (range == 0) {
			if (num == 0)
				return true;
			else
				return false;
		}
		
		boolean a = isPossible(arr, num, range-1);
		System.out.printf("isPossible(%s, %s) => %s\t", num, range-1, a);
		boolean b = isPossible(arr, num - arr[range-1], range-1);
		System.out.printf("isPossible(%s, %s) => %s\n", num - arr[range-1], range-1, b);
		
		return a || b;
	}

}
