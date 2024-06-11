package Stack;

class Node{
    int data ;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class StackLinklist {
    
    int top;
    Node node;

    public StackLinklist(){
        this.top=-1;
        node = null;
    }

    public void push (int data){
        Node newNode = new Node(data);
        if (node == null){
            node =newNode;
            top++;
            return;
        }
        else{
            Node current = this.node;
            while(current.next != null){
                current=current.next;
            }
            top++;
            current.next=newNode;
        }
    }

    public void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            Node current = this.node;
            while(current != null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }

    public int pop(){
        Node current = this.node;
        if (top==-1 || top==0){
            if(top==0){
                int data=current.data;
                node=null;
                top--;
                return data;
            }
            throw new RuntimeException("Stack is empty");
        }
        else{
            int count = 0;
            while(count < (top-1)){
                count ++;
                current = current.next;
            }
            int data = current.next.data;
            current.next=null;
            top--;
            return data;
        }
    }

    public static void main(String[] args) {
        StackLinklist lk = new StackLinklist();
        lk.push(5);
        lk.push(7);
        lk.push(6);
        System.out.println(lk.pop());
        lk.push(9);
        lk.display();
    }
}
