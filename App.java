import java.io.*;
import java.util.*;
import Board.board;
import player.Player;
import game.Game;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("TicTacToe");
        board b = new board(3,"-");
        //Scanner scn = new Scanner(System.in);
        //System.out.println("enter the size of the board");
        //int n = scn.nextInt();
       // board b=new board(n);
        b.printboard();
        Player p1=new Player();
        p1.setPlayerNameAndSymbol("Ravi","X");
        p1.getPlayerNameAndSymbol();
        Player p2=new Player();
        p2.setPlayerNameAndSymbol("Aman","O");
        p2.getPlayerNameAndSymbol();
        Game game = new Game(new Player[]{p1,p2},b);
        game.play();
    

        
    }
}