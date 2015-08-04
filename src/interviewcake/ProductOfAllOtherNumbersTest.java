package interviewcake;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ProductOfAllOtherNumbersTest {

	int[] numbers = {1, 7, 3, 4};
	int[] expected = {84, 12, 28, 21};
	
	ProductOfAllOtherNumbers productOfAllOtherNumbers = new ProductOfAllOtherNumbers();
	
	@Test
	public void test() {
		assertArrayEquals(expected, productOfAllOtherNumbers.getProductsOfAllIntsExceptAtIndex(numbers));
	}

}
