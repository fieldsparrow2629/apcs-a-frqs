
/**
 * Tester class for digits
 *
 * @author Erik B.
 * @version 2-22-18
 */
public class Tester
{
    public static void main(String[] args)
    {
        Digits num1 = new Digits(1345);
        Digits num2 = new Digits(153);
        Digits num3 = new Digits(12344);
        
        System.out.println("Strictly Increasing");
        System.out.println("1345: " + num1.isStrictlyIncreasing());
        System.out.println("153: " + num2.isStrictlyIncreasing());
        System.out.println("12344: " + num3.isStrictlyIncreasing());
    }
}
