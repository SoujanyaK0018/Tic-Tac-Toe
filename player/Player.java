package player;

import java.util.Scanner;

public class Player {
    String name;
    String symbol;
    int age;
    String contact_number;
    String address;
    String mail_id;
   // public Player(String name,int age,String contact_number,String address,String mail_id){
       // this.name=name;
       // this.age=age;
       // this.contact_number=contact_number;
       // this.address=address;
       // this.mail_id=mail_id;
    //}
    public void set_player_details(String name,String symbol,int age,String contact_number,String address,String mail_id){
        this.name=name;
        this.symbol=symbol;
        this.age=age;
        this.contact_number=contact_number;
        this.address=address;
        this.mail_id=mail_id;
    }
    public void get_player_details(){
        System.out.println("player name is: "+this.name);
        System.out.println("Player symbol: "+this.symbol);
        System.out.println("player age is: "+this.age);
        System.out.println("player contact numer is: "+this.contact_number);
        System.out.println("player address is: "+this.address);
        System.out.println("player mail id is: "+this.mail_id);
    }
    public void set_player_nameAndAge(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setPlayerNameSymbolEmailIdAge(String name,String symbol,String emailId,int age){
        this.name=name;
        this.age=age;
        this.mail_id=emailId;
        this.symbol=symbol;

    }
    public void changeSymbol(String symbol){
        this.symbol=symbol;
    }
    public void setPlayerNameAndSymbol(String name,String symbol){
        this.name=name;
        this.symbol=symbol;

    }
    public String get_player_name(){
        //System.out.println("player name is:"+this.name);
        return this.name;
    }
    public String getPlayerSymbol(){
        return this.symbol;
    }
    public void getPlayerNameAndSymbol(){
        System.out.println("Player Name:"+ this.name);
        System.out.println("Player Symbol:"+this.symbol);
    }
    public void getPlayerNameAndAge(){
        System.out.println("Player Name:"+this.name);
        System.out.println("Player Age:"+this.age);
    }


    
}








