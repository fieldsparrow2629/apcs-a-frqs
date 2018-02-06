
/**
 * Tester class for WordList
 *
 * @author Erik B.
 * @version 2-5-18
 */
import java.util.ArrayList;
public class WordListTester
{
    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("cat");
        list1.add("mouse");
        list1.add("rat");
        list1.add("bird");
        list1.add("dog");
        list1.add("dog");
        
        WordList l1 = new WordList(list1);
        
        System.out.println(l1.numWordsOfLength(3));
        l1.removeWordsofLength(3);
        l1.printString();
    }
}
