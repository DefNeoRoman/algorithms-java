package hackerrank.datastructure.tree;

import org.junit.Test;


import java.util.LinkedList;
import java.util.Queue;

/**
 * https://www.hackerrank.com/challenges/tree-level-order-traversal
 */
public class TreeLevelOrderTraversal {

    @Test
    public void test() {
        Node root = new Node(3, new Node(5, new Node(1), new Node(4)), new Node(2, new Node(6), null));
        LevelOrder(root);
    }

    void LevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

}
