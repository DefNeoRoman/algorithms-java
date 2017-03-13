You are given an implementation of a function:

class Solution { public int solution(int[] A, int X); }

This function, when given a zero-indexed array A of N integers, sorted in non-decreasing order, and some integer X, looks for X in A. If X is present in A, then the function returns position of (some) occurrence of X in A. Otherwise, the function returns −1.

For example, given the following array:

  A[0] = 1    A[1] = 2    A[2] = 5
  A[3] = 9    A[4] = 9
and X = 5, the function should return 2, as A[2] = 5.

Unfortunately, despite the fact that the function may return the expected result for the example input, there is a bug (or bugs) in the implementation, which may produce incorrect results for other inputs. Find the bug(s) and correct them. You should modify at most three lines of code.

Assume that:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,000,000,000..2,000,000,000];
array A is sorted in non-decreasing order;
X is an integer within the range [−2,000,000,000..2,000,000,000].
Complexity:

expected worst-case time complexity is O(log(N));
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.