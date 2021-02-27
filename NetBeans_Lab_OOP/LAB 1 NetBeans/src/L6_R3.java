/**
 * Base class called Bank that provides functionality to get rate of interest 
 * Rate of interest varies according to banks  
 * E.g. SBI, ICICI and AXIS banks provide 8%, 7% and 9% rate of interest
 */
import java.util.Scanner;
class Bank{
    int interest=10;
    Scanner scan= new Scanner(System.in);
    int getRateOfInterest(){
        return interest;
    }
}
class SBI extends Bank{
    SBI(){
        interest=8;
    }
    int getRateOfInterest(){
        return interest;
    }
}
class ICICI extends Bank{
    ICICI(){
        interest=7;
    }
    int getRateOfInterest(){
        return interest;
    }
}
class AXIS extends Bank{
    AXIS(){
        interest=9;
    }
    int getRateOfInterest(){
        return interest;
    }
}

public class L6_R3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Bank b= new Bank();
        SBI s= new SBI();
        ICICI i= new ICICI();
        AXIS a= new AXIS();
        System.out.print("Bank for which Interest rate is to be found: ");
        String bank = sc.nextLine();
        switch (bank){
            case "sbi":
                b=s;
                break;
            case "icici":
                b=i;
                break;
            case "axis":
                b=a;
                break;
        }
        System.out.println("Rate of Interest in bank "+bank.toUpperCase()+" is "+b.getRateOfInterest());
    }
}