/**
 * Display non Principal diagonal elements and find their sum
 */
import java.util.Scanner;

public class L4_R1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        int m,n,sum=0;
        int [][] a;
        System.out.print("Enter size of matrix(row x column):");
        m = sc.nextInt(); n = sc.nextInt();
        a = new int[m][n];
        System.out.println("Enter elements in matrix:");
	    for(int i=0;i<m;i++){
		  for(int j=0;j<n;j++){
			a[i][j]=sc.nextInt();
		  }
	    }
	    System.out.println("Non Principal Diagonal elements are:");
		for(int i=0;i<m;i++){
		  if((n-i-1)>=0){
			System.out.print(a[i][n-i-1]+" ");
			sum+=a[i][n-i-1];
		  }
		}
		System.out.println("");
		sc.close();
		System.out.println("Sum of non Principal diagonal elements is: "+sum);
    }
}

