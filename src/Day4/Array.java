package Day4;

// Arrays : it is a collection of elements of same data types -- Homogeneous data
// Homogeneous data : Same type of data
// Heterogeneous data : Different types of data

// Types of array :
//      1. Single dimensional
//      2. Two dimensional
//      3. Multi- dimensional


// Single dimensional array :
//  1. Declare an array
//  2. Add values to array
//  3. Find the size of array
//  4. Read single value from an array
//  5. Read multiple values from an array


import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        // declaring array
        // Approach 1 : When we know the size of the array
        int a[] = new int[5];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;

        // Approach 2 : When we dont know the size of the array
        char b[] = {'a','b','c','d','e'};

        // finding length of an array
        System.out.println("Length of array a : " + a.length);

        // reading single value
        System.out.println("First data of array a[0] : " + a[0]);

        // reading multiple value
        for(int i = 0 ; i < a.length; i++){
            System.out.println(" a[" + i + "] : " + a[i]);
        }


        // enhanced for loop -- for..each loop
        for (int x : a){
            System.out.println(x);
        }

        // Using Arrays.toString() to print array
        System.out.println("Printed array using Arrays.toString() : " + Arrays.toString(a));
    }
}
