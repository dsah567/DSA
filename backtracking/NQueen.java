package backtracking;

public class NQueen {

    int n;
    int [][] board;

    public NQueen(int n){

        this.n=n;
        int[][] board= new int[n][n];
        nQueen(board,0);

    }

    public boolean isSafe(int board[][], int row, int col)
    {
        int i, j;
 
        
        for (i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; j <n && i >=0 ; i--, j++)
            if (board[i][j] == 1)
                return false;
 
        return true;
    }
    public boolean nQueen(int[][] board,int row){
        if(n==row) {
            for(int a[]: board){
                for(int b: a){
                    System.out.print(b + "");
                }
                System.out.println();
            }

            return true;

        }

        for(int col = 0;col<n;col++){
            if(isSafe(board, row, col)){
                board[row][col]=1;
                if( nQueen(board, row+1)==true){
                    return true;
                }
                board[row][col]=0;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        NQueen nq= new NQueen(6);
        
    }
    
}
