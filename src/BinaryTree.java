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


    protected void visit(BTNode node) {
        System.out.println("[" + node.getNumber() + "]");
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
