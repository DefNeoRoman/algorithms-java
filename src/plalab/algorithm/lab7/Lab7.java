package plalab.algorithm.lab7;

/**
  Find the Missing Number (왜 작동하는 지 이해 못하겠음 T_T)
  1) XOR all the array elements, let the result of XOR be X1.
  2) XOR all numbers from 1 to n + 1, let XOR be X2.
  3) XOR of X1 and X2 gives the missing number.
 */
public class Lab7 {

	public static int getMssingNo(int arr[]) {
		int length = arr.length;
		
		int xor1 = arr[0];
		for (int i = 1; i < length; i++) {
			xor1 ^= arr[i];
		}
		
		int xor2 = 1;
		for (int i = 2; i <= length + 1; i++) {
			xor2 ^= i;
		}
		
		System.out.println("xor1 : " + Integer.toBinaryString(xor1));
		System.out.println("xor2 : " + Integer.toBinaryString(xor2));
		
		return xor1 ^ xor2;
	}
	
}
