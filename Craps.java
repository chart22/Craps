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
       Die d1 = new Die();
       Die d2 = new Die();
       System.out.print("Hello there! Would you like to play a game of craps (y/n)?");
       String playGame = in.nextLine();
       if (playGame.equals("") || playGame.substring(0,1).equalsIgnoreCase("y"))
       {
           System.out.print("Do you need instructions? (y/n)");
           String instructions = in.next();
           if (instructions.equalsIgnoreCase("y"))
           {
               
           }
           System.out.println("Lets play!");
           System.out.print("Press <enter> to roll...");
           String pause = in.next();
           d1.rollDie();
           d2.rollDie();
           System.out.println("Roll 1 = " + d1.getDie() + " Roll 2 = " + d2.getDie());
           if (d1.getDie() == 7 || d1.getDie() == 1 || d2.getDie() == 7 || d2.getDie() == 11)
           {
               System.out.println("Congrats! You won!");
           }
       }
   }
}
