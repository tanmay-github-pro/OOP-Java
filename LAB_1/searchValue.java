import java.util.Scanner;

public class searchValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[], n, searchValue;
        //int a[] = {1,2,3,4,5,1,2,6,8,1,9,43,65};
        System.out.println("Enter size of array: ");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter values in array:");
        for(int i=0; i<n; i++)
            a[i]=sc.nextInt();
        System.out.println("Enter value to be searched: ");
        searchValue = sc.nextInt();
        sc.close();
        System.out.println("The value is found at index: ");
        for(int i=0; i<n; i++){
            if(a[i]==searchValue)
                System.out.print(i+", ");
        }

    }
}