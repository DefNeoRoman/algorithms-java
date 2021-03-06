A two-dimensional zero-indexed matrix consisting of N rows and M columns is given. A saddle point of that matrix is any pair of integers (P, Q) such that:

0 < P < N−1;
0 < Q < M−1;
either element (P, Q) is a local minimum in its row and a local maximum in its column, i.e. A[P][Q−1] > A[P][Q] < A[P][Q+1] and A[P−1][Q] < A[P][Q] > A[P+1][Q];
or element (P, Q) is a local maximum in its row and a local minimum in its column, i.e. A[P][Q−1] < A[P][Q] > A[P][Q+1] and A[P−1][Q] > A[P][Q] < A[P+1][Q].
For example, matrix A such that:

  A[0][0] = 0    A[0][1] = 1    A[0][2] = 9    A[0][3] = 3
  A[1][0] = 7    A[1][1] = 5    A[1][2] = 8    A[1][3] = 3
  A[2][0] = 9    A[2][1] = 2    A[2][2] = 9    A[2][3] = 4
  A[3][0] = 4    A[3][1] = 6    A[3][2] = 7    A[3][3] = 1
has two saddle points because:

element (1, 1) is a local minimum in its row and a local maximum in its column, so it is a saddle point;
element (1, 2) is a local maximum in its row and a local minimum in its column, so it is a saddle point;
element (2, 1) is a local minimum in both its row and its column, so it is not a saddle point;
element (2, 2) is a local maximum in both its row and its column, so it is not a saddle point;
other elements do not fulfill the requirements for the coordinates.
Write a function:

class Solution { public int solution(int[][] A); }

that, given a two-dimensional zero-indexed matrix of size N rows and M columns, returns its number of saddle points.

For example, given matrix A such that:

  A[0][0] = 0   A[0][1] = 1   A[0][2] = 9   A[0][3] = 3
  A[1][0] = 7   A[1][1] = 5   A[1][2] = 8   A[1][3] = 3
  A[2][0] = 9   A[2][1] = 2   A[2][2] = 9   A[2][3] = 4
  A[3][0] = 4   A[3][1] = 6   A[3][2] = 7   A[3][3] = 1
the function should return 2, as explained in the example above.

Assume that:

N and M are integers within the range [1..500];
each element of matrix A is an integer within the range [−2,147,483,648..2,147,483,647].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.