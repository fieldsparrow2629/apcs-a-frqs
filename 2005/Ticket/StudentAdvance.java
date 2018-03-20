
/**
 * Write a description of class StudentAdvance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentAdvance extends Advance
{
    private int days;
    
    public StudentAdvance(int days){
        super(days);
    }
    
    public double getPrice()
    {
        double price = super.getPrice();
        return price/2;
    }
    
    public String toString()
    {
        
       return super.toString() + " (Student ID required)"; 
    }
}
