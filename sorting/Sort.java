package sorting;

public class Sort {

    public int[] swap(int i, int j,int[] array){
        int temp =array[j];
        array[j]= array[i];
        array[i]=temp;

        return array;
    }

    public void display(int[] array){
        for(int value: array){
            System.out.println(value);
        }
    }
    
}
