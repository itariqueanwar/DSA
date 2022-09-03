//Implementing Doubly Linked List

package DoublyLinkedList;

import java.util.Scanner;

public class doublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

//    Creating an inner class to create Doubly Linked List.
    private class Node{
        private int val;
        private Node next;
        private Node prev;

//        Constructor for the inner class
        public Node(int val){
            this.val = val;
        }
    }

//    Constructor for the outer Class
    public doublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

//    Function to check if the List is Empty or Not.
    public boolean isEmpty(){
        return length == 0;
    }

//    Function to get the Length of the Linked List.
    public int getLength(){
        return length;
    }


//    Method to Print the Linked List
    public void print(){
        if(head == null){
            return;
        }
        Node current = head;
        System.out.print("Null -> ");
        while (current != null){
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

//    Method to print the Linked List in reverse
    public void reversPrint(){
        if(tail == null);
        Node current = tail;
        System.out.print("Null -> ");
        while(current != null){
            System.out.print(current.val + " -> ");
            current = current.prev;
        }
        System.out.println("Null");
    }

    //    Function to insert The Node at the end of the linked list.
    public void insetLast(int val){
        Node newNode = new Node(val);

        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

//    Method to insert Node at begin of the Linked List.
    public void insertBegin(int val){
        Node newNode = new Node(val);

        if(isEmpty()){
            tail = newNode;
        }else{
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

//    Main Function Starts here

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doublyLinkedList dll = new doublyLinkedList();

        while(true){
            int choice;
            System.out.println("Please Enter your Choice : ");
            System.out.println("Press 0 To exit \n" +
                    "Press 1 To insert at end \n" +
                    "Press 2 To Print Linked List \n" +
                    "Press 3 to print revers of the linked list \n" +
                    "Press 4 to get the length of the Linked List \n" +
                    "Press 5 to Insert At begin. \n");
            choice = sc.nextInt();

            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.println("Enter the Data");
                    int data = sc.nextInt();
                    dll.insetLast(data);
                }
                case 2 -> {
                    System.out.println("Data in the Linked list is : \n");
                    dll.print();
                }
                case 3 -> {
                    System.out.println("Linked List in reversed Order :  \n");
                    dll.reversPrint();
                }
                case 4 -> System.out.println("Length of the Given List is " + dll.getLength());

                case 5 -> {
                    System.out.println("Enter the Data to insert : \n");
                    int val = sc.nextInt();
                    dll.insertBegin(val);
                }

                default -> System.out.println("Wrong Input! please select correct Option.");
            }
        }
    }
}