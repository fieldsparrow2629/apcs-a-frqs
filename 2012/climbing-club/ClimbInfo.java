
/**
 * 2012 FRQ climbing club
 *
 * @author Erik B.
 * @version 4-16-18
 */
public class ClimbInfo
{
    private String peakName;
    private int climbTime;

    /**
     * Constructor for objects of class ClimbInfo
     * 
     * @param peakName name of the mountain peak
     * @param climbTime number of minutes to complete the climb
     */
    public ClimbInfo(String peakName, int climbTime)
    {
        this.peakName = peakName;
        this.climbTime = climbTime;
    }

    /**
     * @return returns the name of the mountain
     */
    public String getName()
    {
        return this.peakName;
    }
    
    /**
     * @return returns the time it takes to complete climb
     */
    public int getTime()
    {
        return this.climbTime;
    }
}
