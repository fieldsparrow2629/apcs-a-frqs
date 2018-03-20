
/**
 * Abstract class Ticket for 2005 frq
 *
 * @author Erik B.
 * @version 3-19-18
 */
import java.util.Random;
public abstract class Ticket
{
    private int serialNumber; 
    
    public Ticket()
    {
        serialNumber = getNextSerialNumber();
    }
    
    public abstract double getPrice();
    
    public String toString()
    {
        return "Number: " + serialNumber + "\n     Price: $" + getPrice();
    }
    
    private static int getNextSerialNumber()
    {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        return num;
    }
}
