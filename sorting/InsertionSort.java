package sorting;

public class InsertionSort extends Sort{

    public int[] sort(int[] array){

        int arrayLength=array.length;
        int i,j,temp ;

        for(i=1;i<arrayLength;i++){
            temp=array[i];
            for(j=0;j<i;j++){
                int index=i,k;

                if(array[i]<array[j]){
                    k=j;
                    while(j!=i){
                        array[index]=array[index-1];
                        j++;
                        index--;
                    }
                    array[k]=temp;

                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        InsertionSort is= new InsertionSort();
        int[] arr = {6, 0, 3, 5};
        is.sort(arr);
        is.display(arr);

        // int[] arr1= {23, 1, 10, 5, 2};
        // int[] sortedArray1 =is.sort(arr1);
        // is.display(sortedArray1);

        // int[] arr2= { 12, 11, 13, 5, 6 };
        // int[] sortedArray2 = is.sort(arr2);
        // is.display(sortedArray2);
    }
    
}
