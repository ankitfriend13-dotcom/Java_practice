package day12;


// HashMap - derived interface - in this we store data in key : value pair
//  1. All the data should be same, we need to specific during deceleration
//  2. Data is stored in {Key : Value}
//  3. key is unique, but values can be duplicated
//  4. Insertion order is not preserved


import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){

        // Declaration
        HashMap<Integer, String> hm = new HashMap<Integer, String>();       // defining the data types
        // of key value is mandatory

        // way 2 :
        Map myMap = new HashMap();

        // Adding values :
        hm.put(101, "John");
        hm.put(102, "Scott");
        hm.put(103, "Mary");
        hm.put(104, "Scott");
        hm.put(105, "David");

        System.out.println("HashMap data : ");
        System.out.println(hm);
        System.out.println("Size of HashMap : " + hm.size());

        // Removing the pair
        hm.remove(102);
        System.out.println("updated hashmap after key : 102 is removed : " + hm);


        // Accessing value of the key
        System.out.println("Accessing Value :" + hm.get(101));

        // Getting all the keys from hashMap
        System.out.println("Getting all the keys from hashMap : " + hm.keySet());
        System.out.println("Getting all the values : " + hm.values());

        // Getting all the keys and values:
        System.out.println("Key : Value : " + hm.entrySet());


        // reading data from HashMap 1 by 1
        // for .. each
        for(int x :hm.keySet()){
            System.out.println("Values of " + x + " : " + hm.get(x));
        }


        Iterator<Map.Entry<Integer, String>> iterator = hm.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
