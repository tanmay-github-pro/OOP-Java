/**
 * Enter Student’s Name, Roll Number and Marks in three subjects 
 * Find percentage, grade and handle NumberFormatException 
 */
import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    int marks[]= new int[3];
    double percent;
    char grade;
    Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter marks in subject1(out of 100): ");
        marks[0] = sc.nextInt();
        System.out.print("Enter marks in subject2(out of 100): ");
        marks[1] = sc.nextInt();
        System.out.print("Enter marks in subject3(out of 100): ");
        marks[2] = sc.nextInt();
    }
    void calulate(){
        percent=(marks[0]+marks[1]+marks[2])/3;
        grade=percent>40?'P':'F';
    }
    void display(){
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("RollNo: "+rollNo);
        System.out.println("Percentage: "+percent+"%");
        System.out.println("Grade: "+grade);
    }
}

public class L10_R9{
    public static void main(String args[]){
        try{
            Student s= new Student();
            s.calulate();
            s.display();
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Number Provided");
        }
    }
}
