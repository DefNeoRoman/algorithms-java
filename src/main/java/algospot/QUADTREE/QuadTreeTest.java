package algospot.QUADTREE;

import org.junit.Test;

public class QuadTreeTest {

	@Test
	public void testUpsideDown() throws Exception {
		QuadTree quadTree = new QuadTree("xxwwwbxwxwbbbwwxxxwwbbbwwwwbb");
		quadTree.upsideDown();
	}

	@Test
	public void testUpsideDown2() throws Exception {
		QuadTree quadTree = new QuadTree("xbwxwbbwb");
		quadTree.upsideDown();
	}

	@Test
		 public void testUpsideDown3() throws Exception {
		QuadTree quadTree = new QuadTree("xbwwb");
		quadTree.upsideDown();
	}

	@Test
	public void testUpsideDown4() throws Exception {
		QuadTree quadTree = new QuadTree("w");
		quadTree.upsideDown();
	}

	@Test
	public void testTraverseUpsideDown() throws Exception {
		Node node = new Node(0, 'w');
		new QuadTree("").traverseUpsideDown(node);
	}

	@Test
	public void testTraverseUpsideDown2() throws Exception {
		Node node = new Node(0, 'x');
		node.addChild(new Node(1, 'b'));
		node.addChild(new Node(2, 'w'));
		node.addChild(new Node(3, 'w'));
		node.addChild(new Node(4, 'b'));
		new QuadTree("").traverseUpsideDown(node);
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
		new QuadTree("").traverseUpsideDown(node);
	}

}