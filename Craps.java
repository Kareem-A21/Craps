
/**
 * This is a simple craps game, in which the user is asked if they want to play and see rules
 *
 * @author Kareem Ansari
 * @version 2021-2-2
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to play Craps (Y/n)?");
        String playGame = in.nextLine();
        if (playGame.equals("") || playGame.substring(0,1).equalsIgnoreCase("y")) 
        {
            //checking to see if player wants to play
            System.out.print("Before we start the round, would you like instructions on how to play Craps (Y/n)?");
            String getRules = in.nextLine();
            //checking if player wants rules, only happens first time around
            if (getRules.equals("") || getRules.substring(0,1).equalsIgnoreCase("y"))
            {
                System.out.println("1. A player rolls two die");
                System.out.println("2. If the sum of the numbers is 7 or 11 you win");
                System.out.println("3. If the sum is 2, 3 or 12, you lose");
                System.out.println("4. If none of these are rolled, the sum becomes the point");
                System.out.println("5. From here on, you continue to roll the die ");
                System.out.println("6. If the sum is 7 you lose ");
                System.out.println("7. If the sum is the earlier determined point, you win");
            }

        }
        while (playGame.equals("") || playGame.substring(0,1).equalsIgnoreCase("y")) 
        {
            //the game has started
            System.out.print("Press <Enter> to roll...");
            String pause = in.nextLine(); //insignficant variable, just to create pause
            Die person1 = new Die(); //create the dice from Die class
            person1.rollDice(); //roll
            System.out.println("You rolled a " + person1.getResult()); 
            int point = person1.getResult(); //establishing the point
            if (person1.getResult() == 7 || person1.getResult() == 11)
            {
                System.out.println("You win!");
                //instant win, game ends
                
            }
            else if(person1.getResult() == 2 || person1.getResult() == 3 || person1.getResult() == 12)
            {
                System.out.println("You lose");
                //instant loss, game ends
                
            }
            else 
            {
                System.out.println("The point is now " + point);
                System.out.print("Press <Enter> to roll...");
                pause = in.nextLine(); //pause
                person1.rollDice();
                while (person1.getResult() != 7 && person1.getResult() != point)
                {
                    System.out.println("Your rolled a, " + person1.getResult());
                    System.out.print("Press <Enter> to roll...");
                    pause = in.nextLine();
                    person1.rollDice();
                }
                if (person1.getResult() == point)
                {
                    System.out.println("You rolled a " + person1.getResult());
                    System.out.println("You win!");
                }
                else
                {
                    System.out.println("You rolled a 7");
                    System.out.println("You lose");
                }

            }
            System.out.print("Would you like to play Craps (Y/n)?");
            playGame = in.nextLine();
        }
        System.out.println("Goodbye!");
    }
    


}


/* 

COMMENTS FROM THE INSTRUCTOR:

This is a solid version of the game, Kareem, and very cleanly coded.
You should feel free to break this up into a few smaller static methods
to make it even easier to read through. But the gameplay is perfect, and
you did a nice job of implementing the default (Y/n) feature as required.
Outstanding!

SCORE: 15/15

*/

