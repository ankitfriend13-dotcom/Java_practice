package day9;

// Interface : Its a blue print of class

/*
    1.  Variables declared inside interface are static and final variables y default
    2.  It contains abstract methods ( also allowed static/ default methods from java8)
    3.  Abstract method - contains signature but no body (un-implemented method)
    4.  Method of interface are public
    5.  It supports multiple inheritance
    6.  We can define interface with interface keyword
    7.  A class 'extends' a class, an interface 'extends' another interface, but a class 'implements' interface
    8.  We can create Object reference to interface but cann't instantiate interface
 */
// Real based scenarios when to use interface
/*
    During initial state of project only requirements are present, there is no design
    so we will create abstract methods and variables based on requirement and,
     the logic or implementations of methods are done after the design is clear
 */
interface Shape {
    int length = 10;                // This is final and static both as the font as changed to italic
    int width = 20;

    void circle();          // Abstract method - has public access modifier
    default void square(){
        System.out.println("This is a square");     // Default method - hence implementation is allowed
    }
    static void rectangle(){                // Static - Hence can be implemented
        System.out.println("This is rectangle");
    }

}

public class InterfaceDemo implements Shape{

    public void circle(){               // We need to specific the parent access modifier,
                            // if no access modifier is mentioned then the method is default
        System.out.println("This is a circle");
    }

    void triangle(){
        System.out.println("this is triangle");
    }

    public static void main(String[] args){
            InterfaceDemo demo = new InterfaceDemo();
            demo.circle();
            demo.square();
            Shape.rectangle();  // as the method is static and mentioned into the interface/ another class,
                            // hence we need to mentioned the interface name

            // If rectangle() was created inside same class 'InterfaceDemo', then we can call directly

        // Concept 2:
        //  We can create Object reference to interface but cann't instantiate interface
        Shape sh = new InterfaceDemo(); // we can create the object reference but cann't create object of interface

        sh.circle();
        sh.square();
        Shape.rectangle(); // we dont need object to access the static method,
        // hence used class name directly to access static method


//        sh.triangle();      As triangle() is not defined in interface 'Shape' hence we cannt access,
        // even though the 'sh' is created through 'InterfaceDemo'


        // Access variables
        System.out.println(Shape.length * Shape.width); // we can access static variables directly


    }

}
