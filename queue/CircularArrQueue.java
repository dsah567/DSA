package queue;

public class CircularArrQueue {
    int maxsize;
    int front;
    int rear;
    int[] queue;
    int count;

    public CircularArrQueue(int size){
        this.maxsize = size;
        this.front=0;
        this.rear =-1;
        this.queue=new int[maxsize];
        this.count=0;
    }

    public boolean isFull(){
        return (count==maxsize);
    }
    
    public boolean isEmpty(){
        return (count==0);
    }

    public void insert(int data){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        else{
            this.rear = (rear +1)%maxsize;
            count++;
            this.queue[rear]=data;
        }
    }
    public int delete(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        else{
            count--;
            int item = this.queue[front];
            front= (front+1)%maxsize;
            return item;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=1, f= this.front;i<=count;i++){
                System.out.println(this.queue[f]);
                f=(f+1)%maxsize;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularArrQueue sq = new CircularArrQueue(5);
        sq.insert(4);
        sq.insert(2);
        sq.insert(6);
        sq.insert(9);
        sq.insert(3);
        sq.insert(10);
        sq.display();
        System.out.println("Delete "+sq.delete());
        System.out.println("Delete "+sq.delete());
        sq.insert(3);
        sq.insert(10);
        sq.display();
        System.out.println("Delete "+sq.delete());
        sq.display();
        System.out.println("Delete "+sq.delete());
        sq.insert(3);
        sq.insert(10);
        System.out.println("Delete "+sq.delete());
        sq.display();
        System.out.println("Delete "+sq.delete());
        System.out.println("Delete "+sq.delete());
        sq.display();
        }


}
