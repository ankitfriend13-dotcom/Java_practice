package Day4;

// Two dimensional array : values are stored in two dimension and can be extracted using row or column position


import java.sql.SQLOutput;

public class TwoDimensionalArray {
    public static void main(String[] args){
        // Approach 1
        int [][]a = new int[3][2];
        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 300;
        a[1][1] = 400;

        a[2][0] = 500;
        a[2][1] = 600;

        // Approach 2
        int b[][] = {
                {10,20},
                {30,40},
                {50,60},
        };

        // Finding size of two dimensional array
        System.out.println("length of a : " + a.length);
        System.out.println("length of columns :" + a[0].length);

        // Reading single value from a two-d array
        System.out.println("a[2][1] :" + a[2][1]);

        // for loop
        for(int i = 0; i < a.length; i++){
            for(int j =0; j < a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        // for each loop
        System.out.println("--- Using for each loop to print 2-D array ----");
        for(int r[]: b){
            for(int c : r){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
