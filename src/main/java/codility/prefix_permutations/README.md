A non-empty zero-indexed array A consisting of a permutation of integers from 1 to N is given.

A permutation of integers from 1 to K is a sequence containing each element from 1 to K once, and only once.

A prefix permutation is an index P such that 0 ≤ P < N and such that the sequence A[0], A[1], ..., A[P] is a permutation of integers from 1 to P + 1.

The goal is to calculate the number of prefix permutations in the array.

For example, consider array A such that:

    A[0] = 2
    A[1] = 1
    A[2] = 3
    A[3] = 5
    A[4] = 4
There are exactly three prefix permutations: 1, 2 and 4. This is because the following sequences are permutations of integers from 1 to P + 1:

for P = 1, the sequence A[0], A[1] contains integers 2, 1,
for P = 2, the sequence A[0], A[1], A[2] contains integers 2, 1, 3,
for P = 4, the sequence A[0], A[1], A[2], A[3], A[4] contains integers 2, 1, 3, 5, 4.
The index 3 is not a prefix permutation because the sequence A[0], A[1], A[2], A[3], which contains integers 2, 1, 3, 5, is not a permutation of integers from 1 to 4.

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty zero-indexed array A consisting of a permutation of integers from 1 to N, returns the number of prefix permutations.

For example, given:

    A[0] = 2
    A[1] = 1
    A[2] = 3
    A[3] = 5
    A[4] = 4
the function should return 3, as explained above.

Assume that:

N is an integer within the range [1..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..N].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.