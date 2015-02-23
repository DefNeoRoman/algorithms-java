package seo.dale.algorithm.search;

public class BinarySearcher {
	
	public static int loopSearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = (high + low) / 2;
			
			if (target == arr[mid]) {
				return mid;
			}
			
			if (target < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return -1;
	}
	
	public static int recursiveSearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		return rangeSearch(arr, target, low, high);
	}
	
	private static int rangeSearch(int[] arr, int target, int low, int high) {
		if (low > high) {
			return -1;
		}
		
		int mid = (high + low) / 2;
		
		if (target == arr[mid]) {
			return mid;
		}
		
		if (target < arr[mid]) {
			return rangeSearch(arr, target, low, mid - 1);
		} else {
			return rangeSearch(arr, target, mid + 1, mid - 1);
		}
	}
	
}
