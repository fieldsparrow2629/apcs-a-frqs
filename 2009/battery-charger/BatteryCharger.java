
/**
 * 2009 Frq 3 Battery Charger
 *
 * @author Erik B.
 * @version 2-21-18
 */
public class BatteryCharger
{
    private int[] rateTable;
    
    public BatteryCharger(int[] rateTable)
    {
        this.rateTable = rateTable;
    }
    
    private int getChargingCost(int startHour, int chargeTime)
    {
        int cost = 0;
        
        int chargeLeft = chargeTime;
        int hour = startHour;
        
        while(chargeLeft > 0)
        {
           if(hour > 23) hour = 0; 
           
           cost += this.rateTable[hour];
           hour++;
           chargeLeft--;
        }
        
        return cost;
    }
    
    public int getChargeStartTime(int chargeTime)
    {
        int optCost = getChargingCost(0,chargeTime);
        int optHour = 0;
        
        for(int i = 0; i < this.rateTable.length; i++)
        {
            int periodCost = getChargingCost(i,chargeTime);
            
            if(periodCost <= optCost)
            {
                optCost = periodCost;
                optHour = i;
            }
        }
        
        return optHour;
    }
   
}
