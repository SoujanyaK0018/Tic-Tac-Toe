package game;
import Board.board;
import player.Player;
import java.util.Scanner;

public class Game {
    Player[] players;
    board Board;
    int turn;
    int noOfMoves;
    boolean gameOver;
    String zero;
    String cross;

    public Game(Player[] players,board Board ){
        this.players=players;
        this.Board=Board;
        this.turn = 0;
        this.noOfMoves=0;
        this.gameOver=false;
        StringBuilder z = new StringBuilder();
        StringBuilder c = new StringBuilder();
        for(int i = 0;i<Board.size;i++){
            z.append('O');
            c.append('X');

        }
        this.zero=z.toString();
        this.cross=c.toString();


    }
    public void printBoardConfig(){
        int sz=this.Board.size;
        for(int i = 0;i<sz;i++){
            for(int j = 0;j<sz;j++){
                System.out.print(Board.board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void play(){
        printBoardConfig();
        int sz=Board.size;
        while(!gameOver){
            noOfMoves++;
            int idx=getIndex();
            int row=idx/sz;
            int col=idx%sz;
            Board.board[row][col]=players[turn].getPlayerSymbol();
            if(noOfMoves>=sz*sz){
                System.out.println(" Game Draw ");
                return;
            }
            if(noOfMoves>=2*sz-1&&checkCombinations()==true){
                gameOver=true;
                printBoardConfig();
                System.out.println(" Winner is: "+players[turn].get_player_name());
                return;
            }
            turn=(turn+1)%2;
            printBoardConfig();
        }
    }
    public int getIndex(){
        while(true){
            System.out.println(" Player: "+players[turn].get_player_name()+" give one position ");
            Scanner scn = new Scanner(System.in);
            int pos=scn.nextInt();
            int sz=Board.size;
            int row=pos/sz;
            int col=pos%sz;
            if(row<0||row>=sz||col<0||col>=sz){
                System.out.println(" Invalid position ");
                continue;
            }
            if(Board.board[row][col]!="-"){
                System.out.println(" Position already occupied ");
                continue;

            }
            return pos;
        }
    }
    public boolean checkCombinations(){
        int sz=Board.size;
        for(int i = 0;i<sz;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<sz;j++){
                sb.append(Board.board[i][j]);
            }
            String pattern=sb.toString();
            if(pattern.equals(zero)||pattern.equals(cross)){
                return true;
            }
        }
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder();
        while(i<sz){
            sb.append(Board.board[i][j]);
            i++;
            j++;
        }
        String pattern=sb.toString();
        if(pattern.equals(zero)||pattern.equals(cross)){
            return true;
        }
        i=0;
        j=sz-1;
        sb=new StringBuilder();
        while(i<sz){
            sb.append(Board.board[i][j]);
            i++;
            j--;
        }
        pattern=sb.toString();
        if(pattern.equals(zero)||pattern.equals(cross)){
            return true;
        }
        return false;
    }


}
