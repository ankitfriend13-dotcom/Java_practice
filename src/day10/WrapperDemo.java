package day10;

import java.util.*;
//      1. String ----> int, double, boolean, char
//      2. int, double, boolean, char ----> String

/*
        String      -->     int     Integer.parseInt(String value)
        String      -->     double
        String      -->     boolean
        String      -->     char        Not possible

        Any data(int,double,float,char,boolean)        -->     String  possible
 */


public class WrapperDemo {

    public static void main(String[] args){
        String price = "$100";
        String price2 = " 100.50";

        String price3 = price.replace("$","");
        System.out.println(price3);


        // Converting String to any data type

        int i = Integer.parseInt(price3);
        float f = Float.parseFloat(price2);


        // Converting all the data types into String
        int a = 10;
        double d = 10.5;
        char c = 'A';
        boolean bool = true;

        String s = String.valueOf(a);
        s = String.valueOf(d);
        s = String.valueOf(c);
        s = String.valueOf(bool);
            // All the data can be converted into String

        System.out.println();


        // Converting String to char[]
        String name = "john";
        char[] ch = name.toCharArray();


        // Comparing String to StringBuffer
        StringBuffer sh = new StringBuffer("john");

        if(name.equals(sh.toString())){
            System.out.println("matched");
        }


        // Comparing String with char[]

        char[] charArray = {'n','i','t','i','n'};
        String s2 = "nitin";

        if (s2.equals(new String(charArray))) {
            System.out.println("Match");
        } else {
            System.out.println("Not Match");
        }

        //ch.equals(s) this doesnt work  ❌ compares reference, not content



        // Array to ArrayList
        // either we can add each element one by one or
        String[] arr = {"a","b"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);

        // Converting ArrayList to Array[]
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");

        Object[] arr1 = list2.toArray();  // returns Object[]
        for (Object o : arr1) {
            System.out.println(o);
        }

        Iterator it = list2.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
