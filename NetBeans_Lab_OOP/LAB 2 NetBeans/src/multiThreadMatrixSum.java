/**
 * Compute sum of each row of matrix in different threads
 * Compute final sum of all elements in main thread
 */
import java.util.Scanner;

class MyThread extends Thread
{
    Thread t1;
    int[] arr;
    int rowSum=0;
    // x is to name the thread
    MyThread(int a[], int x){
        t1 = new Thread(this, ""+x);
        // arr will contain values of one row form array a
        arr = a;
        //t1.start();
    }
    @Override
    public void run(){
        for (int i=0; i<3; i++){
            rowSum+=arr[i];
        }
        System.out.println("Sum of row "+t1.getName()+" is "+rowSum);
    }
}
public class multiThreadMatrixSum {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread);
        int m,n, fsum = 0;
        int[][] a;
        System.out.println("Enter row x column size of matrix: ");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt(); n = sc.nextInt();
        a = new int[m][n];
        // take values as input
        for(int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                a[i][j]= sc.nextInt();
            }
        }
        
        // array of threads equal to number of rows
        MyThread[] t = new MyThread[m];
        // initialising individual threads
        for (int i=0; i<m; i++){
            t[i] = new MyThread(a[i],i+1);
            t[i].start();
            try{
                t[i].join();
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Final sum is: ");
        for (int i=0; i<m; i++){
            fsum+=t[i].rowSum;
        }
        System.out.println(fsum);
    }
}