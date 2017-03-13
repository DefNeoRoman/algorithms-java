A non-empty zero-indexed array A consisting of N non-negative integers is given. For elements A[P] and A[Q] that are distinct, i.e. P ≠ Q, their distance is defined as:

(A[P] − A[Q]) if (A[P] − A[Q]) ≥ 0;
(A[Q] − A[P]) if (A[P] − A[Q]) < 0.
Write a function:

class Solution { public int solution(int[] A); }

that, given a zero-indexed array A consisting of N non-negative integers, returns the minimum distance between two distinct elements of A.

For example, given array A such that:

  A[0] = 8
  A[1] = 24
  A[2] = 3
  A[3] = 20
  A[4] = 1
  A[5] = 17
the function should return 2, because (A[2] − A[4]) = 2 and no other two distinct elements of A have a smaller distance.

Given array A such that:

  A[0] = 7
  A[1] = 21
  A[2] = 3
  A[3] = 42
  A[4] = 3
  A[5] = 7
the function should return 0, because A[0] − A[5] = A[2] − A[4] = 0 and it is the smallest possible distance between two distinct elements of the array.

Assume that:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [0..1,000,000].
Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.