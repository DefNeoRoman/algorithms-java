package seo.dale.algorithm.sort.quick;

import java.util.ArrayList;
import java.util.List;

/**
 * 메모리는 많이 사용하지만 가장 이해하기 쉬운 코드
 */
public class QuickListSorter {

	public static List<Integer> sort(List<Integer> list) {
		System.out.println(list);

		if (list.size() <= 1) {
			return list;
		}

		Integer pivot = list.get(0);
		List<Integer> lower = new ArrayList<>();
		List<Integer> higher = new ArrayList<>();

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) < pivot) {
				lower.add(list.get(i));
			} else {
				higher.add(list.get(i));
			}
		}

		List<Integer> sortedList = sort(lower);
		sortedList.add(pivot);
		sortedList.addAll(sort(higher));

		return sortedList;
	}
	
}
