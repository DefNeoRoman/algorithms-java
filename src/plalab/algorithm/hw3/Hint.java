package plalab.algorithm.hw3;


public class Hint {

	public static int maxArray(int[] array) {
		int length = array.length;
		System.out.printf("length = %d\n----------\n", length);
		int max = -1;
		int count = 0;
		for (int start = 0; start < length; start++) {
			for (int end = start + 1; end < length + 1; end++) {
				int sum = 0;
				for (int i = start; i < end; i++) {
					sum += array[i];
					count++;
				}
				System.out.printf("%2d ~%2d >>%2d\n", start, end, sum);
				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.printf("----------\ncount = %d\n", count);
		return max;
	}
	
	/**
	 * 미리 더해놓은 배열을 만들면, 더한 값을 계속 재활용할 수 있기 때문에 loop 하나를 줄일 수 있다.
	 * ex) 3~5 합 = (0~5 합) - (0~2 합)  
	 */
	public static int maxArray2(int[] array) {
		int length = array.length;
		System.out.printf("length = %d\n----------\n", length);
		
		// pre-process
		for (int i = 1; i < length; i++) {
			array[i] += array[i - 1];
		}
		
		int max = Integer.MIN_VALUE;
		int count = 0;
		
		// only if start = 0
		for (int end = 1; end < length + 1; end++) {
			int sum = array[end -1];
			count++;
			System.out.printf(" 0 ~%2d >>%2d\n", end, sum);
			if (sum > max) {
				max = sum;
			}
		}
		
		// from start = 1 to the end
		for (int start = 1; start < length; start++) {
			for (int end = start + 1; end < length + 1; end++) {
				int sum = array[end - 1] - array[start - 1];
				count++;
				System.out.printf("%2d ~%2d >>%2d\n", start, end, sum);
				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.printf("----------\ncount = %d\n", count);
		return max;	
	}
	
	public static int maxArray3(int[] array) {
		int length = array.length;
		System.out.printf("length = %d\n----------\n", length);
		
		// pre-process
		for (int i = 1; i < length; i++) {
			array[i] += array[i - 1];
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max = " + max);
		
		if (max < 0) {
			return max;
		}
		
		int min = 0;
		for (int i = 0; i < length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("min = " + min);
		
		return max - min;	
	}

	
}
