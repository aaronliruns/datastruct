import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by admin on 24/6/17.
 */
public class LinkedListReverseTest {

    @Test
    public void testReverse() {
        LinkedListReverse list = new LinkedListReverse();
        // Creating a linked list
        LinkedListReverse.Node head=new LinkedListReverse.Node(5);
        list.addToTheLast(head);
        list.addToTheLast(new LinkedListReverse.Node(6));
        list.addToTheLast(new LinkedListReverse.Node(7));
        list.addToTheLast(new LinkedListReverse.Node(1));
        list.addToTheLast(new LinkedListReverse.Node(2));

        //list.printList(head);
        //Reversing LinkedList
        LinkedListReverse.Node reverseHead = LinkedListReverse.reverseLinkedList(head);
        //list.printList(reverseHead);

        assertEquals("2 1 7 6 5 ",list.printList(reverseHead));
    }

}