package seo.dale.algorithm.math;

public class Factor {

	public static boolean isAfactorOf3(int num) {
		if (num == 0 || num > 3) {
			return false;
		}

		if (3 % num == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isAfactorOf3withoutModulo(int num) {
		if (num == 0 || num > 3) {
			return false;
		}
		
		/* 나머지 = 나눔을 당하는 수 - 나누는 수 x 몫 */
		if (3 - (num * (3 / num)) == 0) {
			return true;
		} else {
			return false;
		}
	}

}
