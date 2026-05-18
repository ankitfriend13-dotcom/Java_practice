package day12;

//HashSet : A class implement Set interface
//  1. Heterogeneous data
//  2. Insertion order is not preserved - Donot support index
//  3. Duplicate not allowed
//  4. Multiple nulls not allowed


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args){
        // Declaration
        // Way 1 :
        HashSet myset = new HashSet();

        // Way 2 :
        Set myset2 = new HashSet();

        // We can also define specific data types
        HashSet <String>myset3 = new HashSet<String>();

        myset.add(100);
        myset.add(20.5);
        myset.add("weclome");
        myset.add('A');
        myset.add(true);
        myset.add(null);
        myset.add(100);         // even if we provide duplicate but it will take only value
        myset.add(null);        // we added multiple null but it will take only one null


        System.out.println(myset);

        // removing element
        myset.remove(100);  // we directly specific value instead of index as we did in ArrayList
        System.out.println("After removing myset : " + myset);

        // Inserting element --- it is not possible as the order is not followed
        // so we cann't specific where we want to insert

        // Accessing specific element by defining index is not possible
        //---- we can do above by converting HashSet into ArrayList
        // Converting HashSet into ArrayList
        ArrayList a1 = new ArrayList(myset);
        System.out.println("Converted ArrayList : " + a1);
        System.out.println("Accessing ArrayList element at index 1 : " + a1.get(1));

        // Reading all elements using for... each
        // we cann't use normal for loop as there is no index

        System.out.println("----- Accessing elements one by one using for - each----");
        for (Object x : myset){
            System.out.println("myset : " + x);
        }

        // Using iterator to fetch all the elements from set
        System.out.println("----Using iterator to fetch all the elements from set ---");
        Iterator it = myset.iterator();
        while(it.hasNext()){
            System.out.println("myset : " + it.next());
        }




    }

}
