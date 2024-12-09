package linkedlist;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAppend(){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);

         assertEquals(1, myLinkedList.getHead().value);
         assertEquals(2, myLinkedList.getTail().value);
         assertEquals(2, myLinkedList.getLength());
    }

    @Test
    public void testRemoveLast(){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        
        assertEquals(2, myLinkedList.removeLast().value);
        assertEquals(1, myLinkedList.removeLast().value);
        assertEquals(null, myLinkedList.removeLast());
    }
}
