package Linkedlist;


class DobulyNode{
    int data;
    DobulyNode prev;
    DobulyNode next;

    public DobulyNode(int data){
        this.data = data;
        this.prev= null;
        this.next = null;
    }
}

public class DoblyLinkedlist {

    DobulyNode head;
    
    public DoblyLinkedlist(){
        this.head = null;
    }

    public void addFirst(int data){
        DobulyNode newNode = new DobulyNode(data);
        if (head == null){
            this.head = newNode;
        }
        else{
            this.head.prev=newNode;
            newNode.next=this.head;
            this.head= newNode; 
        }
    }

    public void addLast(int data){
        DobulyNode newNode = new DobulyNode(data);

        if (head == null){
            this.head = newNode;
        }


        DobulyNode current = this.head;

        while(current.next != null){
            current = current.next;
        }

        current.next= newNode;
        newNode.prev=current;

    }

    public void display(){
        DobulyNode current = this.head;

        System.out.println("\nDisplaying Data");
        if(head==null){
            System.out.println("No data inserted");
        }

        while(current != null){
            System.out.println("Prev " + current.prev);
            System.out.println("Data " + current.data);
            System.out.println("Next " + current.next);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DoblyLinkedlist dl = new DoblyLinkedlist();
        dl.addFirst(5);
        dl.addLast(9);
        dl.display();
        dl.addLast(6);
        dl.addFirst(3);
        dl.addLast(7);
        dl.addFirst(1);
        dl.display();
    }
    
    
}
