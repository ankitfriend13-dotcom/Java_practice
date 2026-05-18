package testngdemo;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestcase {
    @Test(priority = 1)
    void setup(){
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void searchCustomer(){
        System.out.println("Searching for customer");
        Assert.fail();              // to fail this test case
    }

    @Test(priority = 4)
    void addCustomer(){
        System.out.println("Customer added");
    }
    @Test(priority = 5)
    void teardown(){
        System.out.println("Closing browser");
    }
}
