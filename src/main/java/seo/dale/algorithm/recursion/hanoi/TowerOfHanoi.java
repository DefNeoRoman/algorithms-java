package seo.dale.algorithm.recursion.hanoi;

public class TowerOfHanoi {

	public static void solveTowers(int n, char source, char destination, char spare) {
		// base case
		if (n == 1) {
			print(n, source, destination);
			return;
		} 
		
		// 1) Move all the n-1 pads from source to spare.
		solveTowers(n - 1, source, spare, destination);
		// 2) Move the n-th pad form source to destination.
		print(n, source, destination);
		// 3) Move all the n-1 pads from spare to destination.
		solveTowers(n - 1, spare, destination, source);
	}
	
	private static void print(int n, char source, char destination) {
		System.out.printf("Move %d from %c to %c\n", n, source, destination);
	}
	
}
