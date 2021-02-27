/**
 * numberTable
 */
import java.util.Scanner;
public class numberTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number for which table is to be printed: ");
        n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n+"*"+i+" = "+n*i );
        }
    }
}