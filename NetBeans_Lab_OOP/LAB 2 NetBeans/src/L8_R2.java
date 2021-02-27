/**
 * Areas of rectangle and triangle using abstract class 
 */
import java.util.Scanner;

abstract class Dim{
    Scanner sc = new Scanner(System.in);
    int a, b;
    // method to set dimensions of some 2D figures
    void setDim(int i, int j){
        a = i; b= j;
    }
    abstract double area();
}
class Rectangle extends Dim
{
    Rectangle(){
        System.out.print("Enter length and breadth of rectangle(seperated by space): ");
        // Setting the dimensions of rectangle using method of abstract class Dim
        setDim(sc.nextInt(), sc.nextInt());
    }
    // area has to implemented here because this class is extending an abstract class
    public double area(){
        // formula to calculate area of rectangle
        return a*b;
    }
}
class Triangle extends Dim
{
    Triangle(){
        System.out.print("Enter height and breadth of triangle(seperated by space): ");
        // Setting the dimensions of trinagle using method of abstract class Dim
        setDim(sc.nextInt(), sc.nextInt());
    }
    // area has to implemented here because this class is extending an abstract class
    public double area(){
        // formula to calculate area of triangle
        return (a*b)/2;
    }
}
public class L8_R2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to calculate the area of: ");
        System.out.println("1. Rectangle  2. Triangle");
        int x = sc.nextInt();
        if (x==1){
            Rectangle rect = new Rectangle();
            System.out.println("Area of the Rectangle is "+rect.area());
        }
        else {
            Triangle trn = new Triangle();
            System.out.println("Area of the Triangle is "+trn.area());
        }
    }
}
