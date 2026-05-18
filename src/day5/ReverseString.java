package day5;


public class ReverseString {
    public static void main(String[] args)
    {
        String s = "welcome";
        String rev = "";
        // Approach 1
        for(int i = s.length()-1; i >= 0;i--){
            System.out.println(s.charAt(i));
            rev = rev + s.charAt(i);
        }
        System.out.println("Reversed string : " + rev);

        // Approach 2
        System.out.println("Approach 2");
        // convert the String into char of array
        String rev1 = "";
        char a[] = s.toCharArray();
        for (int i = a.length-1 ; i >= 0 ; i--){
            System.out.println(a[i]);
            rev = rev + a[i];
        }
        System.out.println("New string :" + rev);

        // Approach 3 --- built in methods - StringBuffer and StringBuilder class
        // String -- immutable
        // StringBuffer  -- mutable
        // StringBuilder  -- mutable
//    StringBuffer s2 = new StringBuffer(s);        -- Cannt do it as the StringBuffer is mutable and String is immutable
        System.out.println("Using StringBuffer");
        StringBuffer s2 = new StringBuffer("welcome");
        System.out.println(s2.reverse());

        // Some more methods for StringBuffer and StringBuilder
        // 1. s1.append()
        // 2. s1.reverse()
        // 3. s1.insert()
        // 4. s1.delete()



    }





}
