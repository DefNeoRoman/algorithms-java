package seo.dale.algorithm.bit;

public class BitMasker {

	/**
	 * n개의 1 만들기 
	 */
	public static int setAllToOne(int n) {
		return (1 << n) - 1;
	}
	
	/**
	 * n번째를 1로 세팅 
	 */
	public static int setNthToOne(int a, int n) {
		return a | (1 << n);
	}
	
	/**
	 * n번째가 1인지 검사
	 * : 1은 0이랑 or 해도 1 
	 */
	public static boolean isNthOne(int a, int n) {
		return !((a & (1 << n)) == 0);
	}
	
	/**
	 * n번째가 0인지 검사
	 * : 0은 1이랑 and 해도 0
	 */
	public static boolean isNthZero(int a, int n) {
		return (a & (1 << n)) == 0;
	}
	
	/**
	 * n번째를 0으로 세팅 
	 */
	public static int setNthToZero(int a, int n) {
		return a & ~(1 << n);
	}
	
	/**
	 * n번째를 토글  
	 */
	public static int toggleNth(int a, int n) {
		return a ^ (1 << n);
	}
	
	/**
	 * 1의 갯수 세기 
	 */
	public static int countOne(int n) {
		if (n == 0) return 0;
		return n % 2 + countOne(n/2);
	}
	
	public static int countMin(int n) {
		return n & -n;
	}
	
}
