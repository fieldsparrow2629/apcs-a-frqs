
/**
 * College object and its information
 *
 * @author Erik B.
 * @version 11-27-17
 */
public class College
{
    private String name;
    private String region;
    private int tuition;
    
    /**
     * constructs a college object with a name, region and cost of tuition
     * 
     * @param name name of school
     * @param region region of school
     * @param tuition cost of the tuition
     */
    public College(String name, String region, int tuition){
        this.name = name;
        this.region = region;
        this.tuition = tuition;
    }
    
    /**
     * @return returns the name of the college
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * @return return the region of the school
     */
    public String getRegion(){
        return this.region;
    }
    
    /**
     * @return return the tuition cost of the school
     */
    public int getTuition(){
        return this.tuition;
    }
    
    /**
     * changes the tuiton to the new tuition
     * 
     * @param newTuition the tuition cost that you want to change the college to 
     */
    public void setTuition(int newTuition){
        this.tuition = newTuition;    
    }
}
