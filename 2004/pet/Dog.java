
/**
 * Write a description of class Dog here.
 *
 * @author Erik B.
 * @version 3-15-18
 */
public class Dog extends Pet
{
    /**
     * creates a dog class and send name up to the pet class
     */
    public Dog(String name)
    {
        super(name);
    }
    
    /**
     * @return returns what the dog says
     */
    public String speak()
    {
        return "bark";
    }
}
