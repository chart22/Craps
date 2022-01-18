
/**
 * Die class for craps assignment.
 *
 * @author Charlotte Hart
 * @version 01/11/22
 */
public class Die
{
    private int roll;
    
    public Die()
    {
        roll = rollDie();
    }
    
    public int rollDie()
    {
        roll = (int) (Math.random() * 6 + 1);
        return roll;
    }
    
    public int getDie()
    {
        return roll;
    }
}
