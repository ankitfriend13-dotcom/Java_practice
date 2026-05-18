package Day4;

// searching in array :
//  1. Linear search : Searching the element one by one going through each indexes from 0 till n
//  2. Binary search : It is used to find element in a sorted array
//  3.


public class SearchingArray {

    public static void linearSearch(int[] a, int element){
        for(int i : a){
            if (i == element){
                System.out.println("Element found");
                break;
            }
        }
    }

    public static void main(String[] args){
        int a[] = {10,20,30,40,50}, search = 40;
        linearSearch(a, search);
    }
}

