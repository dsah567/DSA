package searching;

public class LinearSearch {
    int[] array;

    public LinearSearch(int[] array){
        this.array=array;
    }

    public void search(int valueToBeSearched){
        for(int i=0 ; i<array.length;i++){
            if(valueToBeSearched == array[i]){
                System.out.println(valueToBeSearched + " found at index " + i);
                return;
            }
        }

        System.out.println(valueToBeSearched + " is not present in array");
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        LinearSearch ls = new LinearSearch(arr);
        ls.search(10);
        ls.search(4);
        ls.search(5);
        ls.search(40);
    }


    
}
