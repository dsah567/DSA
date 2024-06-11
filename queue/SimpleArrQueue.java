package queue;

public class SimpleArrQueue {
    int maxsize;
    int front;
    int rear;
    int[] queue;

    public SimpleArrQueue(int size){
        this.maxsize = size;
        this.front=0;
        this.rear =-1;
        this.queue=new int[maxsize];
    }
    
    public boolean isFull(){
        return (this.rear+1 == this.maxsize);
    }

    public boolean isEmpty(){
        return (this.front>this.rear);
    }

    public void insert(int data){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        else{
            this.rear +=1;
            this.queue[rear]=data;
        }
    }

    public int delete(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        else{
            return this.queue[front++];
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            for(int i = this.front;i<=this.rear;i++){
                System.out.println(this.queue[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleArrQueue sq = new SimpleArrQueue(5);
        sq.insert(4);
        sq.insert(2);
        sq.insert(6);
        sq.insert(9);
        sq.insert(3);
        sq.insert(10);
        sq.display();
        System.out.println(sq.delete());
        System.out.println(sq.delete());
        sq.display();
        System.out.println(sq.delete());
        sq.display();
        System.out.println(sq.delete());
        System.out.println(sq.delete());
        sq.display();
        System.out.println(sq.delete());
        System.out.println(sq.delete());
        sq.display();
        }
    
}
