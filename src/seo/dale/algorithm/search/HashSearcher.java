package seo.dale.algorithm.search;

import java.util.*;

public class HashSearcher {
	
	public static int searchUsingHashArray(int[] arr, int target) {
		int[] hashArray = new int[100];
		for (int a : arr) {
			int hashCode = new Integer(a).hashCode();
			hashArray[hashCode] = a;
		}
		
		System.out.println(Arrays.toString(hashArray));
		
		int hashCode = new Integer(target).hashCode();
		
		if (hashArray[hashCode] == target) {
			return hashArray[hashCode];
		} else {
			return -1;
		}
	}
	
	public static int searchUsingHashSet(int[] arr, int target) {
		Set<Integer> hashSet = new HashSet<Integer>();
		for (int a : arr) {
			hashSet.add(a);
		}
		
		if (hashSet.contains(target)) {
			return target;
		} else {
			return -1;
		}
	}
	
	public static int searchUsingHashMap(int[] arr, int target) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int a : arr) {
			Integer integer = new Integer(a);
			hashMap.put(integer.hashCode(), integer);
		}
		
		int key = new Integer(target).hashCode();
		
		if (hashMap.containsKey(key)) {
			return hashMap.get(key);
		} else {
			return -1;
		}
	}

}
