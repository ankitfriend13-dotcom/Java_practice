package day6;

// using class EncapsulationDemo for accessing the data and variables

import java.sql.SQLOutput;

public class EncapsulationDemo2 {

    public static void main(String[] args){
        EncapsulationDemo emp = new EncapsulationDemo();
       // emp.accno();   cannot access as the accno is private
        emp.setAccno(101);
        System.out.println("Created account :" + emp.getAccno());

    }

}
