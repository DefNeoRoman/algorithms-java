package seo.dale.algorithm.sort;

/**
 * O(n^2)
 * 버블 정렬의 장점은 부분적으로 정렬되어 있는 배열에 대해서느 선택 정렬보다 빠른 성능을 보인다는 것이다.
 * 특히 데이터가 완전히 정렬되어 있는 상태라면 패스를 한 번만 실행하고 끝난다.
 * 추가적인 공간이 필요하지 않다는 것도 장점이다.
 */
public class BubbleSorter {

	public static void sort(int[] arr) {
		// 이전 패스에서 가장 최근에 교환이 일어났던 인덱스까지만,
		// 다음 패스에서 다시 정렬을 진행하면 된다.
		// 만약 이전 패스에서 교환이 없었다면 정렬을 종료하면 된다.
		int last = arr.length - 1;
		while (last > 0) {
			int latest = 0;
			for (int j = 0; j < last; j ++) {
				if (arr[j] > arr[j + 1]) {
					SortUtils.swap(arr, j, j + 1);
					latest = j; 
				}
			}
			last = latest;
		}
	}
	
}
