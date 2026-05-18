package logicalQuestions;


import java.util.*;

// Write a program that finds duplicate characters in strings
//  String = harsh

public class StringDuplicateElements {


    public static void main(String[] args){

        String name = "harsh";

        char[] ar = name.toCharArray();
        for(int i =0; i< name.length(); i++){
            System.out.println(ar[i]);
            int count = 0;
            for(int j =i+1; j<name.length(); j++){
                if(ar[i] == ar[j]){
                    count += 1;
                }
            }
            if(count >= 1){
                System.out.println("Duplicate found for : " + ar[i]);
            }
        }

        // Approach 2
        String str = "programming";
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.add(c)) { // if already present
                duplicates.add(c);
            }
        }

        System.out.println("Duplicate characters: " + duplicates);

    }


}
