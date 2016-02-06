package seo.dale.algorithm.tree;

import org.junit.*;

public class BinaryTreeTraverserTest {
	
	private BinaryTreeTraverser traverser;
	
	@Before
	public void setUp() {
		char[] binaryTree = {0, 'A', 'B', 'C', 0, 'D', 'E', 'F', 0, 0, 'G', 'H', 'I', 'J', 0, 'K'}; 
		traverser = new BinaryTreeTraverser(binaryTree);
	}

	@Test
	public void test() {
		traverser.preOrder(1);
		
		System.out.println();
		
		traverser.inOrder(1);
		
		System.out.println();
		
		traverser.postOrder(1);
	}

}
