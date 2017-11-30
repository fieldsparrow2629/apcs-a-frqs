
/**
 * frq-2011-2-soundTester
 *
 * @author Erik B.
 * @version 11-15-17
 */
public class soundTester
{
    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
          int[] sound1 = {40,2532,17,-2300,-17,-4000,2000,1048,-420,33,15,-32,2030,3223};
          int[] sound2 = {0,0,0,0,-14,0,-35,-39,0,-7,16,32,37,29,0,0};
          
          Sound s1 = new Sound(sound1);
          Sound s2 = new Sound(sound2);
          
          s1.limitAmplitude(2000);
          s2.trimSilenceFromBeginning();
          
          s1.displayArray();
          
    }
}
