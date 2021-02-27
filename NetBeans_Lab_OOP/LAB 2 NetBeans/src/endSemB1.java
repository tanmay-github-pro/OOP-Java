/**
 * 
 * @author tanmay
 */
import java.util.Scanner;
class thread1 extends Thread{
    //Thread t1; 
    String[] strCheck;// = new String[100];
    String subs;
    static int ctr;
    thread1(String[] arr, String subs){
        //t1 = new Thread();
        
        this.strCheck = arr;
        this.subs = subs;
    }
    @Override
    public void run(){
        for(int i=0; i<strCheck.length; i++){
            if(strCheck[i].contains(subs)){
                ctr++;
            }
        }
        System.out.println("No of strings with substring");
        System.out.println(ctr);
    }
}
public class endSemB1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n; String str2;
        Thread mainThread = Thread.currentThread();
        System.out.println("How many strings do you want to enter:");
        n = sc.nextInt();
        System.out.println("Enter string values: ");
        String[] str = new String[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            
            str[i] = sc.nextLine();
            str2 = str[0].toString();
            
        }
        System.out.println("Enter a substring:");
        //sc.nextLine();
        String s = sc.nextLine();
        
        System.out.println("USer input over");
        for(int i=0; i<n; i++){
            System.out.println(str[i]);
        }
        System.out.println(s);
        thread1 th1 =new thread1(str,s);
        try{th1.start();}
        catch (Exception e){
            System.out.println(e);
        }
    }
}
