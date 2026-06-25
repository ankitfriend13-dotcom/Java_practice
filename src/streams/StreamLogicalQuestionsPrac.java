package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamLogicalQuestionsPrac {
    public static void main(String[] args) {

//        Find all the odd number from List of arrays

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("-------- Finding odd number of list of arrays");
        List<Integer> oddNum = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Odd numbers are " + oddNum);

//        Convert all names to uppercase.
        List<String> names = Arrays.asList("john", "randy", "brock", "tripple", "rey");
        List<String> namesInUpper = names.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Names in upper case :" + namesInUpper);


//        Find shortest string in a list.
        String shortestName = names.stream()
                .min(Comparator.comparing(String::length))
                .get();
        System.out.println("Shortest name :" + shortestName);


//        Count Numbers Greater Than 10
        List<Integer> numbers = Arrays.asList(5, 15, 20, 8, 25);
        List<Integer> greaterThanTen = numbers.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());

        System.out.println("Numbers greater than 10 are : " + greaterThanTen);


//        Remove Duplicate Numbers
        List<Integer> num1 = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
        List<Integer> distinctNum = num1.stream()
                .distinct().collect(Collectors.toList());
        System.out.println("Distinct numbers are :" + distinctNum);


//        Find Names Starting with "A"
        List<String> names2 = Arrays.asList("Harsh", "Aman", "Ananad", "Raj");
        List<String> namesWithA = names2.stream()
                .filter(n -> n.charAt(0) == 'A')
                .collect(Collectors.toList());
        System.out.println("Names starting with A :" + namesWithA);


//        First Non-Repeated Character
        String text = "swiss";
        char[] texts = text.toCharArray();

        Character nonRepeatedChar = text.chars()        // converts string to ASCII values 115 119 105 115 115
                .mapToObj(c -> (char) c)    // converts int into characters -> [s, w, i, s, s]
                .collect(Collectors.groupingBy(         // grouping each characters
                        Function.identity(),            // this helps in grouping c --> c
                        LinkedHashMap:: new,            // Why linkedHas as it preserves the insertion order
                        Collectors.counting()))   // count the occurrences of each characters {s=3,w=1,i=1}
                .entrySet()
                .stream()                       // converting map to stream
                .filter(entry -> entry.getValue() == 1) // keep only not repeated characters
                .map(Map.Entry::getKey)     // fetch the characters
                .findFirst()    // find the first character
                .orElse(null);

    }
}
