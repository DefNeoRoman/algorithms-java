package codility.central_sphere_coverage_size;

import java.util.HashSet;
import java.util.Set;

/**
 * https://codility.com/tasks/central_sphere_coverage_size
 * https://codility.com/tickets/tryDDMCJJ-PFW/
 */
public class Solution {

	public int solution(Point3D[] A) {
		Set<Long> set = new HashSet<>();
		for (Point3D point : A) {
			long sum = (long) point.x * (long) point.x;
			sum += (long) point.y * (long) point.y;
			sum += (long) point.z * (long) point.z;
			set.add(sum);
		}
		return set.size();
	}

}

class Point3D {
	public int x;
	public int y;
	public int z;
}
