package hackerrank.datastructure.tree;

import org.junit.Test;

public class BinarySearchTreeInsertion {

    @Test
    public void test() {
        Node root = new Node(4, new Node(2, new Node(1), new Node(3)), new Node(7));
        new TreeInorderTraversal().Inorder(root);

        System.out.println("\n------------------------------------------------------");

        Node node = Insert(root, 6);
        new TreeInorderTraversal().Inorder(node);
    }

    @Test
    public void test2() {
        Node root = new Node(4, new Node(2, new Node(1), new Node(3)), new Node(7));
        new TreeInorderTraversal().Inorder(root);

        System.out.println("\n------------------------------------------------------");

        Node node = Insert2(root, 6);
        new TreeInorderTraversal().Inorder(node);
    }

    // recursive
    static Node Insert(Node root,int value) {
        if (root == null) {
            Node node = new Node();
            node.data = value;
            root = node;
            return root;
        }

        if (value < root.data) {
            root.left = Insert(root.left, value);
        } else {
            root.right = Insert(root.right, value);
        }

        return root;
    }

    // iterative
    static Node Insert2(Node root,int value) {
        if (root == null) {
            Node node = new Node();
            node.data = value;
            root = node;
            return root;
        }

        Node current = root;
        boolean onLeft;

        while (true) {
            if (value < current.data) {
                if (current.left == null) {
                    onLeft = true;
                    break;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    onLeft = false;
                    break;
                }
                current = current.right;
            }
        }

        Node leaf = new Node();
        leaf.data = value;
        if (onLeft) {
            current.left = leaf;
        }

        return root;
    }

}
