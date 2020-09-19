package BinaryTreeTest;

import com.sun.source.tree.BinaryTree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinaryTreeTest {

    private BinaryTree testBinaryTree;

    @Before
    public void runBefore() {
        //TODO: testBinaryTree = new
    }

    @Test
    public void testBST() {
        assertTrue(testBinaryTree.containsNode(6));
        assertTrue(testBinaryTree.containsNode(4));
        assertFalse(testBinaryTree.containsNode(1));
    }

}
