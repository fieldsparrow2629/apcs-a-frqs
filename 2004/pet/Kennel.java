
/**
 * class for an array list of pets
 *
 * @author Erik B.
 * @version 3-15-18
 */
import java.util.ArrayList;
public class Kennel
{
    private ArrayList<Pet> petList;
    
    /**
     * creates an object which is an array list of pets
     */
    public Kennel(ArrayList petList)
    {
        this.petList = petList; 
    }
    
    /**
     * loops through the kennel list and makes each animal speak
     */
    public void allSpeak()
    {
        for (Pet p: petList)
        {
            System.out.println(p.getName() + ": " + p.speak());        
        }
    }
}
