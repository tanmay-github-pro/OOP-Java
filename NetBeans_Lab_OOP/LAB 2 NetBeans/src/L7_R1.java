/**
 * student record of college named “MIT”
 * Class Student_Detail members - name, id, college_name
 * display_details() method displays student details
 */
import java.util.Scanner;

class studentDetails
{
    String name;
    int id;
    String collegeName;
    
    studentDetails(){
        collegeName = "MIT";
    }
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("College: "+collegeName);
    }
    void getStudentDetails(int i){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of Student "+(i+1)+": ");
        name = sc.next();
        id = 1000*2020+(i*40)+20;
        //sc.close();
    }
}
public class L7_R1 {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of students: ");
        int n = sc.nextInt();
        studentDetails[] s = new studentDetails[n];
        for(int i=0; i<n; i++) {
            s[i] = new studentDetails();
            s[i].getStudentDetails(i);
        }
        System.out.println("Student details requested are as follows:");
        for (int i=0; i<n; i++) {
            s[i].displayDetails();
            System.out.println();
        }
        sc.close();
    }
}
