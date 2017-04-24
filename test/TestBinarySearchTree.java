import org.junit.Test;

/**
 * Created by Developer on 4/24/2017.
 */
public class TestBinarySearchTree {
    BinarySearchTree bst = new BinarySearchTree();


    @Test
    public void testBSTInsertion() {
        bst.insert(15);
        bst.insert(4);
        bst.insert(20);
        bst.insert(17);
        bst.insert(19);

        bst.breadthFirst(bst.getRoot());

    }
}
