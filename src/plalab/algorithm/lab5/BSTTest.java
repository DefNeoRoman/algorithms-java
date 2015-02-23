package plalab.algorithm.lab5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BSTTest {

	@Test
	public void test() {
		BST bst = new BST();
		bst.insert(5);
		bst.inorderPrint();
		
		System.out.println();
		
		bst.insert(7);
		bst.inorderPrint();
		
		System.out.println();
		
		bst.insert(9);
		bst.inorderPrint();
		
		System.out.println();
		
		bst.insert(3);
		bst.inorderPrint();
		
		System.out.println();
		
		bst.insert(1);
		bst.inorderPrint();
		
		System.out.println();
		
		Node result3 = bst.search(3);
		assertEquals(3, result3.data);
		
		Node result7 = bst.search(7);
		assertEquals(7, result7.data);
		
	}

}
