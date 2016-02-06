package seo.dale.algorithm.possibilities;

public class Combination {

	/**
	 * nCr = n x (n-1) x ... x (n-r+1) / r x (r-1) x ... x 1
	 */
	public static long calculateInteratively(int n, int r) {
		long result = 1;
		
		for (int i = n; i > n - r; i--) {
			result *= i;
		}
		
		for (int i = r; i > 1; i--) {
			result /= i;
		}
		
		return result;
	}
	
	/**
	 * nC0 = nCn = 1
	 * if r > 0, then nCr = n-1Cr-1 + n-1Cr
	 */
	public static long calculateRecursively(int n, int r) {
		if (n == 0 || r == 0 || n == r) {
			return 1;
		}

		return calculateRecursively(n - 1, r - 1) + calculateRecursively(n - 1, r); 
	}
	
	private static long[][] reuse = new long[100][100];
	
	/**
	 * Use an 2-dimensional array to reuse calculated values. 
	 */                
	public static long calculateRecursivelyWithoutDuplication(int n, int r) {
		if (reuse[n][r] > 0) {
			return reuse[n][r];
		}
		
		if (n == 0 || r == 0 || n == r) {
			return reuse[n][r] = 1;
		}
		
		reuse[n][r] = calculateRecursivelyWithoutDuplication(n - 1, r - 1) + calculateRecursivelyWithoutDuplication(n - 1, r);
		System.out.printf("reuse[%d][%d] = %d\n", n, r, reuse[n][r]);
		return reuse[n][r];  
	}
	
}
