You are given a string S consisting of N brackets, opening "(" and/or closing ")". The goal is to split S into two parts (left and right), such that the number of opening brackets in the left part is equal to the number of closing brackets in the right part. More formally, we are looking for an integer K such that:

0 ≤ K ≤ N, and
the number of opening brackets in the K leading characters of S is the same as the number of closing brackets in the N−K trailing characters of S.
Write a function:

class Solution { public int solution(String S); }

that, given string S, returns a value for K that satisfies the above conditions. It can be shown that such a number K always exists and is unique.

For example, given S = "(())", the function should return 2, because:

the first two characters of S, "((", contain two opening brackets, and
the remaining two characters of S, "))", contain two closing brackets.
In other example, given S = "(())))(", the function should return 4, because:

the first four characters of S, "(())", contain two opening brackets, and
the remaining three characters of S, "))(", contain two closing brackets.
In other example, given S = "))", the function should return 2, because:

the first two characters of S, "))", contain zero opening brackets, and
there are no remaining characters, so they contain also zero closing brackets.
Assume that:

N is an integer within the range [0..100,000];
string S consists only of the characters "(" and/or ")".
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1) (not counting the storage required for input arguments).