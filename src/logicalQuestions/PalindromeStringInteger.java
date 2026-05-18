package logicalQuestions;

import java.sql.SQLOutput;
import java.util.Arrays;

public class PalindromeStringInteger {
    public static void main(String[] args){

        // Write code to check if a String is a palindrome or not?
        String text = "nitin";

        // Approach 1 :
        char c[] = text.toCharArray();
        StringBuffer str = new StringBuffer();
        for(int i = c.length-1 ; i >= 0; i--){
            str.append(c[i]);
        }
        String strNew = str.toString();
        if(text.compareTo(strNew) == 0){
            System.out.println("Palindrome");
        }

        // Approach 2 : using in-built method of StringBuffer to reverse
        StringBuffer str2 = new StringBuffer(text);
        str2.reverse();
        if(str2.compareTo(new StringBuffer(text)) == 0){
            System.out.println("Palindrome");
        }

        // Approach 3 : use for loop and break the String into two parts and compare both parts
        boolean isPalindrome = true;
        for(int i = 0; i < text.length() / 2; i++) {
            if(text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not a palindrome");


//------------  Write code to check if a number is palindrome or not -------
        System.out.println("------------  Write code to check if a number is palindrome or not -------");
        int num = 1221;

        // Approach 1 :
        int originalNum = num, remainder = 0, updatedNum = 0;
        while(num > 0) {
            remainder = num % 10;
            num = num / 10;
            updatedNum = updatedNum * 10 + remainder;
        }
        if(originalNum == updatedNum){
            System.out.println("Palindrome");
        }

        // Approach 2 :
        int remain = 0, new_num = originalNum;
        StringBuffer str3 = new StringBuffer();
        StringBuffer str4 = new StringBuffer(String.valueOf(originalNum));
        while(new_num> 0){
            remain = new_num%10;
            new_num = new_num/10;
            str3.append(remain);
        }
        if (str4.compareTo(str3) == 0){
            System.out.println("Palindrome");
        }


    }
}
