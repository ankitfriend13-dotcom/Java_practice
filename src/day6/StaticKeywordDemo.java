package day6;


// Static keyword : If a variable or method is used across all the objects with having same value

// Types :
    //  1. Static variable
    //  2. Static method
    //  3. Nested static class/ inner static class (only inner class can be defined as static)

//  >   Static variable has its own memory and doesn't require any object to declare its memory
//  >   Only one copy exists in memory, no matter how many objects are created.
//  > Static method/ main method can access any static variable/ method without creating any object
//  > Static method cann't access non-static variables directly, they need object to access non-static variables
//  >   Non-static methods can access anything (Static or non static)
//  > Static variable values can be changed by using any object or where it was defined
// > static method can be called directly by class name ex - ClassName.static_methodname()

public class StaticKeywordDemo {
    static int a = 10;          // Static variable
    int b = 20;                 // non- static variable
    static void m1(){
        System.out.println("This is static method ");
   //     System.out.println("Static and non- static variable : "+a + b);  cannt access directly need object
    }
    void m2() {
        System.out.println("This is non-static method ");
        System.out.println("Static and non- static variable : "+a + b);
    }

    public static void main(String[] args){
        System.out.println(a);      // As main is static we can directly call static variable
        m1();                       //   we can directly access m1() static method

        StaticKeywordDemo demo = new StaticKeywordDemo();
        demo.m2();
        demo.m1();

    }
}
