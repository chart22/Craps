/**
 * Write a description of class Craps here.
 *
 * @author Charlotte Hart
 * @version 2021-01-17
 */
import java.util.Scanner;

public class Craps
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       // here we establish our objects - in this case, our two die. 
       Die d1 = new Die();
       Die d2 = new Die();
       System.out.print("Hello there! Would you like to play a game of craps (y/n)?");
       String playGame = in.nextLine();
       // This while-loop will continue running as long as the user says they want to play. 
       while(playGame.equalsIgnoreCase("y"))
       {
           //checking to see if the user needs some instructions.
           System.out.print("Would you like to see instructions (y/n)?");
           String instruct = in.nextLine();
           if (instruct.equalsIgnoreCase("y"))
           {
              System.out.println("First, you roll the dice by pressing [Enter]. Then, your two rolls are added together.");
              System.out.println("If you roll a 7 or an 11, you win!");
              System.out.println("If you roll a 2, 3, or 12, you automatically lose.");
              System.out.println("If you roll anything else, that number then becomes your 'point'.");
              System.out.println("Then, you roll again to attempt to match your point. If you do, you win! If you don't, you lose.");
           }
           //here, we roll the dice.
           System.out.println("Press [Enter] to roll the dice.");
           in.nextLine();
           int roll1 = d1.rollDie();
           int roll2 = d2.rollDie();
           int rollTotal = roll1 + roll2;
           System.out.println("You rolled a " + roll1 + " and a " + roll2);
           System.out.println("...for a total of " + rollTotal);
           // now, we go through a series of if-else statements to determine if the user won, lost, or needs to match a point.
           if (rollTotal == 7 || rollTotal == 11)
           {
               System.out.println("You won!");
           }
           else if (rollTotal == 2 || rollTotal == 3 || rollTotal == 12)
           {
               System.out.println("You lose!");
           }
           else
           {
               // here we have the user roll again, anad then check to see if they matched their point.
               int point = rollTotal;
               System.out.println();
               System.out.println("Your point is " + point);
               System.out.println("Press [Enter] to roll the dice.");
               in.nextLine();
               roll1 = d1.rollDie();
               roll2 = d2.rollDie();
               rollTotal = roll1 + roll2;
               System.out.println("You rolled a " + roll1 + " and a " + roll2);
               System.out.println("...for a total of " + rollTotal);
               if (rollTotal  == point)
               {
                   System.out.println("You matched your point. You win!");
               }
               else
               {
                   System.out.println("You didn't match your point. You lose!");
               }
           }
           System.out.println();
           System.out.print("Would you like to play again (y/n)?");
           playGame = in.nextLine();
       } 
       System.out.println();
       System.out.println("Thanks for playing!");
   }
}
