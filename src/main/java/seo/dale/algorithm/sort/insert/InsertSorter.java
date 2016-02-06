package seo.dale.algorithm.sort.insert;

import seo.dale.algorithm.sort.SortUtils;

/**
 * O(n^2)
 * 삽입 정렬은 부분적으로 정렬된 경우, 패스의 수는 변함이 없지만 매 패스에서 필요한 비교의 수가 감소한다.
 * 따라서 정렬된 상태에 가까울수록 효율적이고, 추가적인 공간도 사용하지 않는 점이 장점이다.
 */
public class InsertSorter {

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i ++) {
			// 삽입할 인덱스 부터 역으로 교체하면, 중복 비교 회수를 줄일 수 있다.
			for (int j = i; j > 0; j --) {
				if (arr[j] < arr[j - 1]) {
					SortUtils.swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}
	
}
