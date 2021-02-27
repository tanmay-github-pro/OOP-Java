package OOP_Lab_sem3.LAB_1;

/**
 * four function calc
 */

import java.util.Scanner;
public class calc {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, x;
        float ans;
        char op;
        System.out.println("Enter Operand 1: ");
        a = sc.nextInt();
        System.out.println("Enter Operand 2: ");
        b = sc.nextInt();
        System.out.println("Enter Operation to be performed(+,-,*,/): ");
        op = sc.next().charAt(0);
        ans = compute(a, b, op);
        System.out.println(a+" "+op+" "+b+" = "+ans);
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
