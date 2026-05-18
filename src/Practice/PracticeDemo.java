package Practice;



public class PracticeDemo {
    void printNum(int num){
        for (int i = 0; i < num; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        PracticeDemo obj = new PracticeDemo();
        obj.printNum(5);
    }
}
