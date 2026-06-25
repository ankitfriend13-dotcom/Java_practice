package streams;

import java.util.*;
import java.util.stream.Collectors;

// .map(element -> transformedValue)

/*
        Difference between filter() and map()
         filter() -> removes elements
         map() -> changes elements
 */
public class StreamMethods {
    public static void main(String[] args) {
//        Convert names to uppercase
        System.out.println("---- String arrays to uppercase");
        List<String> names = Arrays.asList("john", "Randy", "BigShow");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
// square all numbers
        System.out.println("--- Square all number");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        nums.stream()
                .map(n -> n * n)
                .forEach(System.out::println);



        // ------------- collect()-------------------
        /*
                Convert stream result back into a collection.
                so if we need to store the value we use collect
         */

        List<Integer> sqaure =nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Stored value :" + sqaure);

        System.out.println("----- getting even number using stream and storing into variable");

        List<Integer> even = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even number via list and storing into var :" + even);

        // Storing or collecting value into set
        System.out.println("--- storing or using collect into Set : ");
        Set<Integer> evenSet = nums.stream()
                .filter(n -> n % 2 == 10)
                .collect(Collectors.toSet());
        System.out.println("Storing value using collect into set :" + evenSet);


        System.out.println("------------ min() and max()-----------");
//        min() and max() operations
        int maxNum = nums.stream()
                .max(Integer::compare)
                .get();
        System.out.println("Max number found :" + maxNum);

        System.out.println("-- min() ---");
        int minNum = nums.stream()
                .min(Integer::compare)
                .get();
        System.out.println("Minimum number :" + minNum);


//        ------ Combine everything
//        Find the maximum square of even numbers

        int maxNum2 = nums.stream()
                .filter(n -> n%2 == 0)
                .map(n-> n *n)
                .max(Integer::compare)
                .get();
        System.out.println("Maximum square of even number :" + maxNum2);
    }
}
