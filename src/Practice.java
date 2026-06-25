/*
    This : Its used to refer the class variable or variables referenced with an object
    Static keyword : variable, method and class can be named as static, which doesn't require object creation and can be accessed directly via class name
    > Static method can access static variable but when trying to access normal or non static variables it requires object creation
    > any method can access static method or variable
    Final : Final keyword act as constant when a variable is declared as final its value cann't be changed
    Super : Super keyword is mostly used during method overriding when we are try to access the overriden method
 */

class NewProgram {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("This display method is from parent class");
    }

}
