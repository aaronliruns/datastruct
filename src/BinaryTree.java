import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Developer on 4/13/2017.
 */
public class BinaryTree {

    private BTNode root = null;


    public  BTNode setRoot(BTNode node) {
        root = node;
        return root;
    }
    public  BTNode getRoot() {
        return root;
    }

    /* Returns true if binary tree with root as root is height-balanced */
    boolean isBalanced(BTNode node)
    {
        int lh; /* for height of left subtree */

        int rh; /* for height of right subtree */

        /* If tree is empty then return true */
        if (node == null)
            return true;

        /* Get the height of left and right sub trees */
        lh = height(node.getLeft());
        rh = height(node.getRight());

        if (Math.abs(lh - rh) <= 1
                && isBalanced(node.getLeft())
                && isBalanced(node.getRight()))
            return true;

        /* If we reach here then tree is not height-balanced */
        return false;
    }


    protected void visit(BTNode node) {
        System.out.println("[" + node.getNumber() + "]");
    }

    /* UTILITY FUNCTIONS TO TEST isBalanced() FUNCTION */
    /*  The function Compute the "height" of a tree. Height is the
        number of nodes along the longest path from the root node
        down to the farthest leaf node.*/
    protected int height(BTNode node)
    {
        /* base case tree is empty */
        if (node == null)
            return 0;

        /* If tree is not empty then height = 1 + max of left
         height and right heights */
        return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
    }



    public void breadthFirst(BTNode n) {
        Queue<BTNode> queue = new LinkedList<BTNode>();
        if  (n != null) {
            queue.offer(n);
            while (!queue.isEmpty()) {
                n = (BTNode) queue.poll();
                visit(n);
                if (n.left != null)
                    queue.offer(n.left);
                if (n.right != null)
                    queue.offer(n.right);
            }
        }//end while
    }

    public void preorderDepthFirst(BTNode node) {
        if (node != null) {
            visit(node);
            preorderDepthFirst(node.left);
            preorderDepthFirst(node.right);
        }
    }

    public void postorderDepthFirst(BTNode node) {
        if (node != null) {
            postorderDepthFirst(node.left);
            postorderDepthFirst(node.right);
            visit(node);
        }
    }

    public void pinorderDepthFirst(BTNode node) {
        if (node != null) {
            pinorderDepthFirst(node.left);
            visit(node);
            pinorderDepthFirst(node.right);
        }
    }

    public  static class BTNode {
        private BTNode left;
        private BTNode right;
        private int number;

        public BTNode(int number) {
            this.number = number;
        }

        public BTNode getLeft() {
            return left;
        }

        public BTNode setLeft(BTNode left) {
            this.left = left;
            return left;
        }

        public BTNode getRight() {
            return right;
        }

        public BTNode setRight(BTNode right) {
            this.right = right;
            return right;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
