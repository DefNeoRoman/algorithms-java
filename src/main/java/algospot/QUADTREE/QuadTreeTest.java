package algospot.QUADTREE;

import org.junit.Before;
import org.junit.Test;

public class QuadTreeTest {

	private QuadTree quadTree;

	@Before
	public void setUp() throws Exception {
		quadTree = new QuadTree("xbwxwbbwb");
	}

	@Test
	public void testBuildTreeAt() throws Exception {
		quadTree.buildTreeAt(0);
	}

	@Test
	public void testTraverseUpsideDown() throws Exception {
		Node node = new Node(0, 'w');
		quadTree.traverseUpsideDown(node);
	}

	@Test
	public void testTraverseUpsideDown2() throws Exception {
		Node node = new Node(0, 'x');
		node.addChild(new Node(1, 'b'));
		node.addChild(new Node(2, 'w'));
		node.addChild(new Node(3, 'w'));
		node.addChild(new Node(4, 'b'));
		quadTree.traverseUpsideDown(node);
	}

	@Test
	public void testTraverseUpsideDown3() throws Exception {
		Node node = new Node(0, 'x');
		node.addChild(new Node(1, 'b'));
		node.addChild(new Node(2, 'w'));

		Node subNode = new Node(3, 'x');
		subNode.addChild(new Node(4, 'w'));
		subNode.addChild(new Node(5, 'b'));
		subNode.addChild(new Node(6, 'b'));
		subNode.addChild(new Node(7, 'w'));
		node.addChild(subNode);

		node.addChild(new Node(8, 'b'));
		quadTree.traverseUpsideDown(node);
	}

}