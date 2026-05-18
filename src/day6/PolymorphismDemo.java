package day6;

// Polymorphism - one thing can have many forms
// This is achieved through "overloading"
// Overloading can be done to :
        //  1. Methods
        //  2. Constructors


// Method overloading
    //  Method name should be same
    //  Number of parameters, data types of parameters, or sequence of parameters can be changed

// Use of method overloading :

public class PolymorphismDemo {
    int i;
    PolymorphismDemo(){
        System.out.println("This is constructor 1");
    }

    PolymorphismDemo(int n){
        i = n;
        System.out.println("This is constructor " + n);
    }
    void display(){
        System.out.println("This is method () 1");
    }

    void display(String name){
        int i = this.i;
        System.out.println("This is method :" + i + name);
    }

    public static void main(String[] args){
        PolymorphismDemo poly = new PolymorphismDemo();
        poly.display();
        PolymorphismDemo poly2 = new PolymorphismDemo(2);
        poly2.display("Overloaded method");
    }
}

// Can we overload main method -

