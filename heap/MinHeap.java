import java.util.ArrayList;

public class MinHeap {

    ArrayList<Integer>  al ;

    public MinHeap(){
        al = new ArrayList<>();
    }

    public int getParentIndex(int index){
        return (index-1)/2;
    }

    public int getLeftChildIndex(int index){
        return (2 * index + 1);
    }

    public int getRightChildIndex(int index){
        return (2 * index + 2);
    }

    public void swap(int index1, int index2 ){
        int temp = al.get(index1);
        al.set(index1, al.get(index2));
        al.set(index2, temp);
    }

    public void heapifyUp(int index){
        int parentIndex = getParentIndex(index);
        if(index > 0 && al.get(parentIndex)>al.get(index)){
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    public void heapifyDown(int index){

        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);
        int smallest = index;

        if (leftChildIndex < al.size() && al.get(leftChildIndex) < al.get(smallest)) {
            smallest = leftChildIndex;
        }

        if (rightChildIndex < al.size() && al.get(rightChildIndex) < al.get(smallest)) {
            smallest = rightChildIndex;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }

    }

    public void add(int data){
        al.add(data);
        heapifyUp(al.size()-1);
    }

    public int deleteMin() {
        if (al.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int minValue = al.get(0);
        int lastValue = al.remove(al.size() - 1);

        if (!al.isEmpty()) {
            al.set(0, lastValue);
            heapifyDown(0);
        }

        return minValue;
    }

    public int size(){
        return al.size();
    }

    public void display(){
        System.out.println(al);
    }
    public static void main(String[] args) {
        MinHeap mh = new MinHeap();
        mh.add(5);
        mh.add(8);
        mh.add(6);
        mh.display();
        System.out.println(mh.size());


        System.out.println("Delete Min: " + mh.deleteMin());
        mh.display();

        System.out.println("Delete Min: " + mh.deleteMin());
        mh.display();
    }
}