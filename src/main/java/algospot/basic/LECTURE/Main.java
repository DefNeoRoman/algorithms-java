package algospot.basic.LECTURE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

	}

	public static String sort(String text) {
		List<String> list = new ArrayList<>();

		int i = 2;
		while (i <= text.length()) {
			String sub = text.substring(i - 2, i);
			list.add(sub);
			i += 2;
		}

		System.out.println(list);

		Collections.sort(list);
		return null;
	}

}
