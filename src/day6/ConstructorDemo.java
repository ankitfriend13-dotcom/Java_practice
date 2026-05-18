package day6;

// Constructor :  Used to initialize objects when they are created
// They are automatically called at the time of object creation

// Rules for constructor :
    //  1. Constructor name should be same as classname
    //  2. It will never return any value
    //  3. We dont specify the void - no return type
    //  4. Can take any number of argument

// Types of constructor :
    //  1. Default
    //  2. Parameterized constructor


/*
    Default :

    public class ConstructorDemo {
    ConstructorDemo(){                          // Default constructor
        System.out.println("Constructor called");
    }

    public static void main(String[] args){
    ConstructorDemo cons1 = new ConstructorDemo();

    }
}

 */




public class ConstructorDemo {
    int id;
    String name;
    ConstructorDemo(int i, String n){               // Parameterized
        id = i;
        name = n;
        System.out.println("Constructor called");
    }

    public static void main(String[] args){
        ConstructorDemo cons = new ConstructorDemo(101, "john");
    }
}
