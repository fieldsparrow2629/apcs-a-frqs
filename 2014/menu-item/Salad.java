
/**
 * Class for the menu item salad
 *
 * @author Erik B.
 * @version 4-12-18
 */
public class Salad implements MenuItem
{
    private String name;
    private double price;
    
    /**
     * Constructor for objects of class Salad
     * 
     * @param name name of the salad
     * @param price price of the salad
     */
    public Salad(String name, double price)
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
