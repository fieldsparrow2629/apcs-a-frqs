
/**
 * Write a description of class Tester here.
 *
 * @author Erik B. 
 * @version 3-21-18
 */
public class Tester
{
    public static void main(String[] args)
    {
       Vehicle car1 = new Vehicle(0.1,20000.00,2500.00);
       
       System.out.println("Car1");
       System.out.println("List price: " + car1.getListPrice()); 
       System.out.println("Purchase price: " + car1.purchasePrice());   
       System.out.println();
       
       System.out.println("Changed markup to $1000.00.");
       System.out.println();
       car1.changeMarkup(1000.00);
       
       System.out.println("Car1");
       System.out.println("List price: " + car1.getListPrice()); 
       System.out.println("Purchase price: " + car1.purchasePrice());
        
    }
}
