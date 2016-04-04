/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameofdice;
import java.util.Random;
/**
 *
 * @author Toni
 */
public class Dice {
    private int thrownnumber;
    private int max=6,min=1;
    private Random rand;
    
    
    //Constructor
    Dice(){
        System.out.println("A dice has been created!");
    }
    //Rolling the dice!
    public void rollDice(){
        rand=new Random();
        thrownnumber= rand.nextInt((max-min)+1)+ min;//Get a random number between 1 and 6
    }

    //Getter
    public int getThrownnumber() {
        return thrownnumber;
    }
}
