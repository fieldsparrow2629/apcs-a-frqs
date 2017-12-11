
/**
 * frq=2015-guessing-game
 *
 * @author Erik B.
 * @version 12-6-17
 */
public class HiddenWord
{
    // instance variables - replace the example below with your own
    private String word;

    /**
     * makes an object that is the hidden word
     * 
     * @param word the word that will be the hidden word
     */
    public HiddenWord(String word)
    {
        this.word = word;
    }

    /**
     * compares your guess to the hidden word
     * if letter is the exact same, the hint will return the letter at that possition
     * if letter is in the hidden word, but not at that possition, fills it in with a "+"
     * if letter is not in the word at all fills in that position with a "*"
     * 
     * @param guess the word you are guessing that compares to the hidden word
     * @return return the string that is a hint of the hidden word
     */
    public String getHint(String guess)
    {
        String hint = "";
        
        for(int n = 0; n < guess.length(); n++){
            String guessLetter = guess.substring(n,n+1);
            String wordLetter = word.substring(n,n+1);
            
            if(guessLetter.equals(wordLetter)){
                hint += guess.substring(n,n+1);
            }
            else if(word.indexOf(guessLetter) != -1){
                hint += "+";
            }
            else{
                hint += "*";
            }
        }
        return hint;
    }
    
    
}
