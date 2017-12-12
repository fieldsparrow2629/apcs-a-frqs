
/**
 * Tester class for Phrase
 *
 * @author Erik B.
 * @version 12-11-17
 */
public class PhraseTester
{
    public static void main(String args[])
    {
        Phrase p1 = new Phrase("A cat ate late.");
        p1.replaceNthOccurrence("at", 1, "rane");
        System.out.println(p1);
        
        Phrase p2 = new Phrase("A cat ate late.");
        p2.replaceNthOccurrence("at", 6, "xx");
        System.out.println(p2);
        
        Phrase p3 = new Phrase("A cat ate late.");
        p3.replaceNthOccurrence("bat", 2, "xx");
        System.out.println(p3);
        
        Phrase p4 = new Phrase("aaaa");
        p3.replaceNthOccurrence("aa", 1, "xx");
        System.out.println(p4);
        
        Phrase p5 = new Phrase("aaaa");
        p5.replaceNthOccurrence("aa",2,"bbb");
        System.out.println(p5);
        
    }
}
