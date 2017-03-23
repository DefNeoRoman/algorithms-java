A zero-indexed array A consisting of N integers is given. A triplet (P, Q, R) is called a triangle if 0 ≤ P < Q < R < N and:

A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
The perimeter of such a triangle equals A[P] + A[Q] + A[R].

For example, consider the following array A:

  A[0] = 10
  A[1] = 2
  A[2] = 5
  A[3] = 1
  A[4] = 8
  A[5] = 20
Triplet (0, 2, 4) is a triangle and its perimeter equals 10 + 5 + 8 = 23. There is no other triangle in this array with a larger perimeter.

Write a function:

class Solution { public int solution(int[] A); }

that, given a zero-indexed array A of N integers, returns the maximum perimeter of any triangle in this array. The function should return −1 if there are no triangles.

For example, given:

  A[0] = 10
  A[1] = 2
  A[2] = 5
  A[3] = 1
  A[4] = 8
  A[5] = 20
the function should return 23, as explained above.

Given array A such that:

  A[0] = 5
  A[1] = 10
  A[2] = 18
  A[3] = 7
  A[4] = 8
  A[5] = 3
the function should return 25: the triangle with the maximum perimeter is (1, 3, 4).

While for an array A:

  A[0] = 10
  A[1] = 20
  A[2] = 30
the function should return −1, as it is impossible to create a triangle.

Assume that:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [1..100,000,000].
Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.