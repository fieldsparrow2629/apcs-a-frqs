
/**
 * Vehicle class extending the taxable item
 *
 * @author Erik B.
 * @version 3-21-18
 */
public class Vehicle extends TaxableItem
{
    private double dealerCost;
    private double dealerMarkup;
    
    /**
     * constructor for the vehicle that also calls the taxable item constructor
     * @param rate the tax rate for the vehicle
     * @param dealerCost how much the dealer charges for the vehicle
     * @param dealerMarkup how much extra the dealer charges
     */
    public Vehicle(double rate,double dealerCost,double dealerMarkup)
    {
       super(rate);
       this.dealerCost = dealerCost;
       this.dealerMarkup = dealerMarkup;
    }
    
    /**
     * @return returns the listing price which is the dealer cost plus markup
     */
    public double getListPrice()
    {
        return this.dealerCost + this.dealerMarkup;
    }
    
    /**
     * changes the markup value to the given value
     * @param newMarkup the new value that the markup will change to
     */
    public void changeMarkup(double newMarkup)
    {
        this.dealerMarkup = newMarkup;
    }
}
