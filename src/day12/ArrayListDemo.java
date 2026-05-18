package day12;

import java.util.*;
//  ArrayList : is a class which is implemented List interface
    //  1. It allows heterogeneous data - any type of data/ object is allowed
    //  2. It follows indexing and insertion oder is preserved
    //  3. Duplicate    -   allowed
    //  4. Multiple Nulls   -   allowed

// Note ----- we can't store primitive type of data
// ArrayList can only hold object type of data


public class ArrayListDemo {
    public static void main(String[] args){

        // Declaration of ArrayList :
        // Way 1:
        ArrayList mylist = new ArrayList();

        // Way 2 :
        List mylist1 = new ArrayList();

        // Way 3 : If we want to store only one type of data : Integer
        ArrayList <Integer>mylist2 = new ArrayList<Integer>();

        // We can store Integer, String,
        ArrayList <String>mylist3 = new ArrayList<String>();
        // If we have employee class
//        ArrayList <Employee>mylist4 = new ArrayList<Employee>();

        // ---- Adding data into ArrayList
        System.out.println("Adding data into ArrayList :");
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("welcome");
        mylist.add('A');
        mylist.add(100);
        mylist.add(true);
        mylist.add(null);
        mylist.add(null);
        System.out.println("Data retried :" + mylist);
        System.out.println("Size of array list : " + mylist.size());

        // Removing element from ArrayList :
        System.out.println("Removed element : " + mylist.remove(4));
        System.out.println("After removing element : " + mylist);

        // Adding value at particular index
        mylist.add(1,"New Value");      // mylist.add(index,value)
        System.out.println("Updated list after adding value : " + mylist);

        // Modifying a value -- set(),
        mylist.set(2, 20.1);
        System.out.println("Updated ArrayList after replacing/ modifying : " + mylist);

        // Access a particular value from index     -   get()
        System.out.println("Fetched item from ArrayList : " + mylist.get(3));

        // Reading or accessing all the data one by one :
        // Approach 1 : Normal for loop
        System.out.println("---accessing all the data one by one using for loop : ---");
        for(int i = 0; i< mylist.size(); i++){
            System.out.println("mylist[" + i + "] : " + mylist.get(i));
        }

        // Approach 2 : Using enhanced for loop :
        System.out.println("---accessing all the data one by one using enhanced for loop : ---");
        for(Object x :mylist){          // x need to be an object type as the data can differ
            System.out.println(x);
        }

        // Approach 3 : Using iterator  -- all collections support this
        System.out.println("---accessing all the data one by one using iterator : ---");
        Iterator it = mylist.iterator();        // defining iterator type of variable
        // We use while() when dealing with iterator

        while (it.hasNext()){
            System.out.println(it.next());
        }

        // If Arraylist contains similar type of data we can define during iterator declaration
        Iterator <String>it2 = mylist.iterator();


        // Checking if ArrayList is empty or not -- isEmpty()
        System.out.println("Checking if ArrayList is empty : " +mylist.isEmpty());

        // Removing multiple elements from ArrayList -- list1.removeAll(list2)
        ArrayList mylist4 = new ArrayList();
        mylist4.add(20.1);
        System.out.println("Removed element : " + mylist4);
        mylist.removeAll(mylist4);
        System.out.println("New list : " + mylist);

        // Removing all the elements from ArrayList -- list.clear()
        mylist.clear();
        System.out.println("New ArrayList after everything is removed :" + mylist);


    }
}
