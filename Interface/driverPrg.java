package Interface;

import java.util.Scanner;

import Interface.InterfaceTest.Area;
import Interface.InterfaceTest.Rectangle;
import Interface.InterfaceTest.Triangle;
public class driverPrg {
    public static void main(String[] args) {
        int b, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of Rectangle: ");
        b = sc.nextInt(); h = sc.nextInt();
        Area a = new Rectangle();
        Triangle tr = new Triangle();
        System.out.println("Area of Rectangle is: "+a.findArea(b, h));
        System.out.println("Enter the base and height of the Triangle: ");
        b = sc.nextInt(); h = sc.nextInt();
        sc.close();
        a = tr;
        System.out.println("Area of Triangle is: "+a.findArea(b, h));
    }
    
}