An integer P is a whole square if it is a square of some integer Q; i.e. if P = Q2.

Write a function:

class Solution { public int solution(int A, int B); }

that, given two integers A and B, returns the number of whole squares within the interval [A..B] (both ends included).

For example, given A = 4 and B = 17, the function should return 3, because there are three squares of integers in the interval [4..17], namely 4 = 22, 9 = 32 and 16 = 42.

Assume that:

A and B are integers within the range [−2,147,483,648..2,147,483,647];
A ≤ B.
Complexity:

expected worst-case time complexity is O(sqrt(abs(B)));
expected worst-case space complexity is O(1).