package day6;


// OOPS :
/*
    It’s a programming model based on the concept of objects and classes,
    which allows us to model real-world entities, make code more modular,
    reusable, and easier to maintain

 */
    // 1. class
    // 2. object
    // 3. Polymorphism
    // 4. Inheritance
    // 5. Encapsulation
    // 6. Data abstraction

// class -
    //  1. collection of attributes and behavior
    //  2. virtual entity / plan or blue print
    //  3. will not occupy space

// Object - Physical entities / all objects are derived from class
    //  1. Objects are instance of class / will be created using class
    //  2. Physical entities
    //  3. Occupy space in memory
    //  4. We can create N- objects for class

public class OopsConcept {
    int eid;
    String ename, job;
    int sal;

    void display(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);
    }

    public static void main(String[] args){
        OopsConcept op1 = new OopsConcept();
        op1.eid = 100;
        op1.sal = 5000;
        op1.ename= "Scott";
        op1.job = "Manger";
        op1.display();
    }
}
