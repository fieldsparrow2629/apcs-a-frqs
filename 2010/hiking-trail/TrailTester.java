
/**
 * tester for the Trail class
 *
 * @author Erik B.
 * @version 11-29-17
 */
public class TrailTester
{
    public static void main(String args[])
    {
        int[] m1 = {100,150,105,120,90,80,50,75,75,70,80,90,100};
        Trail t1 = new Trail(m1);
        
        System.out.println("Level from 7 to 10: " + t1.isLevelTrailSegment(7,10));
        System.out.println("Level from 2 to 12: " + t1.isLevelTrailSegment(2,12));
        System.out.println("Difficult: " + t1.isDifficult());
    }
}
