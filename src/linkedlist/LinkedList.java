package linkedlist;
public class LinkedList {
    private Node head;
    private Node tail;
    private  int length;

    // The node class is an inner class for the LinkedList
    class Node{
        int value;
        Node next;
    
        Node(int value){
            this.value = value;
        }
    }


    // Constructor
    public LinkedList(int value){
        Node newNode = new Node(value); // new keyword runs the constructure for creating a new node
        head = newNode;
        tail = newNode;
        length = 1;
    }    


    public void append(int value){
        if (length < 1){
            Node newNode = new Node(value); 
            head = newNode;
            tail = newNode;
            length = 1;
        } else {
            // create the new node
            Node newNode = new Node(value);

            // set the pointer of the current tail to the new node.
            tail.next = newNode;

            // set the tail node to be the new appended node `newNode`
            tail = newNode;
            length = length + 1;
        }

    }
    
}


