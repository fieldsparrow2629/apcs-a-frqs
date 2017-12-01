
/**
 * frq-2010-2-self-divisor
 *
 * @author Erik B.
 * @version 11-30-17
 */
public class SelfDivisor
{
    /**
     * checks if the number can be divisible by each of its digits
     * 
     * @param number the number the method checks
     * @return returns true if the number is divisible by each of its digits
     */
    public static boolean isSelfDivisor(int number)
    {
        int temp = number;
        
        while(temp>0)
        {
            int digit = temp%10;
            if(digit == 0){
                return false;
            }
            
            if(number%digit == 0){
                temp /= 10;
            }
            
            else{
               return false; 
            }
        }
        
        return true;
    }
    
    /**
     * makes a list that is num long and starts checking at number start
     * 
     * @param start the number the method starts checking at
     * @param num the length of the list that stores the self divisible numbers
     * @return returns the list
     */
    public static int[] firstNumSelfDivisors(int start, int num)
    {
        int[] result = new int[num];
        int index = 0;
        
        while(index<num)
        {
            if(isSelfDivisor(start)){
                result[index] = start;
                index ++;
            }
            
            start ++;
        }
        
        return result;
    }
}
