package seo.dale.algorithm.tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SimpleTreeTest {

    @Test
    public void test() {
        final SimpleTree<Integer> root = new SimpleTree<>(7, null, null);
        root.insert(3);
        root.insert(9);
        root.insert(10);
        assertEquals(Integer.valueOf(10), root.getRight().getRight().getValue());
        assertTrue(root.search(10));
    }

}
