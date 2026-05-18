
// Data abstraction : Hiding the implementation and just showing the functionality
// Security and privacy

// Abstract class
// Interface

// Rules for interface:
// Variables are Static and final
// Methods - abstract/ but can also have static or default
// Methods are public
// Its contains only deceleration
// A class extends a class, class implements interface , an interface extends interface
// Supports multiple inheritance

interface Int1 {
    int xa = 100;
    int y = 200;
    void display();

    static void show(){
        System.out.println("This is a static method");
    }

    default void show2(){
        System.out.println("This is default method");
    }

}

public class Practice implements Int1{
    public void display(){
        System.out.println("This is interface method or abstract method");
    }
    public static void main(String[] args){

        Practice p1 = new Practice();
        p1.display();
        System.out.println("x : " + xa);
        System.out.println("y : " + y);
        Int1.show();
        p1.show2();
    }
}
