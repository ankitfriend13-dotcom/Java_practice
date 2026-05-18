package Day7;

// We can pass arguments to main method :-
    // Open Run-config before run
    //  Put parameters into the parameter field

public class PassingArgumentMain {
    public static void main(String[] args){
        System.out.println("String length :" + args.length);

        for (String s : args){
            System.out.println(s);
        }
    }
}
