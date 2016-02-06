package plalab.algorithm.hw3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
정수와 음수를 담은 NxN행렬이 주어졌을 때, 그 모든 원소의 합이 최대가 되는 부분 행렬의 원소의 합을 구하는 코드를 작성하라. 부분 행렬은 정방행렬이 아닐 수 있다.
public static int maxSubMatrix(int m[][])
 */
public class Hw3Test {

	int[][] m1 = { { -1, 3, 3 }, { -1, 3, 3 }, { -1, 3, 3 } };
	int[][] m2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int[][] m3 = { { 1, 2, 3, 4, 5 }, { -1, -2, -3, -4, -5 }, { 0, 0, 0, 0, 0 }, { 1, 2, 3, 4, 5 }, { -1, -2, -3, -4, -5 } };

	@Test
	public void testDaleSeo() {
		int max = Hw3.maxSubMatrixDaleSeo(this.m1);
		assertEquals(18, max);
	}
	
	@Test
	public void testDaleSeo2() {
		int max = Hw3.maxSubMatrixDaleSeo(this.m2);
		assertEquals(45, max);
	}
	
	@Test
	public void testDaleSeo3() {
		int max = Hw3.maxSubMatrixDaleSeo(this.m3);
		assertEquals(15, max);
	}
	
	@Test
	public void preProcess() {
		// Hw3.preProcess(m1);
		Hw3.preDaleSeo(m2);
	}
	
	@Test
	public void testSumDaleSeo() {
		Hw3.preDaleSeo(m2);
		assertEquals(5, Hw3.sumDaleSeo(m2, 1, 1, 1, 1));
		assertEquals(11, Hw3.sumDaleSeo(m2, 1, 1, 1, 2));
		assertEquals(13, Hw3.sumDaleSeo(m2, 1, 1, 2, 1));
		assertEquals(28, Hw3.sumDaleSeo(m2, 1, 1, 2, 2));
	}

}
