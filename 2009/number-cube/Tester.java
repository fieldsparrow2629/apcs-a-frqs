
/**
 * Tester class for 2009 frq NumberCube
 *
 * @author Erik B.
 * @version 2-13-18
 */
public class Tester
{
    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
        int[] values = new int[numTosses];
        
        for(int i = 0; i < values.length; i++)
        {
            values[i] = cube.toss();
        }
        
        return values;
    }
    
    public static int getLongestRun(int[] values)
    {
        int index = -1;
        int longest = 1;
        
        for(int i = 0; i < values.length; i++)
        {
            int runLen = 1;
            int start = i;
            
            for(int j = i; j< values.length - 1; j++)
            {
                if(values[j] == values[j+1]) runLen ++;
                else{
                    i = j;
                    break;
                }
            }
            
            if(runLen > longest)
            {
                longest = runLen;
                index = start;
            }
        }
        
        return index;
    }
    
    public static void main(String[] args)
    {
        NumberCube cube = new NumberCube();
        
        int[] tosses = getCubeTosses(cube, 8);
        
        System.out.print("List: ");
        for(int i: tosses){
            System.out.print(i);
        }
        
        System.out.println();
        
        System.out.println("Index of longest run: " + getLongestRun(tosses));
        
        
    }
}
