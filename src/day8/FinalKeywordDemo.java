package day8;

// Final Keyword :  Makes the value constant
    // Once assigned, a final variable cannot be changed.
// It is used to apply restrictions on variables, methods and classes

    // 1. Variables - values cann't be changed
    // 2. Method - cann't override the method // we can do overloading
    // 3. class - cann't inherit anymore - For example, Java's String class is final.

class Test {
    final int x = 100;
    final void m(){
        System.out.println("This is from Test method");
    }
}

class Test2 extends Test{

    //    void m(){                 // cann't override as the overriden method is final
//        System.out.println("This is from Test2 method");
//    }

}


public class FinalKeywordDemo {
    public static void main(String[] args){
        Test t = new Test();
//        t.x = 200;      // cann't assign
        System.out.println(t.x);

    }
}
