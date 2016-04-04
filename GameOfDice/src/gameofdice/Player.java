/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameofdice;
import java.util.Scanner;

/**
 *
 * @author Toni
 */
public class Player {
    private int guess;
    private int numberbuffer;
    private int totaldicenum;
    private int correctguesses;
    private String stringbuffer;
    private Scanner userinput=new Scanner(System.in);//User input scanner
    
    public Player(){//Constructor
        correctguesses=0;
        System.out.println("We have a player in the game!");
    }
    
    public void guess(){
        //check that the input is a number by throwing exception
        try{
            while(true){
                //take user input
                System.out.println("Enter your guess (2-12):");
                stringbuffer= userinput.nextLine();
                numberbuffer = Integer.parseInt(stringbuffer);//Convert the string to integer
                if(numberbuffer>12){//Check that the number is between 2-12
                    System.out.println("Your number has to be between 2 and 12! "+numberbuffer+" is higher than 12!" );
                 
                }
                else if(numberbuffer<2){//Check that the number is between 2-12
                    System.out.println("Your number has to be between 2 and 12! "+numberbuffer+" is lower than 2!" );
                }
                else{
                    setGuess(numberbuffer);//set attribute guess
                    break;//end loop
                }
            }
        }catch(NumberFormatException e){
            //Inform user of not allowed input and exit
            System.out.println("Exception:"+e+ "! You have to enter an integer!");
            System.exit(0);
        }
    }
    
    public void compareguess(int number1,int number2){//Compare the guess between the thrown dices
        totaldicenum=number1+number2;
        System.out.println("The first dice thrown shows "+ number1+ " and the second dice shows "+ number2+". Totalling "+ totaldicenum+".");
        if(totaldicenum==guess){
            System.out.println("YAY! You have guessed right! Congratulations!");
            correctguesses++;
        }
        else{
            System.out.println("You did not guess right this time. Better luck next time!\n");
        }
    }
    
    //Getter for guess
    public int getGuess() {
        return guess;
    }
    //Setter for guess
    public void setGuess(int guess) {
        this.guess = guess;
    }   

    public int getCorrectguesses() {
        return correctguesses;
    }
}
