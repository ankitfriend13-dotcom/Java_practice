package day1;

// There is a scanner class can be used to take input from user

import java.util.Scanner;

public class ReadingInputFromUser {

    public static void  main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the number ");
        int num = sc.nextInt();
        System.out.println("Taken integer input: " + num);
        float decNum = sc.nextFloat();
        System.out.println("Taken Float input : " + decNum);

        // When the value is unknown
        System.out.println("Enter any type of data : ");
        Object value = sc.next();
        // We can later change the value based on the data we got
        System.out.println("Type of data found : " + value.getClass().getName());

    }

}
