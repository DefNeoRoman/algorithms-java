package plalab.algorithm.hw2;

import static org.junit.Assert.assertEquals;

import org.junit.*;

/**
정방형 행렬이 있다. 이 행렬의 각 픽셀은 검정색 이거나 흰색이다. 네 가장자리가 전부 검은 픽셀인 최대 부분 정방행렬을 찾는 함수를 작성하라.
검은색: 1
흰색: 0
아래 함수시그니쳐로 작성하라.
public static Subsquare findSquare(int[][] matrix);
Subsquare(int row,int col,int size)로 부분정방행렬 객체를 생성할수있다
 */
public class Hw2Test {
	private final int LARGE_SIZE = 500;
	private final int[][] imageSmall = { { 1, 0, 1, 0, 0 }, { 0, 0, 1, 1, 1 }, { 0, 0, 1, 0, 1 }, { 0, 1, 1, 1, 1 }, { 0, 0, 0, 1, 0 } };
	private final int[][] imageLarge = new int[this.LARGE_SIZE][this.LARGE_SIZE];
	private final int[][] imageLarge2 = new int[this.LARGE_SIZE][this.LARGE_SIZE];

	private final Subsquare expectedSmall = new Subsquare(1, 2, 3);
	private final Subsquare expectedLarge = new Subsquare(241, 251, 249);
	private final Subsquare expectedLarge2 = new Subsquare(100, 100, 1);

	@Before
	public void setUp() throws Exception {
		for (int i = 0; i < this.LARGE_SIZE; i++)
			for (int j = 0; j < this.LARGE_SIZE; j++)
				this.imageLarge[i][j] = 1;
		for (int i = 0; i < this.LARGE_SIZE; i++) {
			for (int j = 0; j < this.LARGE_SIZE; j++) {
				if (i % 12 == 0)
					this.imageLarge[i][j] = 0;
				if (i == 10)
					this.imageLarge[i][j] = 0;
				if (j == 5)
					this.imageLarge[i][j] = 0;
				if (i > this.LARGE_SIZE / 2 && j > this.LARGE_SIZE / 2)
					this.imageLarge[i][j] = 1;
			}
		}

		for (int i = 0; i < this.LARGE_SIZE; i++)
			for (int j = 0; j < this.LARGE_SIZE; j++)
				this.imageLarge2[i][j] = 0;
		this.imageLarge2[100][100] = 1;
	}
	
	@Test
	public void testSmall() {
		// Hw2Utils.paint(imageSmall);
		Subsquare ss = Hw2.findSquareDaleSeo(imageSmall);
		System.out.println("# testSmall : " + ss);
		assertEquals(expectedSmall, ss);
	}

	@Test
	public void testLarge() {
		// Hw2Utils.paint(imageLarge);
		Subsquare ss = Hw2.findSquareDaleSeo(imageLarge);
		System.out.println("# testLarge : " + ss);
		assertEquals(expectedLarge, ss);
	}
	
	@Test
	public void testLarge2() {
		// Hw2Utils.paint(imageLarge2);
		Subsquare ss = Hw2.findSquareDaleSeo(imageLarge2);
		System.out.println("# testLarge2 : " + ss);
		assertEquals(expectedLarge2, ss);
	}
	
	@Test
	public void testGetRange() {
		int rangeSmall = Hw2.getRangeDaleSeo(1, 2, this.imageSmall);
		System.out.println("# rangeSmall : " + rangeSmall);
		assertEquals(3, rangeSmall);
		
		int rangeLarge = Hw2.getRangeDaleSeo(241, 251, this.imageLarge);
		System.out.println("# rangeLarge : " + rangeLarge);
		assertEquals(249, rangeLarge);
	}
	
	@Test
	public void testGetSize() {
		int sizeSmall = Hw2.getSizeDaleSeo(1, 2, 3, this.imageSmall);
		System.out.println("# sizeSmall : " + sizeSmall);
		assertEquals(3, sizeSmall);
		
		int sizeLarge = Hw2.getSizeDaleSeo(241, 251, 249, this.imageLarge);
		System.out.println("# sizeLarge : " + sizeLarge);
		assertEquals(249, sizeLarge);
	}
}
