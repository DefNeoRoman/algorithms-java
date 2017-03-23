A zero-indexed array A consisting of N integers is given. A slice of that array is a pair of integers (P, Q) such that 0 ≤ P ≤ Q < N. A slice (P, Q) of array A is called non-negative if all the elements A[P], A[P+1], ..., A[Q−1], A[Q] are non-negative. The sum of a slice (P, Q) of array A is the value A[P] + A[P+1] + ... + A[Q−1] + A[Q].

For example, the following array A:

  A[0] =  1
  A[1] =  2
  A[2] = -3
  A[3] =  4
  A[4] =  5
  A[5] = -6
has non-negative slices (0, 0), (1, 1), (0, 1), (3, 3), (4, 4) and (3, 4).
The sum of slice (0, 1) is A[0] + A[1] = 1 + 2 = 3.
The sum of slice (3, 4) is A[3] + A[4] = 4 + 5 = 9.
The sum of slice (4, 4) is A[4] = 5.

Write a function:

class Solution { public int solution(int[] A); }

that, given a zero-indexed array A consisting of N integers, returns the maximum sum of any non-negative slice in this array.
The function should return −1 if there are no non-negative slices in the array.

For example, given the following array A:

  A[0] =  1
  A[1] =  2
  A[2] = -3
  A[3] =  4
  A[4] =  5
  A[5] = -6
the function should return 4 + 5 = 9, as explained above. 
Given array A:

  A[0] = -8
  A[1] =  3
  A[2] =  0
  A[3] =  5
  A[4] = -3
  A[5] = 12
the function should return 12. 
Given array A:

  A[0] = -1
  A[1] =  2
  A[2] =  1
  A[3] =  2
  A[4] =  0
  A[5] =  2
  A[6] =  1
  A[7] = -3
  A[8] =  4
  A[9] =  3
  A[10] = 0
  A[11] =-1
the function should return 2 + 1 + 2 + 0 + 2 + 1 = 8.

Assume that:

N is an integer within the range [0..1,000,000];
each element of array A is an integer within the range [−1,000..1,000].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

