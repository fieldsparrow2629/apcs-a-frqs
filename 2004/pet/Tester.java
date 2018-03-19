
/**
 * tester class for kennel
 *
 * @author Erik B.
 * @version 3-19-18
 */
import java.util.ArrayList;
public class Tester
{
    public static void main(String[] args)
    {
        Pet fido = new Dog("Fido");
        Pet rex = new LoudDog("Rex");
        Pet spot = new Cat("Spot");
        
        ArrayList<Pet> list = new ArrayList();
        list.add(fido);
        list.add(rex);
        list.add(spot);
        
        Kennel k1 = new Kennel(list);
        k1.allSpeak();
        
    }
}
