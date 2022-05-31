public class ProblemaDamelor {
    int n;


    public ProblemaDamelor(int n){
        this.n=n;
    }

    public boolean valid(int[][] board, int row, int col){
        for (int i=0 ;i<col; i++){
            if(board[row][i]==1){
                return false;
            }
        }
        for (int i =row, j= col; i>=0&& j >=0 ; i--,j--){
            if ( board[i][j]==1){
                return false;
            }
        }
        for (int i= row, j=col; j>=0&&i< n; i++,j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
    public boolean problemaDamelor(int[][] board, int col){
        if(col >=n){
            return true;
        }
        for (int i=0; i<n;i++){
            if (valid(board,i,col)){
                board[i][col]=1;
                if(problemaDamelor(board,col+1)){
                    return true;
                }
                board[i][col]=0;
            }
        }
        return false;
    }
    public void print(int board[][]){
        for (int i=0; i< n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" "+ board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        int board[][]= new int[n][n];
        ProblemaDamelor p = new ProblemaDamelor(n);
        p.problemaDamelor(board, 0);
        p.print(board);
    }
}
