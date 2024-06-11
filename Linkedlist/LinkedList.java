package Linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedList {

    Node head;

    public LinkedList(){
        this.head= null;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (this.head == null){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current=this.head;

        while (current.next != null){
            current = current.next;

        }

        current.next=newNode;

    }

    public void display(){
        Node current = this.head ;
        if (current == null){
            System.out.println("No data inserted");
            return;
        }
        while (current!=null) {
            System.out.println("value"+current.data);
            Node prev = current.next;
            current = prev;
        }
    }

    public void insertAtPosition(int data,int position){
        System.out.println("pos"+position);
        Node newNode = new Node(data);

        Node current = this.head ;

        if (current == null||position==0){
            if (position==0){
                Node prev = head;
                head = newNode;
                newNode.next= prev;
                return;
            }
            System.out.println("No data inserted");
            return;
        }

        int count = 0;

        while (current !=null){
            if (count== position){
                Node prev = current.next;
                newNode.next = prev;
                current.next= newNode;  
                return;
            }
            count++;
            current = current.next;
        }
        System.out.println("Only "+count + " values are pesent");
    }

    public void deleteByPosition(int position ){
        Node current = head;

        if (head == null || position ==0){
            System.out.println("no data");
            if(position==0){
                head = head.next;
            }
            return;
        }


        for(int i = 0; i< position-1;i++){ 
            current = current.next;
            if (current == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
        }
        if (current.next == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        current.next = current.next.next;

    }
    
    public static void main(String[] args) {
        LinkedList lk = new LinkedList();
        lk.addFirst(5);
        lk.addLast(2);
        lk.addFirst(7);
        lk.insertAtPosition(3, 1);
        lk.deleteByPosition(4);
        lk.display();
    }
    
}
