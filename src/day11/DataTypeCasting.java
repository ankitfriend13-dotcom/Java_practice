package day11;

// Type Casting : Converting data from one type to another type
    //  1. Up casting / widening : converting Value from smaller -->  larger type
            // ex - int --> long
            //  float --> double

        // Upcasting is a automatic process, we can directly store int into long

    //  2. Down casting / narrowing : converting value from larger --> smaller type
            // ex - long --> int
public class DataTypeCasting {
    public static void main(String[] args){



        // Upcasting -
        System.out.println("----- Upcasting -----");
        int intValue = 100;
        long longValue = intValue;
        System.out.println(longValue);

        float floatValue = 10.5f;
        double doubleValue = floatValue;        // as double is a higher value we can assign it direclty
        System.out.println(doubleValue);


        // Down casting - we need to do it  manually
        long longValue2 = 1000;
        // we need to reduce the size of long and during that some data is get lost
        int intValue2 = (int)longValue2;
        System.out.println("Down casted long into int :" + intValue2);

        double doubleValue2 = 125.55;
        float floatValue2 = (float)doubleValue2;
        System.out.println("Down casted double value into float : " + floatValue2);

        // Example 1 :
        int i = 100;
        double d = i;   // we can do directly as double is bigger

        // Example 2 :
        double d2 = 10.5;
        int j = (int)d2;        // it will print 10 as 0.5 will be lost during down casting



    }

}
