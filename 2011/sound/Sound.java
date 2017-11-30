
/**
 * frq-2011-2-sound
 *
 * @author Erik B.
 * @version 11-14-17
 */
public class Sound
{
    private int[] samples;
    
    public Sound(int[] samples)
    {
        this.samples = samples;
        
    }
    
    /**
     * changs those values in this sound that hava an amp greater than limit
     * values greater than limit are changed to limit
     * values less than -limit are chagned to -limit
     * 
     * @param limit the amplitude limit
     * @return the number of values that his method changed
     */
    public int limitAmplitude(int limit)
    {
        int count = 0;
        
        for(int n = 0; n < samples.length; n ++){
            if(n>limit){
                this.samples[n] = limit;
                count ++;
            }
            if(n < -1*limit){
                this.samples[n] = -1*limit;
                count ++;
            }
        }
        
        return count;
    }

    /**
     * removes all the zeros from the beginning of the array
     * changes samples so that all the zeros are trim from the beginning
     * 
     */
    public void trimSilenceFromBeginning()
    {
        int n = 0; 
        while(this.samples[n] == 0){
            n++;   
        }
        
        int[] result = new int[this.samples.length - n];
        
        for(int i = 0; i < result.length; i ++){
            result[i] = this.samples[i+n];
        }
        
        this.samples = result;
    }
    
    public void displayArray(){
        for(int i = 0; i < this.samples.length; i ++){
            System.out.print(this.samples[i] + ",");
        }
        
    }
}
