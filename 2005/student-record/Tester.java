
/**
 * Write a description of class Tester here.
 *
 * @author Erik B.
 * @version 11-14-17
 */
public class Tester
{
    public static void main(String[] args)
    {
        int[] scores1 = {100,89,75,55,78};
        int[] scores2 = {10,89,90,91,92,95,96};
        int[] scores3 = {100,89,75,55,78,78,44,99};
        int[] scores4 = {50,50,20,80,53};
        int[] scores5 = {20,50,50,53,80};
        int[] scores6 = {20,50,50,80};
        
        StudentRecord r1 = new StudentRecord(scores1);
        StudentRecord r2 = new StudentRecord(scores2);
        StudentRecord r3 = new StudentRecord(scores3);
        StudentRecord r4 = new StudentRecord(scores4);
        StudentRecord r5 = new StudentRecord(scores5);
        StudentRecord r6 = new StudentRecord(scores6);
        
        System.out.println(r1.finalAverage());
        System.out.println(r2.finalAverage());
        System.out.println(r3.finalAverage());
        System.out.println(r4.finalAverage());
        System.out.println(r5.finalAverage());
        System.out.println(r6.finalAverage());
        
    }

}
