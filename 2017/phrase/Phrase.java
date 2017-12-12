
/**
 * 2017-frq-Phrase
 *
 * @author Erik B.
 * @version 12-8-17
 */
public class Phrase
{
    private String currentPhrase;

    /**
     * Constructor for objects of class Phrase
     */
    public Phrase(String P)
    {
        currentPhrase = P;
    }

    /**
     * finds the nth occurence of a str within a string 
     *
     * @param str the string the function is searching for
     * @param n the nth occurence of the string
     * @return will return the index of the nth occurence of the string
     */
    public int findNthOccurrence(String str, int n)
    {
        int occurences = 0;
        int start = 0;
        
        while(true){
            int index = currentPhrase.indexOf(str,start);
            
            if(index == -1){
                break;
            }
            
            else{
               occurences += 1;
               start = index + 1;
            }
            
            if(occurences == n){
                return index;
            }
        }
        
        return -1;
    }
    
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        int occurrence = findNthOccurrence(str,n);
        
        if(occurrence != -1){
            String beg = currentPhrase.substring(0,occurrence);
            String mid = repl;
            String end = currentPhrase.substring(occurrence + str.length());
            
            currentPhrase = beg;
            currentPhrase += mid;
            currentPhrase += end;
        }
        
    }
    
    public int findLastOccurrence(String str)
    {
        int n = 1;
        
        while(true){
           int last = findNthOccurrence(str,n);
           
           if(last == -1){
               break;
           }
           
           else{
              n ++; 
           } 
        }
        
        if(n == 1){
            return -1;
        }
        else{
            return findNthOccurrence(str,n-1);
        }
        
    }
    
    public String toString()
    {
        return currentPhrase;
    }
}
