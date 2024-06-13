package searching;

public class BinarySearch {

    int[] array;

    public BinarySearch(int[] array){
        this.array=array;
    }

    public void search(int value){

        if(array.length==0){
            return;
        }
        int index =recursiveSearch(0, array.length-1, value);
        if(index>=0){
            System.out.println( "Value found at index " + index);
            return;
        }

        System.out.println("Value can not be found");
    }

    public int recursiveSearch(int i,int j,int value){
        int midIndex=(i+j)/2;
        int middleValue = array[midIndex];

        while(i<=j){

            if(value== middleValue){
                return i;
            } 
            else if(value < middleValue){
                return recursiveSearch(i, midIndex-1, value);
            }
            else {
                return recursiveSearch(midIndex+1, j, value);
            }
        }
            return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        BinarySearch ls = new BinarySearch(arr);
        ls.search(10);
        ls.search(4);
        ls.search(40);
        ls.search(5);
    }
    
}
