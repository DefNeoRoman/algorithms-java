package seo.dale.algorithm.recursion;

/**
 * 연속된 수를 한 비트만 다르게 인코딩 하는 방법 
 */
public class GrayCode {
	
	public static String[] code(int bit) {
		System.out.printf("code(%d);\n", bit);
		
		if (bit == 1) {
			return new String[]{"0", "1"}; 
		}
		
		String[] part = code(bit-1);
		String[] sum = new String[part.length * 2];
		
		for (int i = 0; i < part.length; i++) {
			sum[i] = "0" + part[i];
			sum[part.length + i] = "1" + part[part.length - i -1];
		}

		return sum;
	}
	
}
