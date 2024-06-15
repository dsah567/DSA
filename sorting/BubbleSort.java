package sorting;

public class BubbleSort extends Sort {

    public int[] sort(int[] array){

        boolean swap;

        for(int i = 0;i<array.length-1;i++){
            swap = false;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    swap=true;
                    array=swap(j, j+1, array);
                }
            }

            if(!swap){
                return array;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {6, 0, 3, 5};
        int[] sortedArray = bs.sort(arr);
        bs.display(sortedArray);
    }
    
}
