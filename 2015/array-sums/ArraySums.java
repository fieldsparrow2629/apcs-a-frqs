
/**
 * 2015-1 frq dealing with 1 and 2 demensional arrays
 *
 * @author Erik B. 
 * @version 3-26-18
 */
public class ArraySums
{
    /**
     * returns the sum of an array (or row if in 2D array)
     * 
     * @param arr the array that is being summed
     * @return the sum of the values of the aray
     */
    public static int arraySum(int[] arr)
    {
        int sum = 0;
        
        for(int i: arr)
        {
            sum += i;
        }
        
        return sum;
    }
    
    /**
     * makes an array that contains the sum of each of the rows of the 2d array
     * 
     * @param arr2D the 2D array whose rows are being summed
     * @return returns a new array that contains the sum of the individual rows
     */
    public static int[] rowSums(int[][] arr2D)
    {
        int[] rowSums = new int[arr2D.length];
        
        for(int i = 0; i < rowSums.length; i++)
        {
          rowSums[i] = arraySum(arr2D[i]);    
        }
        
        return rowSums;
    }
    
    /**
     * an array is diverse if none of the rows sum up to the same number
     * 
     * @param arr2D the array whose row sums are being compared
     * @return true if 2D array is diverse, false if it isn't
     */
    public static boolean isDiverse(int[][] arr2D)
    {
       int[] rowSums = rowSums(arr2D); 
        
       for(int i = 0; i < rowSums.length - 1; i++)
       {
         if(rowSums[i] == rowSums[i+1]) return false;   
       }
       
       return true;
    }
    
    /**
     * prints out the elements of an array
     * 
     * @param array the array that is being printed
     */
    public static void toString(int[] array){
        String result = "{";
        for(int i = 0; i < array.length; i++){
            result += array[i];
            if(i != array.length - 1)result += ",";
        }
        result += "}";
        System.out.println(result);
    }
    
    public static void main(String[] args)
    {
       int[] arr1 = {1,3,2,7,3};
       int[] row0 = {1,3,2,7,3};
       int[] row1 = {10,10,4,6,2};
       int[] row2 = {5,3,5,9,6};
       int[] row3 = {7,6,4,2,1};
       int[][] mat1 = {row0,row1,row2,row3};
       
       System.out.println("Sum of arr1: " + arraySum(arr1)); 
       System.out.print("The sum of each row of arr2D: ");
       toString(rowSums(mat1));
       System.out.println("Mat1 is diverse: " + isDiverse(mat1));
        
    }
}
