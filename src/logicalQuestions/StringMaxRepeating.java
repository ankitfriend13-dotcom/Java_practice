package logicalQuestions;


//Write a program that finds maximum repeating character from the string

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringMaxRepeating {
    public static void main(String[] args){

        String text = "globant india";

        char[] ch = text.toCharArray();

        // Approach 1 : Just getting the max repeated number
        int max = 0;
        char maxChar = 0;
        for (char c : ch) {
            int count = 0;
            for (int i =0 ; i < text.length(); i ++){
                if (c == ch[i]){
                    count += 1;
                }
            }
            if (count > max){
                max = count;
                maxChar = c;
            }
        }
        System.out.println(maxChar + " " + max);




        // Approach 2 : using HashMap to print the max repeated characters along with value

        Map<Character,Integer> mp = new HashMap();
        int max2 = 0;
        char maxChar1 = 0;
        for (char c : ch) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (c == ch[i]) {
                    count += 1;
                }
                mp.put(c,count);
            }
        }
        System.out.println(mp);
        for(int count : mp.values()){
            if(count > max2){
                max = count;
            }
        }
        for(Map.Entry<Character, Integer> entry : mp.entrySet()){
            if (entry.getValue() > max){
                System.out.println(entry);
            }
        }



    }
}
