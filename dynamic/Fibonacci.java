package dynamic;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    //Without dynamic apporach
    public int fiboRecursion(int n){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }

        return fiboRecursion(n-1)+fiboRecursion(n-2);
    }

    public int fiboWithMemo(int n,Map<Integer,Integer> mp){
        if(n<0){
            return -1;
        }

        int result;

        if(mp.containsKey(n)){
            return mp.get(n);
        }
        else if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            result = fiboWithMemo(n-1, mp) + fiboWithMemo(n-2, mp);
        }

        mp.put(n, result);
        return result;
        
    }

    public int fiboWithTabular(int n){

        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else{

            int[] result=new int[n+1];
            result[0]=0;
            result[1]=1;
            for(int i =2;i<=n;i++){
                result[i]=result[i-1]+result[i-2];
            }
            return result[n];
        }
    }

    public static void main(String[] args) {
        int n =45  ;

        Fibonacci fb = new Fibonacci();
        System.out.println(fb.fiboWithTabular(n));

        Map<Integer,Integer> mp= new HashMap<>();
        System.out.println(fb.fiboWithMemo(n,mp));


        System.out.println(fb.fiboRecursion(n));

    }
}
