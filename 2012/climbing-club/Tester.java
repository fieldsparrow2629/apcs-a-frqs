
/**
 * Tester class for the climbInfo
 *
 * @author Erik B.
 * @version 4-17-18
 */
public class Tester
{
    public static void main(String[] args)
    {
        ClimbingClub club = new ClimbingClub();
        
        club.addClimb("John Rock",135);
        club.addClimb("Andy Rock",100);
        club.addClimb("Bill Rock",120);
        
        club.displayClimbs();
    }
}
