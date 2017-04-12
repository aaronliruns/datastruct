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


    private void visit(BTNode node) {
        System.out.println("[" + node.getNumber() + "]");
    }


    public void breadthFirst() {
        Queue<BTNode> queue = new LinkedList<BTNode>();
        BTNode n = root;
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
