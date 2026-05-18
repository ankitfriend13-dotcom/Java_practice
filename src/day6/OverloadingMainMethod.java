package day6;

// Main method can also be overloaded

public class OverloadingMainMethod {
    void main(int x){
        System.out.println(x);
    }
    void main(String s){
        System.out.println(s);
    }
    void main(String s1, String s2){
        System.out.println(s1 + s2);
    }

    public static void main(String[] args){         // we are providing String array of arguments
        // All the mains can should be accessed through real main()
        OverloadingMainMethod ov = new OverloadingMainMethod();
        ov.main(1);
        ov.main("john");
        ov.main("Hello ","John");

    }
}

// Few pointers :
    //  Why we put String array : to get parameters from command line and those parameters we can use inside main()



