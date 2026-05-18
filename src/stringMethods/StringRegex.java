package stringMethods;


// Regular Expressions, commonly known as Regex
/*
            Methods:
            1. compile(String regex)                          -->>     Compiles a regex.
            2. matcher(CharSequence input)                   --->>    Creates a matcher to search a string.
            3. matches(String regex, CharSequence input)     --->>    Checks full-string match.
            4. split(CharSequence input)                    --->>>      Splits input based on the pattern.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {

    public static void main(String arg[]){
        String text = "welcome";


        //  .* → . matches any character, * means zero or more occurrences
        System.out.println("-------- Pattern.matches('geeks.*')------");
        System.out.println(Pattern.matches("geeks.","geeksA"));
        System.out.println(Pattern.matches("geeks.*","geeksForGeeks"));

        //  [0-9]+ → 0 to 9 digits after geeks
        System.out.println("-------- Pattern.matches('geeks[0-9]+')------");
        System.out.println(Pattern.matches("geeks[0-9]","geeks12"));
        System.out.println(Pattern.matches("geeks[0-9]","geeks6"));
        System.out.println(Pattern.matches("geeks[0-9]+","geeks12"));

        // [0-9] → one or more digits after geeks, rest .* take cares
        System.out.println("-------- Pattern.matches('geeks[0-9].*')------");
        System.out.println(Pattern.matches("geeks[0-9].*","geeks12Geeks"));

        // [a-z]    -> a to z single character
        System.out.println("-------- Pattern.matches('[a-z]')------");
        System.out.println(Pattern.matches("[a-z]", "g"));      // true
        System.out.println(Pattern.matches("[a-zA-Z]", "Gfg")); // false
        System.out.println(Pattern.matches("[A-Z][a-z]", "Gf"));
        // [a-zA-Z] -> one alphabet either upper or lower
        System.out.println(Pattern.matches("[a-zA-Z]+", "GfgTest")); // true

            //        Common Regex Patterns in Java

/*
                    .       -->      Any character
                    \d      -->      Digit [0-9]
                    \D      -->      Non-digit
                    \s      -->      Whitespace
                    \S      -->      Non-whitespace
                    \w      -->      Word character [a-zA-Z0-9_]
                    \W      -->      Non-word character
                    \b      -->      Word boundary
                    \B      -->      Non-word boundary
 */
        System.out.println("--------Common Regex Patterns  ------");
        System.out.println(Pattern.matches("\\d+", "1234")); // true
        System.out.println(Pattern.matches("\\D+", "1234")); // false
        System.out.println(Pattern.matches("\\D+", "Gfg"));  // true
        System.out.println(Pattern.matches("\\S+", "gfg"));  // true
        System.out.println(Pattern.matches("\\s+", "gf g c"));  // true

        // Pattern amd matcher
        /*
                text.find()     --->    looks for any substring
         */

        System.out.println("------- Use of pattern and matcher-----");
        String text2 = "geeksForGeeks";
        Pattern p = Pattern.compile("For");
        Matcher m = p.matcher(text2);

        if(m.find()){
            System.out.println("Match found");
        } else{
            System.out.println("Not found");
        }

    }

}
