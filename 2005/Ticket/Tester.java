
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        Ticket student1 = new StudentAdvance(11);
        Ticket student2 = new StudentAdvance(8);
        
        Ticket person1 = new Advance(17);
        Ticket person2 = new Advance(4);
        
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        
    }
}
