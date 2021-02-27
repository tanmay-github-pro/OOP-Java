/**
 * Program to handle ArrayOverflowException 
 */
import java.util.Scanner;

class L10_R8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a1[] = new int[10];
        int a2[] = new int[6];
        System.out.println("Enter numbers in array1: ");
        // Taking numbers as input to store in array1(a1) which is array with larger capacity
        for(int i=0; i<a1.length; i++)
            a1[i] = sc.nextInt();
            
        try{
            // Giving numbers from array1(a1) to array2(a2)-smaller sized array
            for (int i=0; i<a1.length; i++)
                a2[i] = a1[i];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Transferring all elements of array1(size10) to array2(size6)");
            System.out.println("Array Overflow!");
            System.out.println("Elemens from array1 actually transferred to array2");
            for (int i=0; i<a2.length; i++)
                System.out.print(a2[i]+" ");
            System.out.println();
        }
        finally{
            System.out.println("Used \"finally\" keyword in code");
        }
    }
}
