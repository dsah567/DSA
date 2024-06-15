package sorting;

public class MergeSort extends Sort {

    public int[] sort(int[] array){
        array = divideRecursive(array,0,array.length-1);
        return array;

    }

    

    public int[] divideRecursive(int[] array,int i,int l){

        if(i<l){
            int midIndex=(i+l)/2;
            divideRecursive(array, i, midIndex);
            divideRecursive(array, midIndex+1, l);
            mergeSortRecursive(array,i,midIndex,l);
        }

        return  array;

    }

    public int[] mergeSortRecursive(int[] array, int i, int m,int l){
        int midIndex=m;

        for(int b= midIndex+1; b<=l;b++){

            int currentIndex=b;
            int temp=array[b];
            for(int a=i; a<=midIndex;a++){
                if(temp<array[a]){

                    while(currentIndex!=a){
                        array[currentIndex]=array[currentIndex-1];
                        currentIndex--;
                    }

                    array[a]=temp;
                    i=a+1;
                    break;

                }

            }

        }

        return array;
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        ms.sort(arr);
        ms.display(arr);
    }
    
}
