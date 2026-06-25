public class program2 extends NewProgram{
    public void display() {
        System.out.println("This method overrides the parent display method");
    }
    public static void main(String[] args) {
       program2 obj = new program2();
       obj.setName("John");
        System.out.println(obj.getName());
        obj.display();
    }
}
