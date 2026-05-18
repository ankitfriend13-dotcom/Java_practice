package Day4;

//  1. Bubble sort : Compare adjacent elements and sort if they are in wrong order
//  2. Selection sort : Select any smallest and put it at the beginning
//  3. Insertion sort : Pick one element at a time and insert in into correct position
//  3. Merge sort : Split into half and then sort each half and merge
//  4. Built in sort method : Arrays.sort(a) -- only used to sort in ascending order


import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){
        int a[] = {100,600,200,400,500};
        System.out.println("before sorting..");
        System.out.println(Arrays.toString(a));         // In-built util to print array
        Arrays.sort(a);
        System.out.println("After sorting...");
        System.out.println(Arrays.toString(a));

        // ---- Sorting strings---
        System.out.println("---- Sorting strings---");
        String s[] = {"A","C","B","D"};
        System.out.println("before sorting..");
        System.out.println(Arrays.toString(s));         // In-built util to print array
        Arrays.sort(s);
        System.out.println("After sorting...");
        System.out.println(Arrays.toString(s));

        // --- sorting string 2----
        System.out.println("---- Sorting strings 2---");
        String s1[] = {"scott","marry","john","david"};
        System.out.println("before sorting..");
        System.out.println(Arrays.toString(s1));         // In-built util to print array
        Arrays.sort(s1);
        System.out.println("After sorting...");
        System.out.println(Arrays.toString(s1));

    }
}
