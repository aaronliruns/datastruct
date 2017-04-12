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

        public void setRight(BTNode right) {
            this.right = right;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
