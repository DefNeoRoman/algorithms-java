package seo.dale.algorithm.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given 2 different lists of integers, write a function that will return their intersection.
I love this question because there are several possible solutions, each with different performance
characteristics. When the candidate arrives at a solution you can ask them how fast it is and see if they can
solve if with additional constraints.
*/
public class Intersection {

	/*
	Solution 1
	A doubly nested for loop.
	Runtime O(n2)
	It’s ok if this is the first solution the candidate comes up with, it’s pretty easy, but not optimal. This is a good
	opportunity to ask them if they can make it faster.
	 */
	
	
	/*
	Solution 2
	Sort both lists, then traverse them with 2 pointers (one per list). Increment the pointer that points at the
	smaller value. If both pointers point at the same value, insert it into the result and increment both pointers.
	Runtime O(nlogn)
	This solution has the advantage of using less space than the final solution, while still being pretty fast
	 */
	static int[] findIntersection2(int[] firstArr, int[] secondArr) {
	    Arrays.sort(firstArr);
	    Arrays.sort(secondArr);
	    
	    int size = 0;
	    int maxSize = firstArr.length < secondArr.length ? firstArr.length : secondArr.length;
	    int[] intersectionArr = new int[maxSize];
	    
	    for (int i = 0, j = 0; i < firstArr.length && j < secondArr.length;) {
	        if (firstArr[i] == secondArr[j]) {
	            intersectionArr[size++] = firstArr[i];
	            i++;
	            j++;
	        } else if (firstArr[i] < secondArr[j]) {
	            i++;
	        } else if (firstArr[i] > secondArr[j]) {
	            j++;
	        } 
	    }
	    
	    return Arrays.copyOfRange(intersectionArr, 0, size);
	}
	
	/*
	Solution 3
	Iterate the first list, put the values into a hashtable, using the value as the key, and the count as the value (if
	it’s already in the list increment count by one, else insert a count of 1). Then iterate list2, if the value is in the
	hashtable and > 0 insert that value into the result array, decrementing the value in the hash table.
	Runtime O(n)
	This is the optimal solution. A common mistake will be forgetting to keep a counter and neglecting any
	duplicates in the result list ([1,2,2,3] and [2,2,3,4] should intersect as [2,2,3] and not just [2,3]).
	 */
	static Integer[] findIntersection3(int[] firstArr, int[] secondArr) {
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i : firstArr) {
			if (map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		
		for (int j : secondArr) {
			if (map.get(j) != null && map.get(j) > 0) {
				map.put(j, map.get(j) - 1);
				list.add(j);
			}
		}
		
	    return list.toArray(new Integer[list.size()]);
	}
	
}
