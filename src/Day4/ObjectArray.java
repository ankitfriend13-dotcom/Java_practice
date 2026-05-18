package Day4;

// there is a way to store different types of data / heterogeneous data using object array

public class ObjectArray {
    public static void  main(String[] args){
        Object a[] = {100, 10.5, 'A', "Weclome"};

        for(Object i:a){
            System.out.println(i);
        }
    }
}
