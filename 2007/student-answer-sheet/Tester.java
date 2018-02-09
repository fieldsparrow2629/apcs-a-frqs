
/**
 * tests the student answer sheet frq classes
 *
 * @author Erik B.
 * @version 2-8-18
 */
import java.util.ArrayList;
public class Tester
{
    public static void main(String[] args)
    {
       ArrayList<String> key = new ArrayList<String>(); 
       key.add("a");
       key.add("b");
       key.add("a");
       key.add("d");
       key.add("c");
       
       ArrayList<String> sheet1 = new ArrayList<String>();
       sheet1.add("a");
       sheet1.add("c");
       sheet1.add("d");
       sheet1.add("e");
       sheet1.add("?");
        
       ArrayList<String> sheet2 = new ArrayList<String>();
       sheet2.add("a");
       sheet2.add("b");
       sheet2.add("a");
       sheet2.add("d");
       sheet2.add("a");
       
       ArrayList<String> sheet3 = new ArrayList<String>();
       sheet3.add("b");
       sheet3.add("b");
       sheet3.add("b");
       sheet3.add("b");
       sheet3.add("b");
       
       //creates the answer sheet objects
       StudentAnswerSheet s1 = new StudentAnswerSheet(sheet1, "Billy");
       StudentAnswerSheet s2 = new StudentAnswerSheet(sheet2, "Rob");
       StudentAnswerSheet s3 = new StudentAnswerSheet(sheet3, "Steve");
       
       ArrayList<StudentAnswerSheet> results = new ArrayList<StudentAnswerSheet>();
       results.add(s1);
       results.add(s2);
       results.add(s3);
       
       //creates object of an arraylist of answersheet objects
       TestResults resultList = new TestResults(results);
       
       System.out.print(resultList.highestScoringStudent(key));
    }
}
