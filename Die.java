
/**
 * This will create the dice that will be used in the Craps program
 *
 * @author Kareem Ansari
 * @version 2021-2-7
 */
public class Die
{
    // instance variables - replace the example below with your own
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void rollDice()
    {
        dice1 = ((int)(Math.random() * 6) + 1);
        dice2 = ((int)(Math.random() * 6) + 1);
    }
    public int getResult()
    {
        return (dice1 + dice2);
    }
}
