import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 24/6/17.
 */
public class LinkedListReverse{

    private Node head;

    protected static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;

        }
    }

    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }


    public String printList(Node head) {
        Node temp = head;
        StringBuffer sb = new StringBuffer();
        while (temp != null) {
            sb.append(String.format("%d ", temp.value));
            temp = temp.next;
        }
        return sb.toString();
    }

//    public static Node reverseLinkedList(Node currentNode)
//    {
//        Node previousNode=null;
//        Node nextNode;
//        while(currentNode!=null)
//        {
//            nextNode=currentNode.next;
//            currentNode.next=previousNode;
//            previousNode=currentNode;
//            currentNode=nextNode;
//        }
//        return previousNode;
//    }

    // Reverse linkedlist using this function
    public static Node reverseLinkedList(Node node) {

        //What is the reverse of null (the empty list)? null.
        //What is the reverse of a one element list? the element.
        if (node == null || node.next == null) {
            return node;
        }

        //We grab the second element (which will be the last after we reverse it)
        Node secondNode = node.next;
        //need to unlink list from the rest or you will get a cycle
        node.next = null;
        //we reverse everything from the second element on
        Node remaining = reverseLinkedList(secondNode);
        //then we join the two lists
        secondNode.next = node;
        //[2]->[1]
        return remaining;
    }


}
