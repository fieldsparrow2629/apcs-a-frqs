
/**
 * 2006 frq Taxable Item
 *
 * @author Erik B.
 * @version 3-20-18
 */
public abstract class TaxableItem implements Item
{
    private double taxRate;
    
    public abstract double getListPrice();
    
    /**
     * constructor for a taxable item object
     * @param rate the tax rate for the taxable item
     */
    public TaxableItem(double rate)
    {
        taxRate = rate;
    }
    
    /**
     * calculates purchase price by getting the list price of an item, and 
     * multiplying it by the tax rate
     * 
     * @return returns the purchase price of the taxable item
     */
    public double purchasePrice()
    {
        double listPrice = getListPrice();
        double tax = listPrice*taxRate;
        
        return listPrice + tax;
    }
}
