
/**
 * 2004-1 WordList
 *
 * @author Erik B.
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class WordList
{
    // instance variables - replace the example below with your own
    private ArrayList<String> myList;

    /**
     * Constructor for objects of class WordList
     */
    public WordList(ArrayList<String> myList)
    {
        this.myList = myList;
    }

    /**
     * returns the number of words in this WordList that are exactly len letters long
     *
     * @param len the number of letters a word must have to count
     * @return  returns the number of words with len letters
     */
    public int numWordsOfLength(int len)
    {
        int count = 0;
        
        
        for(int i = 0; i < this.myList.size(); i++){
            String word = this.myList.get(i);
            if(word.length() == len){
                count ++;
            }
        }
        
        return count;
    }
    
    /**
     * removes elemements of the arraylist that are exactly len letters long
     * 
     * @param len the length of the words that should be removed
     */
    public void removeWordsofLength(int len)
    {
        for(int i = this.myList.size() - 1; i >= 0; i--)
        {
            String word = this.myList.get(i);
            if(word.length() == len)
            {
                this.myList.remove(i);
            }
        }
    }
    
    /**
     * prints the elements of the arraylist
     */
    public void printString()
    {
        System.out.println(this.myList);
    }
}
