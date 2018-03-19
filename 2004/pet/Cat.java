
/**
 * cat class that extends the pet class
 *
 * @author Erik B. 
 * @version 3-19-18
 */
public class Cat extends Pet
{
    /**
     * cat object that send name up to the pet class
     */
    public Cat(String name)
    {
        super(name);
    }
    
    /**
     * @return returns what the cat says
     */
    public String speak()
    {
        return "meow";
    }
}
