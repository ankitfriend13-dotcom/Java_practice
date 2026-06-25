package streams;
import java.util.*;
/*
    A Stream is a sequence of elements that supports operations on data in a declarative way

    Collection -> Stream -> Operations -> Result

    A stream generally has 3 parts:
        Step 1: Source                      -- numbers.stream()
        Step 2: Intermediate Operations     -- .filter(...)
                                                .map(...)
        Step 3: Terminal Operation          -- .forEach(...)
 */

/*
    Stream methods :
    1. filter()
    2. map()
    3. collect()
    4. sorted()
    5. distinct()
    6. count()
    7. max()  min()

    7. limit()
    8. skip()
    9. findFirst()
    10. anyMatch()
    11. groupingBy()

 */

import Day4.Array;

import java.util.Arrays;

public class StreamTest {
    public static void main (String[] args) {
//        finding odd numbers :
//        filter()  -- .filter(condition)
        System.out.println("Odd number using stream");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.stream().
                filter(n -> n % 2 ==0).
                forEach(System.out::println);

        System.out.println("--- Max(), min() using stream");
        int max = numbers.stream()
                .max(Integer::compare).get();
        System.out.println("Max number :" + max);
    }

}
