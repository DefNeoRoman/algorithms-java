package hackerrank.datastructure.tree;

import org.junit.Test;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/tree-top-view
 */
public class TreeTopView {

    @Test
    public void test() {
        Node root = new Node(3, new Node(5, new Node(1, null, new Node(9)), new Node(4)), new Node(2, new Node(6), new Node(7, new Node(8), null)));
        top_view(root);
        System.out.println();
        top_view2(root);
    }

    void top_view(Node root) {
        if (root == null) {
            return;
        }
        print(root.left, true);
        System.out.print(root.data + " ");
        print(root.right, false);
    }

    void print(Node node, boolean left) {
        if (node == null) {
            return;
        }
        if (left) {
            print(node.left, true);
            System.out.print(node.data + " ");
        } else {
            System.out.print(node.data + " ");
            print(node.right, false);
        }
    }

    void top_view2(Node root) {
        Node curr = root;
        Stack<Node> stack = new Stack<>();
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }

        while (!stack.isEmpty()){
            Node node = stack.pop();
            System.out.print(node.data + " ");
        }

        curr = root.right;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

}
