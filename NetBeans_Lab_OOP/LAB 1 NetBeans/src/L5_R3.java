/**
 * Time class with separate integer member 
 * for hours, minutes and seconds
 */
import java.util.Scanner;
class Time{
    int hours;
    int mins;
    int secs;
    Time(){
        this.hours=0;
        this.mins=0;
        this.secs=0;
    }
    Time(String s){
        this.hours=Integer.parseInt(s.substring(0,2));
        this.mins=Integer.parseInt(s.substring(3,5));
        this.secs=Integer.parseInt(s.substring(6,8));
    }
    void display(){
        System.out.println(this.hours+":"+this.mins+":"+this.secs);
    }

    void add(Time t1, Time t2){
        int s=t1.secs+t2.secs;
        int m=t1.mins+t2.mins;
        int h=t1.hours+t2.hours;
        this.secs=s%60;
        this.mins=(m+s/60)%60;
        this.hours=(h+m/60)%24;
    }
}

public class L5_R3{
    public static void main(String args[]){
        Time t1,t2,t3;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter time 1:");
        t1=new Time(sc.nextLine());
        System.out.print("Enter time 2:");
        t2=new Time(sc.nextLine());
        sc.close();
        t1.display();t2.display();
        t3= new Time();
        t3.add(t1,t2);
        t3.display();
    }
} 