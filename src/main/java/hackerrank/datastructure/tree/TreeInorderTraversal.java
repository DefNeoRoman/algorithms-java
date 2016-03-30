package hackerrank.datastructure.tree;

/**
 * https://www.hackerrank.com/challenges/tree-inorder-traversal
 */
public class TreeInorderTraversal {

    void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

}
