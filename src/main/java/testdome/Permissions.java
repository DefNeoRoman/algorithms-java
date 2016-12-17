package testdome;

import java.util.HashMap;
import java.util.Map;

public class Permissions {

	public static int permStringToInt(String permString) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('r', 4);
		map.put('w', 2);
		map.put('x', 1);
		map.put('-', 0);

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			int partSum = 0;
			for (int j = 0; j < 3; j++) {
				partSum += map.get(permString.charAt(3 * i + j));
			}
			sum = sum * 10 + partSum;
		}
		return sum;
	}

	public static void main(String[] args) {
		// Should write 752
		System.out.println(Permissions.permStringToInt("rwxr-x-w-"));
	}
}
