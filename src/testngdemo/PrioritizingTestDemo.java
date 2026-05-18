package testngdemo;

// In testNg test cases are by default prioritize by alphabets

//          @Test(priority = 2)  -- this is how we define priority


// How to disable test case
//          @Test(priority = 2, enabled = false)  -- this is how we disabled the test case

import org.testng.annotations.Test;

public class PrioritizingTestDemo {
    @Test(priority = 1)
    void testOne(){
        System.out.println("This is test 1");
    }
    
    @Test(priority = 2)
    void testTwo(){
        System.out.println("This is test 2");
    }
    
    @Test(priority = 3,enabled = false)         // disabling this test case
    void testThree(){
        System.out.println("This is test 3");
    }
}
