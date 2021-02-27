/**
 * count number of objects created
 */
import java.util.Scanner;

class obj
{
    String objName;
    // static integer type is used so that counter retains value each time a 
    // new object is created
    private static int count=0;
    // objects are being counted in the constructor as soon as they are created
    obj(){
        count++;
    }
    void displayObjCount(){
        /* count - 1 used because an extra object that has not been created by
           the user is being created to invoke this method 
        */
        System.out.println("Total number of objects created are "+(count-1));
    }
}
public class L7_R2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        char ch;
        do{
            //create 1 object by default
            obj a = new obj();
            System.out.println("Object Created");
            System.out.print("Do you want to create another object(y/n): ");
            // storing user response as character
            ch = sc.next().charAt(0);
        }while(ch != 'n'); //check if user wants to create more objects
        // creating an object to invoke displayObjCount method
        obj a = new obj();
        a.displayObjCount(); //method to display objects
    }
}
