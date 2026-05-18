package day6;

// wrapping up of data and methods into single unit is called Encapsulation
    // Rules :
    //  1. All variables should be private
    //  2. For every variables there should be 2 methods ( get and set)
    //  3. Variables can be accessed or operated only through methods

// Refer EncapsulationDemo2 for main method

public class EncapsulationDemo {
    private int accno;
    private String name;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    void setAccno(int accno){
        this.accno = accno;
    }

    int getAccno(){
        return accno;
    }

}


// In intellij or eclipse we can create setter and getter for all variables directly
// select all the variables and right click then generate setter and getter