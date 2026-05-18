package stringMethods;

public class StringPalindrome {
    public static void main(String[] args){
        String str2 = "nitin";


        // Way 1 : Reverse using for loop

        String st = "";
        for (int i = str2.length() -1 ; i >=0 ;i--){
            st = st + str2.charAt(i);
        }
        System.out.println(st);
        if(st.matches(str2)){
            System.out.println("Palindrome");
        }

        // Way 2 : Running two indexes from each end and comparing
        int j = 0,k = str2.length()-1;
        boolean val = false;
        while(j < str2.length()){
            if (str2.charAt(j) == str2.charAt(k) ){
                val = true;
            }
            k--;
            j++;
        }
        if(val){
            System.out.println("Palindrome");
        }

        // Way 3 : Reverse using StringBuffer or StringBuilder
        StringBuffer sb = new StringBuffer(str2);
        sb.reverse();
        if (st.contains(sb)){
            System.out.println("Palindrome");
        }

    }
}
