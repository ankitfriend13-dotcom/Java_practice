package day9;

// Multiple inheritance
/*
        InterfaceImplement2  --> implements (Inter1,Inter2)
 */


// Hybrid inheritance -
/*
        InterfaceImplement2  --> extends ClassC2
        InterfaceImplement2  --> implements (Inter1,Inter2)
 */

public class InterfaceImplement2 extends ClassC2 implements Inter1,Inter2 {

    public void m1() {
        System.out.println(x);

    }

    public void m2() {
        System.out.println(y);
    }

    public static  void main(String[] args){
        InterfaceImplement2 demo2 = new InterfaceImplement2();
        demo2.m1();
        demo2.m2();
        demo2.m3();
    }
}
