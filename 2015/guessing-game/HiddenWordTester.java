
/**
 * Tester for the hidden word class
 *
 * @author Erik B. 
 * @version 12-6-17
 */
public class HiddenWordTester
{
    public static void main(String args[])
    {
        HiddenWord puzzle = new HiddenWord("HARPS");
        puzzle.getHint("AAAAA");
        puzzle.getHint("HELLO");
        puzzle.getHint("HEART");
        puzzle.getHint("HARMS");
        puzzle.getHint("HARPS");
    }
}
