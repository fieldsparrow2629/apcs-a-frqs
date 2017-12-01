
/**
 * tester for the SelfDivisor class
 *
 * @author Erik B.
 * @version 11-30-17
 */
public class SelfDivisorTester
{
    public static void main(String args[])
    {
        System.out.println("128 is a self divisor: " + SelfDivisor.isSelfDivisor(128));
        System.out.println("26 is a self divisor: " + SelfDivisor.isSelfDivisor(26));
        
        int[] n1 = SelfDivisor.firstNumSelfDivisors(10,3);
        
        for(int n = 0; n < n1.length; n++)
        {
            System.out.print(n1[n] + " ");
        }
    }
}
