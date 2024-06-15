package sorting;

public class SelectionSort extends Sort{

    public int[] sort(int[] array){
        int arrayLength = array.length;

        for (int i= 0;i<arrayLength-1;i++){

            int minValue= array[i];
            int index=i;

            for(int j = i+1;j<arrayLength;j++){
                if(minValue > array[j] ){
                    minValue=array[j];
                    index=j;
                }
            }

            if(array[i]!=minValue){
                array = swap(i,index,array);
            }
            
        }

        return array;

    }

    public static void main(String[] args) {

        SelectionSort ss = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        int[] sortedArray = ss.sort(arr);

        ss.display(sortedArray);
        
    }
}