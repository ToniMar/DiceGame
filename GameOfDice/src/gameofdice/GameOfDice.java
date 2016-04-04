
package gameofdice;

/**
 *
 * @author Toni Martikainen
 */


public class GameOfDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        System.out.println("Welcome to DiceGame!");
        //Creating the player and 2 dices
        Player player1= new Player();
        Dice dice1= new Dice();
        Dice dice2= new Dice();
        //"The game loop"
        for(int i=0; i<5;i++){
            System.out.println("ROUND "+(i+1)+"\n");
            player1.guess();
            System.out.println("Player has guessed "+ player1.getGuess()+ ". Now lets roll the dices.");
            dice1.rollDice();
            dice2.rollDice();
            System.out.println("Dices have been cast!\n");
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                   System.exit(0);
            }
            player1.compareguess(dice1.getThrownnumber(), dice2.getThrownnumber());
        }
        System.out.println("Game has ended. In total you did "+ player1.getCorrectguesses()+" correct guess(es).");
    }
    
}
