package seo.dale.algorithm.set;

import java.util.Arrays;

/*
Given 2 different lists of integers, write a function that will return their intersection.
I love this question because there are several possible solutions, each with different performance
characteristics. When the candidate arrives at a solution you can ask them how fast it is and see if they can
solve if with additional constraints.
*/
public class Intersection {

	static int[] findIntersection(int[] firstArr, int[] secondArr) {
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
	
}
