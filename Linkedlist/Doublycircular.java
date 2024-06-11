package Linkedlist;

class DoblyCircularNode{

    DoblyCircularNode prevNode;
    int data;
    DoblyCircularNode nextNode;

    public DoblyCircularNode(int data){
        this.prevNode= null;
        this.data=data;
        this.nextNode=null;
    }

}

public class Doublycircular {

    DoblyCircularNode head ;

    public Doublycircular(){
        this.head = null;
    }

    public void addFirst(int data){
        DoblyCircularNode newNode = new DoblyCircularNode(data);
        head = newNode;

    }

    public void addLast(int data){
        DoblyCircularNode newNode = new DoblyCircularNode(data);
        newNode.nextNode=head;
        

    }
    
}
