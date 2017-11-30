
/**
 * college tester
 *
 * @author Erik B.
 * @version 11-27-17
 */
public class Tester
{
    public static void main(String[] args)
    {
        College c1 = new College("Colgate University","Northeast",21025);
        College c2 = new College("Duke University","Southeast",26000);
        College c3 = new College("Kalamazoo College","Midwest",19764);
        College c4 = new College("Stanford University","West",25917);
        College c5 = new College("Florida International University","Southeast",10800);
        College c6 = new College("Dartmouth College","Northeast",27764);
        College c7 = new College("Spelman College","Southeast",11455);
        
        College[] collegeList = {c1,c2,c3,c4,c5,c6,c7};
        
        //creates object called colleges, which is a list of objects of all the colleges
        CollegeGroup colleges = new CollegeGroup(collegeList);
        //creates a diferent object with a list of all the colleges from getCollgeList
        CollegeGroup updatedList = new CollegeGroup(colleges.getCollegeList("Southeast",10000,20000));
        
        colleges.displayList();
        System.out.println();
        updatedList.displayList();
    }
    
}
