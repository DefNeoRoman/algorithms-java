An interval is a pair (A, B) of integers such that A ≤ B. Two intervals (A, B) and (C, D) overlap if there exists an integer L such that A ≤ L ≤ B and C ≤ L ≤ D. Intervals that do not overlap are called disjoint. The union of intervals (A, B) and (C, D) is defined as:

either a single interval (min(A, C), max(B, D)), when (A, B) and (C, D) overlap, or
the intervals (A, B) and (C, D) themselves, when they are disjoint.
Taking the union of two intervals is a commutative and associative operation, so it can be extended to an arbitrary number of intervals.

For example, consider the following eight intervals:  ( 1,  5)    (12, 15)     (42, 44)
  (70, 72)    (36, 36)     (-4,  2)
  (43, 69)    (15, 24)
Intervals (1, 5) and (−4, 2) overlap and their union is (−4, 5). Intervals (12, 15) and (15, 24) overlap and their union is (12, 24). Intervals (42, 44) and (43, 69) overlap and their union is (42, 69). Intervals (70, 72) and (36, 36) are disjoint and do not overlap with other intervals. The union of all eight intervals consists of the following five pairwise disjoint intervals:

  (-4,  5)    (12, 24)    (42, 69)
  (70, 72)    (36, 36)
Write a function:

class Solution { public int solution(int[] A, int[] B); }

that, given two zero-indexed arrays A and B consisting of N elements each, returns the number of pairwise disjoint intervals constituting the union of N intervals described by arrays A and B. The K-th interval, where K is an integer within the range [0..(N − 1)], is defined as (A[K], B[K]).

For example, given the following arrays A and B consisting of eight elements each:

  A[0] =  1    A[1] = 12    A[2] = 42
  A[3] = 70    A[4] = 36    A[5] = -4
  A[6] = 43    A[7] = 15

  B[0] =  5    B[1] = 15    B[2] = 44
  B[3] = 72    B[4] = 36    B[5] =  2
  B[6] = 69    B[7] = 24
the function should return 5, because the intervals described by these arrays correspond to the example above.

Assume that:

N is an integer within the range [0..100,000];
each element of arrays A, B is an integer within the range [−1,000,000,000..1,000,000,000];
A[K] ≤ B[K] for integers K within the range [0..(N − 1)].
Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.