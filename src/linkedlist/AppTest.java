package linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testRemoveLast(){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        
        assertEquals(2, myLinkedList.removeLast().value);
        assertEquals(1, myLinkedList.removeLast().value);
        assertEquals(null, myLinkedList.removeLast());
    }
}
