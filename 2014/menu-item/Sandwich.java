
/**
 * A class for the sandwich item 
 *
 * @author Erik B.
 * @version 4-12-18
 */
public class Sandwich implements MenuItem
{
    // instance variables - replace the example below with your own
    private String name;
    private double price;
    
    /**
     * Constructor for objects of class Sandwich
     * 
     * @param name the name of the sandwich
     * @param price the price of the sandwich
     */
    public Sandwich(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
}
