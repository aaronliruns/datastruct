/**
 * Created by Developer on 4/24/2017.
 */
public class BinarySearchTree extends BinaryTree {

    public void insert(int el) {
        BTNode p = getRoot(), prev = null;
        while (p != null) { // find a place for inserting new node;
            prev = p;
            if (p.getNumber() < el)
                p = p.getRight();
            else p = p.getLeft();
        }//traverse to the correct place
        if (getRoot() == null) // tree is empty;
            setRoot(new BTNode(el));
        else if (prev.getNumber() < el)
            prev.setRight(new BTNode(el));
        else prev.setLeft(new BTNode(el));
    }
}
