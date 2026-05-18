package day8;


// overriding
    // Creating the same method into the child class with different implementation is called overriding

    // Rules :
    //  1. Shouldn't change the declaration : name, return type, arguments all should be same


    // Annotation : @override
    // indicate that a method is overriding a parent class or interface method
    // it improves readability and lets the compiler catch mistakes early.


class A{
    void display(){
        System.out.println("This method is inside parent class");
    }
}

class B extends A {
    void display(){
        System.out.println("This method is overriden inside child class");
    }
}
public class MethodOverridingDemo {

    public static void main(String[] args){
        B demo = new B();
        demo.display();

        // calling older method
        A demo1 = new A();
        demo1.display();
    }
}
