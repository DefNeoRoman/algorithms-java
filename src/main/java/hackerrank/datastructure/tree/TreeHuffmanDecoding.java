package hackerrank.datastructure.tree;

import org.junit.Test;

/**
 * https://www.hackerrank.com/challenges/tree-huffman-decoding
 */
public class TreeHuffmanDecoding {

    @Test
    public void test() {
        Node root = new Node('\0', new Node('\0', new Node('B'), new Node('C')), new Node('A'));
        decode("1001011", root);
    }

    void decode(String S ,Node root) {
        char[] chars = S.toCharArray();

        int i = 0;
        Node node = root;

        while (i < chars.length) {
            if (chars[i] == '0') {
                node = node.left;
            } else if (chars[i] == '1') {
                node = node.right;
            }

            if (node.data != '\0') {
                System.out.print(node.data);
                node = root;
            }

            i++;
        }
    }

    class Node {
        char data;
        Node left;
        Node right;

        public Node() {
        }

        public Node(char data) {
            this.data = data;
        }

        public Node(char data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "{" + data + "}";
        }
    }

}