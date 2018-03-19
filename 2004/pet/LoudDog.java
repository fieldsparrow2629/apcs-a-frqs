
/**
 * Write a description of class LoudDog here.
 *
 * @author Erik B.
 * @version 3-16-18
 */
public class LoudDog extends Dog
{
    /**
     * creates a loud dog object that send name up to the dog class
     */
    public LoudDog(String name)
    {
        super(name);
    }
    
    /**
     * @return returns twice of what the dog object says. 
     */
    public String speak()
    {
        return super.speak() + " " + super.speak();
    }
}
