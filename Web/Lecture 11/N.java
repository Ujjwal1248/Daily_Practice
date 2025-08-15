public class N{
    public static void main(String[] args) {
        int n=4;
        int tq=4;
        boolean[][] board=new boolean[n][n];
        queen(board,0,tq);
    }
    public static void queen(boolean[][] board,int row,int tq) {
        if(tq==0){
            display(board);
            return;
        }

        for(int col=0;col<board[0].length;col++){
            if(isItsafe(board,row,col)){
                board[row][col]=true;
                queen(board,row+1,tq-1);
                board[row][col]=false;
            }
        }
    }

    public static boolean isItsafe(boolean[][] board,int row, int col){
        int r=row;
        int c=col;
        while(r>=0){
            if(board[r][c]){
                return false;
            }
            r--;
        }
        r=row;
        c=col;

        while(r>=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }
        while(r>=0 && c<board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
    }


    
}