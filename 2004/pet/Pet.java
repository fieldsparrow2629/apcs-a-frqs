
/**
 * Abstract class Pet class for the 2004 frq
 *
 * @author Erik B.
 * @version 3-15-18
 */
public abstract class Pet
{
    private String myName;
    
    /**
     * a generic pet constructor with a name field
     */
    public Pet(String name)
    { myName = name;
    }
    
    /**
     * @return returns the name of the pet
     */
    public String getName()
    {return myName;
    }
    
    /**
     * @return returns the string the specific pet makes
     */
    public abstract String speak();
}
