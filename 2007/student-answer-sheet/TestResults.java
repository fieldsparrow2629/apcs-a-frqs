
/**
 * 2007 frq student answer sheet
 *
 * @author Erik B.
 * @version 2-8-18
 */
import java.util.ArrayList;
public class TestResults
{
    private ArrayList<StudentAnswerSheet> sheets;
    
    /**
     * Constructor for objects of class TestResults
     * an array list of individual student asnwer sheets
     */
    public TestResults(ArrayList<StudentAnswerSheet> sheets)
    {
        this.sheets = sheets;
    }

    /**
     * runs throught an array list of answersheet objects and returns the name of the
     * student who scored the highest
     *
     * @param  key the answer key the answersheet is graded from
     * @return returns the name of the highest scoring student
     */
    public String highestScoringStudent(ArrayList<String> key)
    {
        ArrayList<StudentAnswerSheet> sheets = this.sheets;
        
        String name = "";
        double highest = sheets.get(0).getScore(key);
        
        for(StudentAnswerSheet s: sheets)
        {
            double score = s.getScore(key);
            
            if(score >= highest){
                highest = score;
                name = s.getName();
            }
        }
        
        return name;
    }
}
