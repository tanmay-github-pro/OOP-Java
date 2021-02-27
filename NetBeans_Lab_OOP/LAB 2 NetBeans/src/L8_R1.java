/**
 * Create interface to be implemented by classes - hardware and software
 * Hardware item holds category of item and original manufacturer 
 * Software holds type of software and OS under which it works
 * Calculate total sales for hardware as well as software item recorded for last 3months. 
 */
import java.util.Scanner;

interface shop{
    Scanner sc = new Scanner(System.in);
    void sales();
}
class Hardware implements shop{
    String category, manufacturer;
    Hardware(){
        System.out.print("Enter category: ");
        category = sc.next();
        System.out.print("Enter manufacturer: ");
        manufacturer = sc.next();
    }
    // method of interface shop implemented 
    // access has to be public
    public void sales(){
        System.out.println("Total items of category - "+category+" and"
                + " manufacturer - "+manufacturer+" sold are 98654.");
    }
}
class Software implements shop{
    String type;
    String OS;
    Software(){
        System.out.print("Enter the type of software: ");
        type=sc.next();
        System.out.print("Enter the operating system on which the software runs: ");
        OS=sc.next();
    }
    public void sales(){
        System.out.println("Total software units of type - "+type+" and "
                + "running on "+OS+" operating sytem sold are 16908");
    }
}
public class L8_R1 {
    public static void main(String[] args){
        shop m= new Hardware();
        m.sales();
        m = new Software();
        m.sales();
    }
}
