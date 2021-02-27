/**
 * Add and Multiply two Integer Matrices
 */
import java.util.Scanner;
public class L4_R4{
    public static void main(String args[]){
        int m,n,p,q;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the matrix A(row x column):");
        m=scan.nextInt();n=scan.nextInt();
        System.out.println("Enter the size of the matrix B:");
        p=scan.nextInt(); q=scan.nextInt();
        //for addition
        if(m!=p && n!=q){
            System.out.println("Matrices cannot be added");
        }
        else{
            int a[][]=new int[m][n];
            int b[][]=new int[p][q];
            System.out.println("Enter elements in matrix A:");
            for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                            a[i][j]=scan.nextInt();
                    }
            }
            System.out.println("Enter elements in matrix B:");
            for(int i=0;i<p;i++){
                    for(int j=0;j<q;j++){
                            b[i][j]=scan.nextInt();
                    }
            }
            //closing Scanner
            scan.close();
            int sum[][]=new int[m][q];
                for(int i=0;i<m;i++){
                    for(int j=0;j<q;j++){
                        sum[i][j]+=a[i][j]+b[i][j];
                        }
                }
            //printing sum matrix
            System.out.println("Sum Matrix:");
            for(int i=0;i<m;i++){
                for(int j=0;j<q;j++){
                        System.out.print(sum[i][j]+" ");
                }
                System.out.println();		
            }
            //for multiplication
            if(n!=p){
                System.out.println("Matrices cannot be multiplied");
            }
            else {
                //c is matrix for multiplication
                int c[][]=new int[m][q];
                for(int i=0;i<m;i++){
                        for(int j=0;j<q;j++){
                                c[i][j]=0;
                                for(int k=0;k<n;k++){
                                        c[i][j]+=a[i][k]*b[k][j];}
                        }
                }
                //printing product matrix
                System.out.println("Product Matrix");
                for(int i=0;i<m;i++){
                        for(int j=0;j<q;j++){
                                System.out.print(c[i][j]+" ");
                        }
                        System.out.println();		
                }
            }
        }
    }
}