
/**
 * tester class for battery charger class
 *
 * @author Erik B.
 * @version 2-21-18
 */
public class Tester
{
    public static void main(String[] args)
    {
        int[] table = {50,60,160,60,80,100,100,120,
                      150,150,150,200,40,240,220,220,
                      200,200,180,180,140,100,80,60};
        
        BatteryCharger b = new BatteryCharger(table);
        
        System.out.println("Optimal Start Hour");
        System.out.println("1 hour: " + b.getChargeStartTime(1));
        System.out.println("2 hour: " + b.getChargeStartTime(2));
        System.out.println("7 hour: " + b.getChargeStartTime(7));
        System.out.println("30 hour: " + b.getChargeStartTime(30));
    }
}
