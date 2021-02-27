/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanma
 */
class A{
    int i = 10;
    void display(){
        System.out.println(i);
    }
}
class B extends A{
    int i = 20;
    void display(){
    System.out.println(i);
    }
}
public class test {
    public static void main(String[] args){
        A a = new B();
        System.out.println(a.i);
        a.display();
    }
}
