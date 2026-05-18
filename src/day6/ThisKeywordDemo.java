package day6;

// There are two types of variables in java
    //  1. Class variable
    //  2. Local variable
    // There is no global variable as everything we need to define inside class

        //  this is a reference variable that refers to the current object of a class.


public class ThisKeywordDemo {
    int i,j;
    void display(int i, int j){
        this.i=i;
        this.j=j;
        System.out.println("i = "+ this.i);
        System.out.println("j = "+this.j);
    }

    public static void main(String[] args){
        ThisKeywordDemo demo = new ThisKeywordDemo();
        demo.display(10,20);
    }




}
