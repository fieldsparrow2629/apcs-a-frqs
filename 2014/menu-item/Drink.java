
/**
 * Write a description of class Drink here.
 *
 * @author Erik B. 
 * @version 4-12-18
 */
public class Drink implements MenuItem
{
    private String name;
    private double price;
    
    /**
     * Constructor for objects of class Drink
     * 
     * @param name name of the drink
     * @param price price of the drink
     */
    public Drink(String name, double price)
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
