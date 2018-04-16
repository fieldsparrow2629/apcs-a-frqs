
/**
 * Trio class for 2014 frq
 *
 * @author Erik B. 
 * @version 4-13-18
 */
public class Trio
{
    private Sandwich sand;
    private Salad salad;
    private Drink drink;

    /**
     * Constructor for objects of class Trio
     * 
     * @param sand the type of sandwich in the trio
     * @param salad the type of salad in the trio
     * @param drink the type of drink in the trio
     */
    public Trio(Sandwich sand, Salad salad, Drink drink)
    {
        this.sand = sand;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName()
    {
        String sand = this.sand.getName();
        String salad = this.salad.getName();
        String drink = this.drink.getName();
        
        return(sand + "/" + salad + "/" + drink + " Trio");
    }
    
    public double getPrice()
    {
        double pSand = this.sand.getPrice();
        double pSalad = this.salad.getPrice();
        double pDrink = this.drink.getPrice();
        
        double total = pSand + pSalad + pDrink;
        double lowest = Math.min(pSand, Math.min(pDrink,pSalad));
        
        return total - lowest;
    }
}
