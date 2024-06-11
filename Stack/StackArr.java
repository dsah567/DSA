package Stack;

public class StackArr {

    int maxsize ;
    int[] stack;
    int top;

    public StackArr(int size){
        this.maxsize =size;
        this.top=-1;
        this.stack=new int[maxsize];
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
            return ;
        }
        stack[++top]=data;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        return stack[top--];
    }

    public void display(){

        if(isEmpty()){
            System.out.println("Stack is empty");
            return ;
        }

        for (int i =0;i <=top; i++ ){
            System.out.println(stack[i]);}
    }


    public boolean isFull(){
        return (top== maxsize-1);
    }
    public boolean isEmpty(){
        return (top== -1);
    }

    public int sizeOfStack(){
        return top+1;
    }

    public static void main(String[] args) {
        StackArr stack = new StackArr(5);
        stack.push(5);
        stack.push(6);
        stack.push(0);
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.pop());
        stack.display();
    }
    
}
