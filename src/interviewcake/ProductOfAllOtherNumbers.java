package interviewcake;


/**
You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.
Write a function get_products_of_all_ints_except_at_index() that takes an array of integers and returns an array of the products.

For example, given:

  [1, 7, 3, 4]
your function would return:

  [84, 12, 28, 21]
by calculating:

  [7*3*4, 1*3*4, 1*7*4, 1*7*3]
Do not use division in your solution. 
*/
public class ProductOfAllOtherNumbers {
	
	/**
	 * O(n2)
	 */
	public int[] getProductsOfAllIntsExceptAtIndex1(int[] numbers) {
		int[] products = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			int product = 1;
			for (int j = 0; j < numbers.length; j++) {
				if (j == i) continue;
				product *= numbers[j];
			}
			products[i] = product;
		}
		return products;
	}
	
	/**
	 * O(n)
<pre>
To find the products of all the integers except the integer at each index, we'll go through our array greedily twice. First we get the products of all the integers before each index, and then we go backwards to get the products of all the integers after each index.
When we multiply all the products before and after each index, we get our answer—the products of all the integers except the integer at each index! 
</pre>
	 */
	public int[] getProductsOfAllIntsExceptAtIndex2(int[] numbers) {
		int[] products = new int[numbers.length];
		
		int productBefore = 1;
		for (int i = 0; i < numbers.length; i++) {
			products[i] = productBefore;
			productBefore *= numbers[i];
		}
		
		int productAfter = 1;
		for (int i = numbers.length - 1; i >= 0; i--) {
			products[i] *= productAfter;
			productAfter *= numbers[i];
		}
		
		return products;
	}

}
