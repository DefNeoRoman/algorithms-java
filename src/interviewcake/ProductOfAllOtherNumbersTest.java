package interviewcake;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ProductOfAllOtherNumbersTest {
	ProductOfAllOtherNumbers productOfAllOtherNumbers = new ProductOfAllOtherNumbers();
	
	@Test
	public void test1() {
		int[] numbers = {1, 7, 3, 4};
		int[] expected = {84, 12, 28, 21};
		test(numbers, expected);
	}
	
	@Test
	public void test2() {
		int[] numbers = {1, 7, 0, 3, 4};
		int[] expected = {0, 0, 84, 0, 0};
		test(numbers, expected);
	}
	
	@Test
	public void test3() {
		int[] numbers = {1, 2, 6, 5, 9};
		int[] expected = {540, 270, 90, 108, 60};
		test(numbers, expected);
	}
	
	
	@Test
	public void test4() {
		int[] numbers = {3, 1, 2, 5, 6, 4};
		int[] expected = {240, 720, 360, 144, 120, 180};
		test(numbers, expected);
	}
	
	@Test
	public void test5() {
		int[] numbers = {100, 200};
		int[] expected = {200, 100};
		test(numbers, expected);
	}
	
	@Test
	public void test6() {
		int[] numbers = {100};
		int[] expected = {1};
		test(numbers, expected);
	}
	
	private void test(int[] numbers, int[] expected) {
		assertArrayEquals(expected, productOfAllOtherNumbers.getProductsOfAllIntsExceptAtIndex1(numbers));
		assertArrayEquals(expected, productOfAllOtherNumbers.getProductsOfAllIntsExceptAtIndex2(numbers));
	}

}
