import java.util.Scanner;

public class nonPrincipleDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m,n,sum=0;
        int [][] a;
        System.out.println("Enter order of matrix:");
        m = sc.nextInt(); n = m;
        a = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                //System.out.print(a[i][n-j]+" ");
                sum+=a[i][j];
            }
        }
        System.out.println("Sum of non Principal diagonal elements is: "+sum);
    }
}
