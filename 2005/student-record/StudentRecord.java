
/**
 * FRQ-2005
 *
 * @author Erik B.
 * @version 11-14-17
 */

public class StudentRecord
{
    private int[] scores;
    
    /**
     * creates the student record object, with the scores field
     * 
     * @param takes in the list of scores
     */
    public StudentRecord(int[] scores)
    {
        this.scores = scores;    
    }
    
    /**
     * takes the average of the list from the first to the last element
     * 
     * @param first takes the first element that it will average
     * @param last the last element the function will average
     * @return returns the average
     */
    private double average(int first,int last)
    {
        double sum = 0.0; 
        
        for(int i = first; i <= last; i ++){
            sum += scores[i];
        }
        
        return sum/(last-first+1);
    }

    /**
     * returns whether or not the list is increasing from left to right
     * 
     * @return returns true if increasing, false if its not
     */
    private boolean hasImproved()
    {
        for(int i = 1; i < scores.length;i++){
            if(scores[i] < scores[i-1]){
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * returns the final average, if its increasing, the average starts at the half way point
     * 
     * @return returns the average of the list2
     */
    public double finalAverage()
    {
        int first = 0;
        int last = scores.length - 1;
        
        if(hasImproved()){
            first = scores.length/2;
        }
        
        return average(first,last);
    }
}