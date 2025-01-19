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
        assertEquals(2, myLinkedList.get(2).value);
        assertEquals(1, myLinkedList.get(1).value);
        assertEquals(0, myLinkedList.get(0).value);
    }

    @Test
    public void testSet(){
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        myLinkedList.set(2, 99);
        assertEquals(99, myLinkedList.get(2).value);
    }

    @Test
    public void testInsert(){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(3);

        System.out.println("LL before insert():");
        myLinkedList.insert(1, 2);
        System.out.println("\nLL after insert(2) in middle:");
        myLinkedList.printList();
        assertEquals(2, myLinkedList.get(1).value);

        myLinkedList.insert(0, 0);
        System.out.println("\nLL after insert(0) at beginning:");
        myLinkedList.printList();
        assertEquals(0, myLinkedList.get(0).value);

        myLinkedList.insert(4, 4);
        System.out.println("\nLL after insert(4) at end:");
        myLinkedList.printList();
        assertEquals(4, myLinkedList.get(4).value);

    }

    @Test
    public void testRemove(){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("\nRemoved node from middle:");
//        Check we removed the correct node
        assertEquals(3, myLinkedList.remove(2).value);
//        Check the new index is correct
        assertEquals(4, myLinkedList.get(2).value);

        System.out.println("\nRemoved node from start:");
//        Check we removed the correct starting node.
        assertEquals(1, myLinkedList.remove(0).value);
        assertEquals(2, myLinkedList.getHead().value);

        System.out.println("\nRemoved node from end:");
        assertEquals(5, myLinkedList.remove(2).value);
        assertEquals(4, myLinkedList.getTail().value);
    }


    @Test
    public void testReverse(){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        myLinkedList.reverse();

//        Testing reversing works
        assertEquals(5, myLinkedList.getHead().value);
        assertEquals(4, myLinkedList.get(1).value);
        assertEquals(3, myLinkedList.get(2).value);
        assertEquals(2, myLinkedList.get(3).value);
        assertEquals(1, myLinkedList.getTail().value);

    }
}