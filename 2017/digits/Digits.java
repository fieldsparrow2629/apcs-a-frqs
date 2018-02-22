
/**
 * 2017 frq 1 Digits
 *
 * @author Erik B.
 * @version 2-22-18
 */
import java.util.ArrayList;
public class Digits
{
    private ArrayList<Integer> digitList; 

    /**
     * Constructor for objects of class Digits
     */
    public Digits(int num)
    {
        this.digitList = new ArrayList<Integer>();
        ArrayList<Integer> digits = this.digitList;
        
        if(num == 0)digits.add(0);
        
        while(num > 0)
        {
           int digit = num%10; 
           digits.add(0,digit);
           num /= 10;
        }
    }

    /**
     * determines whether the number is increasing from left to right 
     * digit by digit
     * @return returns true or false if its increasing or not   
     */
    public boolean isStrictlyIncreasing()
    {
        ArrayList<Integer> digits = this.digitList;
        
        for(int i = 1; i < digits.size(); i++)
        {
            int current = digits.get(i);
            int prev = digits.get(i-1);
            
            if(current <= prev) return false;
        }
        
        return true;
    }
}
