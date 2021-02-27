/**
 * four function calculator
 */

import java.util.Scanner;
public class L2_R5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        float ans;
        char op; char repeat;
        do{
            System.out.println("Enter Operand 1: ");
            a = sc.nextInt();
            System.out.println("Enter Operand 2: ");
            b = sc.nextInt();
            System.out.print("Enter Operation to be performed(+,-,*,/): ");
            op = sc.next().charAt(0);
            ans = compute(a, b, op);
            System.out.println(a+" "+op+" "+b+" = "+ans);
            System.out.println("Do you want to do another calculation(y/n):");
            repeat = sc.next().charAt(0);
            }while(repeat!='n');
            sc.close();
    }

    private static float compute(int a, int b, char op){
        int ans = 0;
        switch(op){
            case '+':
                ans = a+b;
                break;
            case '-':
                ans = a-b;
                break;
            case '*':
                ans = a*b;
                break;
            case '/':
                ans = a/b;
                break;
            default:
                System.out.println("Operator not correct!");
                break;
        }
        return ans;
    }
}
