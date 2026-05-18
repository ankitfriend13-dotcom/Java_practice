package stringMethods;


import java.util.*;

public class StringConversion {
    public static void main(String[] args){


        // -- char[] to String---
        System.out.println("----- char[]  to String -----");
        char ch[] = { 'G', 'f', 'g' };

        String txt1 = new String(ch);
        System.out.println("char[] into String : " + txt1);

        // int to String --- valueOf() -- works with char, int, float, double
        System.out.println("------ int to String --- valueOf() -----");
        int a = 234;
        String t = String.valueOf(a);

//        --------- using toString() -----------------

        // PrimitiveDatatype.toString()     ---> converts any data type to String var
        System.out.println("---------converting any data type to String var --- .toString()-------");
        char c = 'a';
        String t2 = Character.toString(c);
        String t3 = Integer.toString(a);
        System.out.println("char and a conversion to String using PrimitiveDatatype.toString()");


        // Collections  -->     String
        System.out.println("---------converting any data type to String var --- .toString()-------");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        String text2 = list1.toString();
        System.out.println("ArrayList to String" + text2);

        // The final output still contains [] or {}
        // In-order to convert into proper we can use "String.join(",", list)

        String text3 = String.join(",", list1);
        System.out.println("O/P After using String.join() : " + text3);

        //   String.join()  -   X - not possible in map

        // For - loop and for..each for Strings

        System.out.println("----- For Loops and For .. each for String -----");

        String sentence = "I love Java programming";

        for(int i = 0; i < sentence.length(); i ++){
            System.out.print(sentence.charAt(i));
        }
        System.out.println();
        for(char c2 : sentence.toCharArray()){
            System.out.print(c2);
        }

        // Reverse a string using for- loop and StringBuffer
        System.out.println();
        for(int i = sentence.length()-1; i >= 0 ; i--){
            System.out.print(sentence.charAt(i));
        }

        // Reverse using String Buffer
        System.out.println();
        StringBuffer st = new StringBuffer(sentence);
        System.out.println("Reversed : " + st.reverse());

        //          OR
        String word = "Hello World";
        String newWord = new StringBuffer(word).reverse().toString();
        System.out.println("Reversed : " + newWord);



    }
}
