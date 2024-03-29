package Board;

public class board {
    public int size;
    public static String[][] board;
    public board(int n,String defaultSymbol){
        this.size=n;
        this.board=new String[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                this.board[i][j]=defaultSymbol;
            }
           
        }
        
    }
    public void setDefaultSymbol(String symbol){
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                board[i][j]=symbol;
            }
        }
    }
    public void printboard(){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
            
        }
    }

}
