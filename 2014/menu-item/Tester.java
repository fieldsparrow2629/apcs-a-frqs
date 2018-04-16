
/**
 * Tester class for the 2014 frq
 *
 * @author Erik B.
 * @version 4-13-18
 */
public class Tester
{
    public static void main(String[] args)
    {
        Sandwich burger = new Sandwich("Cheeseburger",2.75);
        Sandwich club = new Sandwich("Club Sandwich",2.75);
        Salad spinach = new Salad("Spinach Salad",1.25);
        Salad slaw = new Salad("Coleslaw",1.25);
        Drink soda = new Drink("Orange Soda",1.25);
        Drink capp = new Drink("Cappuccino",3.50);
        
        Trio t1 = new Trio(burger,slaw,soda);
        Trio t2 = new Trio(club,spinach,capp);
        System.out.println(t1.getName());
        System.out.println(t1.getPrice());
        System.out.println();
        System.out.println(t2.getName());
        System.out.println(t2.getPrice());
    }
}
