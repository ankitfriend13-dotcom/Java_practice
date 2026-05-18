package day10;


class Parent{
    String name = "John";
    void m1(){
        System.out.println("This is m1 from parent");
    }
}
class Child extends Parent{
    int id = 101;
    void m2(){
        System.out.println("This is m2 from child");
    }
}

public class TypeCastingObjects {
    public static void main(String[] args){

        Child c = new Child();
        System.out.println(c.name); // Parent
        c.m1();                     // Parent
        System.out.println(c.id);   // Child
        c.m2();                     // child

        // Upcasting
        Parent p = new Child();     // Parent class reference variable can always hold child class object
        // Child is smaller and Parent is higher hence its a Up casting

        // Down casting
        Parent p2 = new Parent();
        Child c2 = (Child) p2;
        System.out.println(c2.name);
        System.out.println(c2.id);



    }

}
