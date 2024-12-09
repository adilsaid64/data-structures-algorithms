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

    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }

    public Node getLength(){
        return tail;
    }

    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll(){
        if (length==0){
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }

        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
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

    public Node removeLast(){
        if (length==0){
            head = null;
            tail = null;
            return null;
        }
        
        Node currentNode = head;
        Node lastNode = head;

        if (length == 1){
            head = null;
            tail = null;
            length = length -1;
        } else {
            while (currentNode.next!=null){
                currentNode = currentNode.next;
    
                if (currentNode.next==null){
                    tail = lastNode;
                    tail.next = null;
                    length = length-1;
                    break;
                } else{
                    lastNode = currentNode;
                }
            }
        }

        return currentNode;
    }
    
}


