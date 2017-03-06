# OptimizingFarthestEqual

Optimize the code of a function that finds the largest distance between elements of the same values.
 
## Task description

You are given an implementation of a function:

```java
class Solution { public int solution(int[] A); }
```

which accepts as input a non-empty zero-indexed array A consisting of N integers.
The function works slowly on large input data and the goal is to optimize it so as to achieve better time and/or space complexity. The optimized function should return the same result as the given implementation for every input that satisfies the assumptions.

For example, given array A such that:

- A[0] = 4 
- A[1] = 6 
- A[2] = 2 
- A[3] = 2 
- A[4] = 6 
- A[5] = 6 
- A[6] = 1

the function returns 4.

Also, for given array A such that:

- A[0] = 2 
- A[1] = 2
- ...
- A[49999] = 2 
- A[50000] = 2

in other words, A[K] = 2 for each K (0 ≤ K ≤ 50,000), the given implementation works too slow, but the function would return 50,000.

Assume that:

- N is an integer within the range [1..100,000]; 
- each element of array A is an integer within the range [1..N].

Complexity:

- expected worst-case time complexity is O(N); 
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified. The original code is:

```java
import java.util.*;
class Solution {
    public int solution(int[] A) {
		int N = A.length;
		int result = 0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (A[i] == A[j])
					result = Math.max(result, Math.abs(i - j));
		return result;
	} 
}
```