
/**
 * Write a description of class Advance here.
 *
 * @author Erik B.
 * @version 3-19-18
 */
public class Advance extends Ticket
{
   private int days;
   
   public Advance(int days){
       this.days = days;
   }
   
   public double getPrice()
   {
       if(this.days > 9) return 30.00;
        
       else return 40.00;
   }
   
   public String toString()
   {
       return super.toString();
   }
}
