package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestLinkedList {

    @Test
    public void testConstructor(){
        LinkedList myLinkedList = new LinkedList(4);
        assertEquals(4, myLinkedList.getHead().value);
        assertEquals(4, myLinkedList.getTail().value);
        assertEquals(1, myLinkedList.getLength());
    }

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
        assertNull(myLinkedList.removeLast());
    }

    @Test
    public void testPrepend(){
        LinkedList myLinkedList = new LinkedList(2);

        myLinkedList.prepend(1);

        assertEquals(1, myLinkedList.getHead().value);
        assertEquals(2, myLinkedList.getTail().value);
        assertEquals(2, myLinkedList.getLength());

    }

    @Test
    public void testRemoveFirst(){
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);
        assertEquals(2, myLinkedList.removeFirst().value);
        assertEquals(1, myLinkedList.getLength());
        assertEquals(1, myLinkedList.removeFirst().value);
        assertEquals(0, myLinkedList.getLength());
        assertNull(myLinkedList.removeFirst());
    }

    @Test
    public void testGet(){
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        assertEquals(3, myLinkedList.get(3).value);
    }
}
