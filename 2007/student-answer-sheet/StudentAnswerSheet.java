
/**
 * 2007 student answer sheet frq
 *
 * @author Erik B.
 * @version 2-8-18
 */
import java.util.ArrayList;
public class StudentAnswerSheet
{
    // instance variables - replace the example below with your own
    private ArrayList<String> answers;
    private String studentName;

    /**
     * Constructor for objects of class StudentAnswerSheet
     */
    public StudentAnswerSheet(ArrayList<String> answers,String studentName)
    {
        this.answers = answers;
        this.studentName = studentName;
    }

    /**
     * gets the score of of the answer, +1 for correct, -.25 for wrong
     *
     * @param  key the key that the answers are graded off of
     * @return the score of the answer sheet
     */
    public double getScore(ArrayList<String> key)
    {
        double score = 0;
        ArrayList<String> answers = this.answers;
        
        for(int i = 0; i < answers.size(); i++)
        {
            String answer = answers.get(i);
            String correct = key.get(i);
            
            if(answer.equals(correct)) score ++;
            else if(!answer.equals("?")) score = score - 0.25;
        }
        
        return score;
    }
    
    /**
     * @return returns the name of the student
     */
    public String getName()
    {
        return this.studentName;
    }
}
