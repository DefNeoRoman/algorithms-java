package hackerrank.datastructure.tree;

/**
 * https://www.hackerrank.com/challenges/tree-postorder-traversal
 */
public class TreePostorderTraversal {

    void Postorder(Node root) {
        if (root == null) {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }

}
