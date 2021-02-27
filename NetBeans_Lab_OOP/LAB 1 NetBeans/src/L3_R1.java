/**
 * Check for Armstrong Number
 */
import java.util.Scanner;

public class L3_R1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0,a,temp, n;
        System.out.println("Enter number to be checked: ");
        n = sc.nextInt();//It is the number to check armstrong
        sc.close();
        temp=n;
        while(n>0)
        {
        a=n%10;
        n=n/10;
        c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("Entered number "+temp+" is an Armstrong number");
        else
            System.out.println("Entered number "+temp+" is not an Armstrong number");
    }
}