
/**
 * Array test frq
 *
 * @author Erik B.
 * @version 11-27-17
 */
public class CollegeGroup
{
    private College[] myColleges; 
    
    /**
     * creates an object that containts the field myColleges which is a list
     * of objects of colleges
     * 
     * @param collegeList the list of colleges that the object will contain
     */
    public CollegeGroup(College[] collegeList)
    {
        this.myColleges = collegeList;
        
    }
    
    /**
     * sets the college's tuition to a new tuition cost
     * 
     * @param collegeName the college whos tuition is being changed
     * @param newTuition the new cost of tuition
     */
    public void updateTuition(String collegeName, int newTuition)
    {
        for(int n = 0; n < myColleges.length; n++){
            if(myColleges[n].getName().equals(collegeName)){
                myColleges[n].setTuition(newTuition);
            }
        }
    }
    
    /**
     * counts the number of colleges whos cost is between high and low and is in the specified region
     * then creates a list of only these colleges
     * 
     * @param region the region of which the colleges are being selected for the new list
     * @param low the lowest cost of tuition that the new list of colleges will include
     * @param the highest cost of tuition that the new list of colleges will include
     * @return returns the new list of colleges
     */
    public College[] getCollegeList(String region, int low, int high)
    {
        int count = 0; 
        for(int n = 0; n < myColleges.length; n ++){
            if(myColleges[n].getRegion().equals(region) && myColleges[n].getTuition() >= low && myColleges[n].getTuition() <= high){
                count ++;
            }
        }
        
        College[] result = new College[count];
        
        int i = 0;
        for(int n = 0; n < myColleges.length; n ++){
            if(myColleges[n].getRegion().equals(region) && myColleges[n].getTuition() >= low && myColleges[n].getTuition() <= high){
                result[i] = myColleges[n];
                i += 1;
            }
        }
        
        return result;
    }
    
    /**
     * prints off the name of each college in the list
     */
    public void displayList()
    {
      for(int n = 0; n < myColleges.length; n++){
          System.out.print(myColleges[n].getName());
          if(n!= myColleges.length - 1){
              System.out.print(",");
            }
        }
    }
}
