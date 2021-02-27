/**
 * User defined exception class which displays error message
 */
import java.util.Scanner;

class customError extends Exception{
    public String toString(){
        return "Custom error";
    }
}

public class L10_R10{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        try{
            System.out.println("Throw error?(y/n)");
            char n= sc.next().charAt(0);
            if(n!='n')
                throw new customError();
            System.out.println("No Error Thrown!!!");
        }
        catch(customError e){
            System.out.println(e);
        }
    }
}
