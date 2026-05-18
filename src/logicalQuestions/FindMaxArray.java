package logicalQuestions;

//Write a program that find max number from array

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FindMaxArray {
    public static void main(String[] args){
        int a[] = {5,1,2,7,6,3,4,9};

        // Approach 1 : using in-built
        System.out.println(Arrays.stream(a).max());

        // Approach 2 :
        int max = a[0];
        for(int x : a){
            if(x > max){
                max = x;
            }
        }
        System.out.println("Max : " + max);

        // Approach 3 : using Array.sort()
        // Need to convert int into Integer
        Integer[] a_new = Arrays.stream(a).boxed().toArray(Integer[]::new);

        Arrays.sort(a_new);
        System.out.println("max is : " + a_new[7]);


//--------        Write a program to find the second max from an array -----
        System.out.println("-------- Write a program to find the second max from an array -----");
        int ar[] = {15, 20, 2, 7, 6, 3, 4, 9 };

        // Approach 1 : find the first max and then check the second should be max by less than first max

        int firstMax =ar[0], secondMax = ar[1];

        for(int x : ar){
            if(x > firstMax){
                secondMax = firstMax;
                firstMax = x;
            }
        }
        System.out.println("Second max : " + secondMax);

        // Approach 2 : use Arrays.sort() to sort then return the second element
        // Need to convert int into Integer
        Integer[] ar_new = Arrays.stream(ar).boxed().toArray(Integer[]::new);

        Arrays.sort(ar_new);
        System.out.println("Second max : " + ar_new[6]);

        // using reverse order
    //  Arrays.sort(ar, Collections.reverseOrder());

        Arrays.sort(ar_new, Collections.reverseOrder());
        System.out.println("Second max : " + ar_new[1]);


    }
}
