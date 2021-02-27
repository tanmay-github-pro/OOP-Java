// Program to create, display and perform operations on an array
// Operations performed on the array: sum of elements, largest element in array
package Array;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int a[]; int n, sum=0, largest, ser, flag=0, pos=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = scanner.nextInt();
        a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)
            a[i] = scanner.nextInt();
        printArray(a, n);
        System.out.println("The length of the array is: "+a.length);
        for(int i=0; i<n; i++)
            sum+=a[i];
        System.out.println("The sum of all the elements in the array is: " + sum);
        largest = a[0];
        for(int i=1; i<n; i++)
        {
            if(largest<a[i])
                largest = a[i];
        }
        System.out.println("The largest element in the array is: "+largest);
        System.out.print("Enter element to be found in array: ");
        ser = scanner.nextInt();
        scanner.close();
        for(int i=0; i<n; i++)
        {
            if(a[i]==ser){
            flag = 1;
            pos = i+1;
            break;
            }
        }
        if(flag==1)
            System.out.println("Element "+ser+" is found at position "+pos);
        else
            System.out.println("Element "+ser+" is not found in the array.");
    }

    private static void printArray(int[] a, int n) {
        System.out.println("The array that you entered is:");
        for(int i=0; i<n; i++)
            System.out.print(a[i]+"\t");
        System.out.println("\n");
    }    
}