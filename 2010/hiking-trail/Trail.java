
/**
 * frq-2010-hiking-trail
 *
 * @author Erik B.
 * @version 11-29-17
 */
import java.lang.Math;
public class Trail
{
    
    private int[] markers;
    
    public Trail(int[] markers){
        this.markers = markers;
    }
    
    /**
     *determines if the trail is level between a starting and ending index
     *trail is level if highes and lowest point have a diference of less than 11
     *
     *@param start the index to start checking if the trail is leve
     *@param end the index of the trail where the function will stop checking if level
     *@return returns true if it is level, false if it is not
     */
    public boolean isLevelTrailSegment(int start,int end)
    {
        int max = markers[start];
        int min = markers[start];
        
        for(int n = start; n <= end; n++)
        {
            if(markers[n] > max){
               max = markers[n]; 
            }
            
            if(markers[n] < min){
               min = markers[n]; 
            }
        }
        
        return (max - min) < 11;
    }
    
    /**
     * determines if a trail is dificult
     * counts the number of steep parts, if there is an increase of 30 between 2 inexes
     * difcult if there are 3 or more steep parts
     *
     * @return returns true if the trail is dificult
     */
    public boolean isDifficult()
    {
        int steepParts = 0;
        
        for(int n = 0; n < markers.length - 1; n++)
        {
            if(Math.abs(markers[n] - markers[n+1]) >= 30){
                steepParts ++; 
            }
        }
        
        return steepParts >= 3;
    }
}
