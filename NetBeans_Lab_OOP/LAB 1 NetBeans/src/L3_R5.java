/**
 * Search value in array
 */
import java.util.*;

public class L3_R5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[], n, searchValue;
        //int a[] = {1,2,3,4,5,1,2,6,8,1,9,43,65};
        System.out.println("Enter size of array: ");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter values in array:");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter value to be searched: ");
        searchValue = sc.nextInt();
        //sc.close();
        System.out.print("The value is found at index: ");
        /* declaring i to keep track of index because 
            for each loop can't keep track of index
         */
        int i = 0;
        //implementing using for each loop instead of traditional for loop
        for(int x: a){ 
            if(x==searchValue){
                System.out.print(i);
                System.out.print(", ");
            }
            i++;
        }
        /*for(int i=0; i<n; i++){
            if(a[i]==searchValue){
                System.out.print(i);
                System.out.print(", ");
            }
        }*/    
        System.out.println();

    }
}