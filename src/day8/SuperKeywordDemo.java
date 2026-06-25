package day8;

// Super keyword : used to access overriden variable or method or parent class constructors

// Rules
    //  1. Super can be used to access prior parent class only
    //  2. Super keyword cann't be used in multiple inheritance or interface

        // 1. To invoke parent class methods: Used during overriding, exactly like you said (e.g., super.display()).
        // 2. To invoke parent class constructors: Using super() inside a child constructor.
                // This must be the very first statement in the constructor.
        // 3. To access parent class variables: If the child and parent have variables with the same name.

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
