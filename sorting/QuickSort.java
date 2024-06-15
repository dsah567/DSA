package sorting;

public class QuickSort {

    public void sort(int[] array){

        int arrayLength = array.length;
        quickSortRecursive(array,0,arrayLength-1,0,arrayLength-1);

    }

    public void quickSortRecursive(int[] array,int i,int j,int low,int high){

        if(low>=high || high<=low){
            return;
        }
        int pivot=array[low];

        while(array[low]==pivot && j>i){
            while(array[i]<=pivot && j>=i){
                i++;
            }
            while (array[j]>pivot && j>=i) {
                j--;
            }
            if(array[j]<array[i] && j>=i){
                swap(i, j, array);
            }
            if(j<i){
                swap(low, j, array);
                quickSortRecursive(array, low, j-1, low, j-1);
                quickSortRecursive(array, j+1, high, j+1, high);
            }
        }
        return;
    }

    public void swap(int i, int j,int[] array){
        int temp =array[j];
        array[j]= array[i];
        array[i]=temp;
    }

    public void display(int[] array){
        for(int value: array){
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int arr[] = {10, 80, 30, 90, 40};
        qs.sort(arr);
        qs.display(arr);

        int[] arr1 ={50,30,10,90,80,20,40,70};
        qs.sort(arr1);
        qs.display(arr1);
    }
    
}
