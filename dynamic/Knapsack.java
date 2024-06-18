package dynamic;

public class Knapsack {
    
    public int Knapsack01(int Wt,int[] w,int[] p){
        int n = w.length;
        int [][] table=new int[n + 1][Wt + 1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=Wt;j++){

                if(i==0||j==0){
                     table[i][j]=0;
                }
                else if(w[i-1]<=j){
                    table[i][j]=Math.max(table[i-1][j], p[i-1]+table[i-1][j-w[i-1]]);
                }
                else{
                    table[i][j] =table[i-1][j];
                }
            
            }

        }
        return table[n][Wt];
    }

    public static void main(String[] args) {
        Knapsack kp = new Knapsack();

        int Wt = 50;
        int[] weights = {10, 20, 30};
        int[] profit = {60, 100, 120};

        // int Wt = 3;
        // int[] weights = {4, 5, 6};
        // int[] profit = {1, 2, 3};


        int maxValue = kp.Knapsack01( Wt, weights,profit);
        System.out.println("Maximum value that can be obtained: " + maxValue);
    }
    
}
