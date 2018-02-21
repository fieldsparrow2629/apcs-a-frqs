
/**
 * 2010 cookie frq
 *
 * @author Erik B.
 * @version 2-14-18
 */
public class CookieOrder
{
    private String variety;
    private int numBoxes;
    
    /**
     * creates a cookie order oject
     * @param variety the type of cookie
     * @param numBoxes the number of boxes in the order
     */
    public CookieOrder(String variety, int numBoxes)
    {
        this.variety = variety;
        this.numBoxes = numBoxes;
    }
    
    /**
     * returns the type of cookies in the order
     */
    public String getVariety()
    {
        return this.variety;
    }
    
    /**
     * returns the number of boxes in the order
     */
    public int getNumBoxes()
    {
        return this.numBoxes;
    }
}
