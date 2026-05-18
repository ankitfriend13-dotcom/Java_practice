package day8;

// Super keyword : used to access overriden variable or method

// Rules
    //  1. Super can be used to access prior parent class only
    //  2. Super keyword cann't be used in multiple inheritance or interface

class C1 {
    int x = 100;

    void m1() {
        System.out.println("This method is from C1");
    }
}

class C2 extends C1{
        int x = 200;
        @Override
        void m1(){
            System.out.println("Parent class overriden");
            System.out.println("This method is from child class");
            System.out.println("value of child class :" + x);
            System.out.println("Value of parent class : " + super.x);
        }

        void m2(){
            super.m1();
        }
}

public class SuperKeywordDemo {
    public static void main(String[] args){
        C2 demo = new C2();
        System.out.println(demo.x);     // access child class variable
        demo.m1();          // accessing x value of parent through m1() of child class
        demo.m2();          // accessing m1() of parent through m2() of child class

    }
}
