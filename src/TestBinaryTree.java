import org.junit.Before;
import org.junit.Test;

/**
 * Created by Developer on 4/13/2017.
 */
public class TestBinaryTree {

    private BinaryTree bt = new BinaryTree();

    @Before
    public void testBuildingBinaryTree() {

        BinaryTree.BTNode root = bt.setRoot(new BinaryTree.BTNode(0));
        root  = root.setLeft(new BinaryTree.BTNode(1));
        BinaryTree.BTNode left  = root.setLeft(new BinaryTree.BTNode(2));
        BinaryTree.BTNode right = root.setRight(new BinaryTree.BTNode(3));

        root = bt.getRoot();
        root  = root.setRight(new BinaryTree.BTNode(4));
        left  = root.setLeft(new BinaryTree.BTNode(5));
        right = root.setRight(new BinaryTree.BTNode(6));
    }

    @Test
    public void testBreathFirst() {
        bt.breadthFirst(bt.getRoot());
    }

    @Test
    public void testPreorderDepthFirst() {
        bt.preorderDepthFirst(bt.getRoot());
    }

    @Test
    public void testPostorderDepthFirst() {
        bt.postorderDepthFirst(bt.getRoot());
    }

    @Test
    public void testInorderDepthFirst() {
        bt.pinorderDepthFirst(bt.getRoot());
    }


}
