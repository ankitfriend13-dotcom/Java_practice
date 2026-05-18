package stringMethods;

import java.util.Arrays;

public class StringAnagram {

    public static void main(String[] args){

        String string1 = "CAT";
        String string2 = "act";


        // convert into small case or lower case

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        // Check the length og both strings

        if(string1.length() == string2.length()){

            // Way 1 : using Arrays.sort()

            char[] chA = string1.toCharArray();
            char[] chB = string2.toCharArray();

            Arrays.sort(chA);
            Arrays.sort(chB);
            if(Arrays.equals(chA, chB)){
                System.out.println("Anagram");
            }


            // Way 2 : using count[]

            int[] count = new int[26];
            for(int i = 0; i < string1.length(); i ++){
                count[string1.charAt(i) - 'a']++;
                count[string2.charAt(i) - 'a']--;
            }
            for(int c : count){
               if(c != 0){
                   System.out.println("Not anagram");
               }
            }




        }

    }
}
