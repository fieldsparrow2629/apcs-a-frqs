
/**
 * Write a description of class ClimbingClub here.
 *
 * @author Erik B.
 * @version 4-16-18
 */
import java.util.ArrayList;
import java.util.List;
public class ClimbingClub
{
    private List<ClimbInfo> climbList;

    /**
     * Constructor for objects of class ClimbingClub
     */
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  climbTime times it takes to complete climb
     * @param peakName name of the peak
     */
    public void addClimb(String peakName, int climbTime)
    {
        
        ClimbInfo climb = new ClimbInfo(peakName, climbTime);
        
        
        //B
        
        for(int i = 0; i < this.climbList.size(); i ++){
            String n1 = climb.getName();
            String n2 = this.climbList.get(i).getName();
            
            if(n1.compareTo(n2) <= 0){
                this.climbList.add(i,climb);
                return;
            }
        }
        this.climbList.add(climb);
    }
    
    public void displayClimbs(){
        for(ClimbInfo i: this.climbList){
            System.out.println(i.getName() + ":" + i.getTime());
        }
    }
}
