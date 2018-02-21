
/**
 * Tester class for cookieorder frq
 *
 * @author Erik B.
 * @version 2-20-18
 */
public class Tester
{
    public static void main(String[] args)
    {
        CookieOrder order1 = new CookieOrder("Chocolate Chip",1);
        CookieOrder order2 = new CookieOrder("Shortbread",5);
        CookieOrder order3 = new CookieOrder("Macaroon",2);
        CookieOrder order4 = new CookieOrder("Chocolate Chip",3);
        
        MasterOrder masterOrder = new MasterOrder();
        
        masterOrder.addOrder(order1);
        masterOrder.addOrder(order2);
        masterOrder.addOrder(order3);
        masterOrder.addOrder(order4);
        
        System.out.println("Number of Boxes: " + masterOrder.getTotalBoxes());
        
        System.out.println("Removed: " + masterOrder.removeVariety("Chocolate Chip"));
        
        System.out.println("Number of Boxes: " + masterOrder.getTotalBoxes());
    }
}
