package greedy;

import java.util.ArrayList;

//note this algorithm only accepts the sorted algoritm
public class ActivitySelection {

    //this method will return index of maximum activities
    public ArrayList<Integer> maxActivitJob(int[] startDay, int[] finishDay){
        int previousfinishFay=-1;

        ArrayList<Integer> ar=new ArrayList<>();

        for(int i =0; i<startDay.length;i++){
            if( startDay[i] >previousfinishFay){
                ar.add(i);
                previousfinishFay=finishDay[i];
            }
        }

        return ar;

    }

    public static void main(String[] args) {
        ActivitySelection as = new ActivitySelection();
        int s[] = { 1, 3, 0, 5, 8, 5 }; 
        int f[] = { 2, 4, 6, 7, 9, 9 }; 
        System.out.println(as.maxActivitJob(s, f));
    }
    
}
