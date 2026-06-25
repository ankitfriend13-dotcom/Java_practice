package day5;


// Difference between String S = "welcome"  vs   String s = new String("welcome")


public class StringComparison {
    public static void  main(String[] args){
        String s = "welcome";
        String s2 = "welcome";
        String s1 = new String("welcome");          // this creates an object, s1 points to an object
        String s3 = new String("welcome");
        String s4 = s1;
        System.out.println(s == s2);        // allowed
        System.out.println(s == s1);        // returns false as we are comparing 'welcome' with an object
        // to compare s and s1 :
        System.out.println("s.equals(s1) : " + s.equals(s1));
        System.out.println("s1.equals(s3) " + s1.equals(s3));      // true
        System.out.println(s1 == s3);           // false, as the object of s1 and s3 are different
        System.out.println(s1 == s4);           // true, as we have stored s1 object into s4

    }
}
