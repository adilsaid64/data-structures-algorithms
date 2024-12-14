package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

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

    public int getLength(){
        return length;
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

    public void prepend(int value){
//        Create the new node
         Node newNode = new Node(value);
//         the new node points to the head
         newNode.next = head;
//         the head becomes the new node
         head = newNode;
//         increase the length
        length = length + 1;
    }

    public Node removeFirst(){
//  Logic for removing first node
        Node temp = head;

//       Edge case for when the head is already null.
        if (head == null){
            return null;
        }
//        If current head.next is null. ie there is only one element in the linkedList.
        if (head.next == null){
            head = null;
            tail = null;
            length = 0;
            return temp;
        }

//        Otherwise set the new head to the next value, and decrease the length by 1.
        head = head.next;
        length = length -1;
        return temp;
    }

    public Node get(int index) {
        if (index<0 || index > length) {
            return null;
        }
        int count = 0;
        Node temp = head;
        while (count != index) {
            temp = temp.next;
            count = count + 1;
        }
        return temp;
    }

    public boolean set(int index, int value){
        if (index<0 || index > length) {
            return false;
        }
        Node temp = get(index);
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value){
        Node newNode = new Node(value);

        if (index == 0){
            prepend(value);
            return true;
        }

        if (index == length){
            append(value);
            return true;
        }

        if (index<0 || index > length) {
            return false;
        }

        Node temp = get(index-1);

        newNode.next = temp.next;
        temp.next = newNode;
        length += 1;

        return true;
    }
}


