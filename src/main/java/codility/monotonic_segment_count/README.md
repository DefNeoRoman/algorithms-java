A zero-indexed array A consisting of N integers is given. A segment of this array is any pair of integers (P, Q) such that 0 ≤ P < Q < N.

Segment (P, Q) of array A is called monotonic if the sequence consisting of numbers A[P], A[P+1], ..., A[Q] is either strictly increasing, strictly decreasing or constant.

For example, in array A such that

  A[0] = 1    A[1] = 2    A[2] = 4
  A[3] = 7    A[4] = 6    A[5] = 6
  A[6] = 6    A[7] = 2    A[8] = 0
the segment (0,2) is monotonic because the sequence A[0], A[1], A[2] (equal to 1, 2, 4) is strictly increasing. Other examples of monotonic segments in array A are (0, 3) and (4, 6). The segment (5,7) is not a monotonic segment because the sequence A[5], A[6], A[7] (equal to 6, 6, 2) is neither strictly increasing or decreasing nor constant.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the number of monotonic segments it contains.

The function should return −1 if this number exceeds 1,000,000,000.

Assume that:

N is an integer within the range [0..1,000,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
For example, given array A such that

  A[0] = 1    A[1] = 2    A[2] = 4
  A[3] = 7    A[4] = 6    A[5] = 6
  A[6] = 6    A[7] = 2    A[8] = 0
the function should return 13 because there are 13 monotonic segments in A, namely:

4 decreasing: (3, 4), (6, 7), (6, 8), (7, 8);
6 increasing: (0, 1), (0, 2), (0, 3), (1, 2), (1, 3), (2, 3);
3 constant: (4, 5), (4, 6), (5, 6).
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.