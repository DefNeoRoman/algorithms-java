A central sphere of radius R is the set of all points (x, y, z) in 3D space that satisfy the following equation:

x2 + y2 + z2 = R2

We say that a set of central spheres covers a set of points if each of the points belongs to one of the spheres.

Assume that the following declarations are given:

class Point3D {
  public int x;
  public int y;
  public int z;
}

Write a function:

class Solution { public int solution(Point3D[] A); }

that, given an array describing of a set of points in 3D space, returns the minimum number of central spheres required to cover them.

For example, given the following array:

  A[0].x =  0  A[0].y =  5  A[0].z =  4
  A[1].x =  0  A[1].y =  0  A[1].z = -3
  A[2].x = -2  A[2].y =  1  A[2].z = -6
  A[3].x =  1  A[3].y = -2  A[3].z =  2
  A[4].x =  1  A[4].y =  1  A[4].z =  1
  A[5].x =  4  A[5].y = -4  A[5].z =  3
the function should return 3, because three central spheres are required to cover these points:

a central sphere of radius sqrt(3) covers point number 4,
a central sphere of radius 3 covers points numbers 1 and 3,
a central sphere of radius sqrt(41) covers points numbers 0, 2 and 5.
It is impossible to cover these points with fewer central spheres.

Assume that:

N is an integer within the range [0..100,000];
the coordinates of each point in array A are integers within the range [−10,000..10,000].
Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.