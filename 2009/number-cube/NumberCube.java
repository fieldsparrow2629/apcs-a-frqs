
/**
 * 2009 frq NumberCube
 *
 * @author Erik B.
 * @version 2-13-18
 */
import java.util.Random;
public class NumberCube
{
    public NumberCube(){}
    
    public int toss()
    {
        Random random = new Random();
        int num = random.nextInt(7);
        return num;
    }
}
