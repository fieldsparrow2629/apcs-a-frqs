
/**
 * MasterOrder class for the cookie frq
 *
 * @author Erik B.
 * @version 2-14-18
 */
import java.util.ArrayList;
public class MasterOrder
{
    private ArrayList<CookieOrder> orders;
    
    /**
     * constructs an object that is an array list of cookie orders
     */
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }
    
    /**
     * adds a cookie order to the master order
     * @param theOrder the cookie order thats added to the master order
     */
    public void addOrder(CookieOrder theOrder)
    {
        this.orders.add(theOrder);
    }
    
    /**
     * returns the total number of boxes in the master order
     * 
     * @return the number of boxes
     */
    public int getTotalBoxes()
    {
        int num = 0;
        
        for(CookieOrder i: this.orders)
        {
            num += i.getNumBoxes();
        }
        
        return num;
    }
    
    /**
     * loops through maser order removing any of the orders that are the given
     * variety
     * 
     * @param cookieVar the type of cookie that will be removed
     * @return numRemoved the number of boxes removed
     */
    public int removeVariety(String cookieVar)
    {
        int numRemoved = 0;
        ArrayList<CookieOrder> orders = this.orders;
        
        for(int i = orders.size() - 1; i >= 0; i--)
        {
            String variety = orders.get(i).getVariety();
            int num = orders.get(i).getNumBoxes();
            
            if(variety.equals(cookieVar))
            {
                orders.remove(i);
                numRemoved += num;
            }
        }
        
        return numRemoved;
    }
}
