package hackerrank.datastructure.tree;

/**
 * https://www.hackerrank.com/challenges/tree-preorder-traversal
 */
public class TreePreorderTraversal {

    void Preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

}
