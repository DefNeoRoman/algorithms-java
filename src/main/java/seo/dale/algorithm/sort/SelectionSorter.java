package seo.dale.algorithm.sort;

/**
 * O(n^2)
 * 선택 정렬은 구현이 매우 간단하고, 배열 안에서 정렬이 이루어지기 때문에, 추가적인 기억공간이 필요 없는 것이 장점이다.
 * 하지만 시간복잡도는 높은 편이고, 데이터가 이미 부분적으로 정렬된 경우에도 불표한 비교 작업을 해야한다.
 */
public class SelectionSorter {

	public static void sort(int[] arr) {
		// loop less than arr.lenth - 1 because the last iteration is unnecessary.
		for (int i = 0; i < arr.length - 1; i ++) {
			int min = i;
			// loop from i + 1
			for (int j = i + 1; j < arr.length; j ++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			SortUtils.swap(arr, i, min);
		}
	}
	
}
