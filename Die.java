
/**
 * This will create the dice that will be used in the Craps program
 *
 * @author Kareem Ansari
 * @version 2021-2-7
 */
public class Die
{
    // instance variables 
    private int dice1;
    private int dice2;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        dice1 = 0;
        dice2 = 0;
    }

    /**
     * rolls dice
     *
     * 
     * 
     */
    public void rollDice()
    {
        dice1 = ((int)(Math.random() * 6) + 1);
        dice2 = ((int)(Math.random() * 6) + 1);
    }
    /**
     * @return sum of dice
     */
    public int getResult()
    {
        return (dice1 + dice2);
    }
}
